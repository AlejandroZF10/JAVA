package jdomvalidator;

import java.io.*;
import java.util.*;
import org.w3c.dom.*;
import org.xml.sax.*;
import javax.xml.parsers.*;

public class JDOMValidator {
    static ArrayList<File> files = new ArrayList<>();
    
    public static void listFolder(File carpeta){ //Función para listar los archivos
        for(File fichero: carpeta.listFiles()) {
            if(fichero.isDirectory()) //El archivo, es un directorio. Se llama a la función recursivamente.
                listFolder(fichero);
            else //Es un archivo. Se agrega al ArrayList.
                files.add(fichero);     
        }
    }

    public static String readXML(String read, String path){ //Función para leer el archivo XML
        try{
            File file = new File(path);
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(file);
            document.getDocumentElement().normalize();
            read = getDataAttribute("cfdi:Comprobante","Serie",document); //Solicitud del atributo requerido.
            read += "\t"+getDataAttribute("cfdi:Comprobante","Folio",document);
            read += "\t"+getDataAttribute("cfdi:Comprobante","TipoDeComprobante",document);
            read += "\t"+getDataAttribute("cfdi:Emisor","Rfc",document);
            read += "\t"+getDataAttribute("cfdi:Emisor","Nombre",document);
            read += "\t"+getDataAttribute("cfdi:Receptor","Rfc",document);
            read += "\t"+getDataAttribute("cfdi:Receptor","Nombre",document);
            read += "\t"+getDataAttribute("tfd:TimbreFiscalDigital","FechaTimbrado",document);
            read += "\t"+getDataAttribute("tfd:TimbreFiscalDigital","UUID",document)+"\n";
        }catch(ParserConfigurationException | IOException | SAXException ex){
            System.out.println(ex.getMessage());
        }
        return read;
    }
    
    public static String getDataAttribute(String nodeName , String fieldName , Document document){ //Función para obtener el atributo requerido.
        String attribute = "";
        NodeList list = document.getElementsByTagName(nodeName); //NodeName indica el Nodo donde se encuentra el atributo.
        for(int i = 0; i<list.getLength() ;i++){
            Node node = list.item(i);
            if(node.getNodeType() == Node.ELEMENT_NODE){
                Element element = (Element)node;
                attribute = element.getAttribute(fieldName); //FieldName indica el atributo solicitado.
            }
        }
        return attribute;
    }
    
    public static void writeFile(String text){ //Función para generar el archivo .txt
        try(FileWriter myWriter = new FileWriter("salida/Reporte.txt")){ //Se almacena en la carpeta "salida". Esta se encuentra, dentro de la carpeta del Proyecto.
            myWriter.write(text);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void main(String[] args) {
        String textFile = "I\tSERIE\tFOLIO\tTIPO_DE_COMPROBANTE\tRFC_EMISOR\tNOMBRE_EMISOR\tRFC_RECEPTOR\tNOMBRE_RECEPTOR\tFECHA_DE_TIMBRADO\tUUID\n";
        File carpeta = new File("entrada/"); //Se especifica la carpeta donde se encuentran los archivos .XML. Esta se encuentra, dentro de la carpeta del Proyecto.
        listFolder(carpeta); 
        System.out.println("Reading XML files inside the folder...");
        for(int i = 0; i<files.size() ;i++){
            textFile += (i+1)+"\t"+readXML(textFile,files.get(i).getPath());
            System.out.println("Reading XML files "+(i+1));
        }
        writeFile(textFile);
    }
}