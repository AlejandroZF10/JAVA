package Documentos;

import com.google.zxing.WriterException;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import javax.imageio.ImageIO;

public class PDFReport extends PdfPageEventHelper{
    private final XMLFile file;

    public PDFReport(XMLFile file) {
        this.file = file;
    }
    
    public void createReport(){
        try {
            //Creación del documento y características generales.
            OutputStream fos = new FileOutputStream(new File("salida/"+file.getNamefile()+".pdf"));
            Document document = new Document(); 
            PdfWriter pdfWriter = PdfWriter.getInstance(document, fos);
            Rectangle rectangle = new Rectangle(300,30,550,800);
            pdfWriter.setBoxSize("rectangle", rectangle);
            HeaderAndFooter headerAndFooter = new HeaderAndFooter(file);
            pdfWriter.setPageEvent(headerAndFooter);
            document.setMargins(20,20,75,60);
            document.open();
            
            //Datos fijos que únicamente aparecen en la primera página.
            document.add(new Paragraph("\n"));
            document.add(clientHeader()); //Datos del cliente.
            document.add(payHeader()); //Condiciones de pago.
            document.add(periodoHeader()); //Periodo de facturación.
            document.add(new Paragraph("\n"));
            //Fin de datos fijos que únicamente aparecen en la primera página.
            
            concepts(document,0); //Tabla de conceptos y nuevas páginas.
            document.add(new Paragraph("\n\n"));
            document.add(total()); //Impuestos y total.
            
            document.newPage();
            document.add(observations()); //Observaciones del document.
            document.add(new Paragraph("\n\n\n"));
            document.add(timbre()); //Timbre fiscal.
            writeFooterTable(pdfWriter,document,bottom());
            document.close();
        } catch (DocumentException | FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (IOException | WriterException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public PdfPTable clientHeader() throws DocumentException{ //Datos del Cliente
        //Obtención y declaración de campos y etiquetas de los datos del archivo xml.
        String label[] = {"CLIENTE:","RFC:","DOMICILIO FISCAL:","ENTREGAR A:"};
        String field[] = {file.getCliente(),file.getClientRFC(),file.getDomicilioFis(),file.getEntregaA()};
        //Declaración y configuracuón inicial de la tabla.
        PdfPTable header = new PdfPTable(2);
        header.setTotalWidth(new float[]{20,80});
        header.setWidthPercentage(100);
        header.getDefaultCell().setBorder(0);
        for(int i = 0; i<4 ;i++){
            //pdfCell es el lado de la etiqueta.
            Font boldFont = new Font(Font.FontFamily.HELVETICA,6,Font.BOLD);
            boldFont.setColor(73,206,252);
            PdfPCell pdfCell = new PdfPCell(new Phrase(label[i],boldFont));
            pdfCell.setBorder(0);
            pdfCell.setHorizontalAlignment(Element.ALIGN_LEFT);
            header.addCell(pdfCell);
            //pdfCell1 es el campo leído del xml.
            Font boldFont1 = new Font(Font.FontFamily.HELVETICA,6,Font.NORMAL);
            PdfPCell pdfCell1 = new PdfPCell(new Phrase(field[i],boldFont1));
            pdfCell1.setBorder(2);
            pdfCell1.setBorderColor(BaseColor.GRAY);
            pdfCell1.setHorizontalAlignment(Element.ALIGN_LEFT);
            header.addCell(pdfCell1);
        }
        return header;
    }
    
    public PdfPTable payHeader() throws DocumentException{ //Características del pago.
        //Obtención y declaración de campos y etiquetas de los datos del archivo xml.
        String label[] = {"Condiciones De Pago:","Forma de Pago:","Método de Pago:","Tipo Relación:","UUID Relacionado:","USO CFDI:","Tipo Moneda:"};
        String label1[] = {"Contrato:","Fianza:","Casa Afianzadora:","Número de Proveedor:","Número de Remisión:","Núm. De Pedido:","Tipo Cambio:"};
        String field[] = {file.getPagoCond(),file.getPagoForma(),file.getPagoMeth(),file.getTipoRel(),file.getUuidRel(),file.getCfdiUso(),file.getMonedaTipo()};
        String field1[] = {file.getContrato(),file.getFianza(),file.getCasaAfin(),file.getNoProvee(),file.getNoRemision(),file.getNoPedido(),file.getCambioTipo()};
        //Declaración y configuracuón inicial de la tabla.
        PdfPTable header = new PdfPTable(4);
        header.setTotalWidth(new float[]{20,30,20,30});
        header.setWidthPercentage(100);
        header.getDefaultCell().setBorder(0);
        for(int i = 0; i<7 ;i++){
            //pdfCell es el lado de la etiqueta.
            Font boldFont = new Font(Font.FontFamily.HELVETICA,6,Font.BOLD);
            boldFont.setColor(46,121,236);
            PdfPCell pdfCell = new PdfPCell(new Phrase(label[i],boldFont));
            pdfCell.setBorder(0);
            pdfCell.setHorizontalAlignment(Element.ALIGN_LEFT);
            header.addCell(pdfCell);
            //pdfCell1 es el campo leído del xml.
            Font boldFont1 = new Font(Font.FontFamily.HELVETICA,6,Font.NORMAL);
            PdfPCell pdfCell1 = new PdfPCell(new Phrase(field[i],boldFont1));
            pdfCell1.setBorder(2);
            pdfCell1.setBorderColor(BaseColor.GRAY);
            pdfCell1.setHorizontalAlignment(Element.ALIGN_LEFT);
            header.addCell(pdfCell1);
            //pdfCell2 es el lado de la etiqueta.
            PdfPCell pdfCell2 = new PdfPCell(new Phrase(label1[i],boldFont));
            pdfCell2.setBorder(0);
            pdfCell2.setHorizontalAlignment(Element.ALIGN_LEFT);
            header.addCell(pdfCell2);
            //pdfCell3 es el campo leído del xml.
            PdfPCell pdfCell3 = new PdfPCell(new Phrase(field1[i],boldFont1));
            pdfCell3.setBorder(2);
            pdfCell3.setBorderColor(BaseColor.GRAY);
            pdfCell3.setHorizontalAlignment(Element.ALIGN_LEFT);
            header.addCell(pdfCell3);
        }
        return header;
    }
    
    public PdfPTable periodoHeader() throws DocumentException{
        //Declaración y configuracuón inicial de la tabla.
        PdfPTable header = new PdfPTable(2);
        header.setTotalWidth(new float[]{20,80});
        header.setWidthPercentage(100);
        header.getDefaultCell().setBorder(0);
        //pdfCell es el lado de la etiqueta.
        Font boldFont = new Font(Font.FontFamily.HELVETICA,6,Font.BOLD);
        boldFont.setColor(46,121,236);
        PdfPCell pdfCell = new PdfPCell(new Phrase("Periodo de Facturación:",boldFont));
        pdfCell.setBorder(0);
        pdfCell.setHorizontalAlignment(Element.ALIGN_LEFT);
        header.addCell(pdfCell);
        //pdfCell1 es el campo leído del xml.
        Font boldFont1 = new Font(Font.FontFamily.HELVETICA,6,Font.NORMAL);
        PdfPCell pdfCell1 = new PdfPCell(new Phrase(file.getPeriodoFac(),boldFont1));
        pdfCell1.setBorder(2);
        pdfCell1.setBorderColor(BaseColor.GRAY);
        pdfCell1.setHorizontalAlignment(Element.ALIGN_LEFT);
        header.addCell(pdfCell1);
        return header;
    }
    
    public void concepts(Document document,int index) throws DocumentException, BadElementException, IOException{
        //Declaración y configuracuón inicial de la tabla.
        PdfPTable header = new PdfPTable(10);
        header.setTotalWidth(new float[]{10,18,55,10,8,10,8,10,12,10});
        header.setWidthPercentage(100);
        
        //Creación de la cabecera y declaración de los campos.
        Font fontHeader = new Font(Font.FontFamily.HELVETICA,6,Font.NORMAL);
        fontHeader.setColor(42, 177, 185);
        PdfPCell pdfCell = new PdfPCell(new Phrase("CÓDIGO",fontHeader));
        pdfCell.setHorizontalAlignment(Element.ALIGN_CENTER);
        pdfCell.setBorderWidthLeft(1); pdfCell.setBorderWidthRight(0);
        pdfCell.setBorderWidthTop(1); pdfCell.setBorderWidthBottom(1);
        pdfCell.setBorderColor(BaseColor.GRAY);
        header.addCell(pdfCell); pdfCell.setPhrase(new Phrase("LOTE/CADUCIDAD",fontHeader));
        header.addCell(pdfCell); pdfCell.setPhrase(new Phrase("DESCRIPCIÓN",fontHeader));
        header.addCell(pdfCell); pdfCell.setPhrase(new Phrase("CANTIDAD",fontHeader));
        header.addCell(pdfCell); pdfCell.setPhrase(new Phrase("CLAVE UNIDAD",fontHeader));
        header.addCell(pdfCell); pdfCell.setPhrase(new Phrase("CLAVE SERV O PROD.",fontHeader));
        header.addCell(pdfCell); pdfCell.setPhrase(new Phrase("U.M",fontHeader));
        header.addCell(pdfCell); pdfCell.setPhrase(new Phrase("PRECIO UNITARIO",fontHeader));
        header.addCell(pdfCell); pdfCell.setPhrase(new Phrase("DESCUENTO",fontHeader));
        header.addCell(pdfCell); 
        PdfPCell pdfCellH = new PdfPCell(new Phrase("PRECIO TOTAL",fontHeader));
        pdfCellH.setHorizontalAlignment(Element.ALIGN_CENTER);
        pdfCellH.setBorderColor(BaseColor.GRAY);
        pdfCellH.setBorderWidthLeft(1); pdfCellH.setBorderWidthRight(1);
        pdfCellH.setBorderWidthTop(1); pdfCellH.setBorderWidthBottom(1);
        header.addCell(pdfCellH);
        header.setHeaderRows(1);
        //Fin de la creación de la cabecera.
        
        //Inicio de creación de los conceptos.
        for(int i = index; i<file.getProductos().size() ;i++){ //Creción de la tabla
            Font boldFont1 = new Font(Font.FontFamily.HELVETICA,5,Font.NORMAL);
            PdfPCell pdfCellT1 = new PdfPCell(new Phrase(file.getProductos().get(i).getCodigo(),boldFont1));
            pdfCellT1.setHorizontalAlignment(Element.ALIGN_LEFT); 
            pdfCellT1.setBorderWidthLeft(1); pdfCellT1.setBorderWidthRight(0);
            pdfCellT1.setBorderWidthTop(0); pdfCellT1.setBorderWidthBottom((i == file.getProductos().size()-1)?1:0);
            pdfCellT1.setBorderColor(BaseColor.GRAY);
            header.addCell(pdfCellT1); pdfCellT1.setPhrase(new Phrase(file.getProductos().get(i).getLote(),boldFont1));
            header.addCell(pdfCellT1); pdfCellT1.setPhrase(new Phrase(file.getProductos().get(i).getDescripcion()+"\n",boldFont1));
            header.addCell(pdfCellT1);
            
            PdfPCell pdfCellT2 = new PdfPCell(new Phrase(file.getProductos().get(i).getCantidad(),boldFont1));
            pdfCellT2.setHorizontalAlignment(Element.ALIGN_CENTER); 
            pdfCellT2.setBorderWidthLeft(1); pdfCellT2.setBorderWidthRight(0);
            pdfCellT2.setBorderWidthTop(0); pdfCellT2.setBorderWidthBottom((i == file.getProductos().size()-1)?1:0);
            pdfCellT2.setBorderColor(BaseColor.GRAY);
            header.addCell(pdfCellT2); pdfCellT2.setPhrase(new Phrase(file.getProductos().get(i).getClaveU(),boldFont1));
            header.addCell(pdfCellT2); pdfCellT2.setPhrase(new Phrase(file.getProductos().get(i).getClaveSP(),boldFont1));
            header.addCell(pdfCellT2); pdfCellT2.setPhrase(new Phrase(file.getProductos().get(i).getUnidad(),boldFont1));
            header.addCell(pdfCellT2);
            
            PdfPCell pdfCellT3 = new PdfPCell(new Phrase(file.getProductos().get(i).getPrecioUImp(),boldFont1));
            pdfCellT3.setHorizontalAlignment(Element.ALIGN_RIGHT); 
            pdfCellT3.setBorderWidthLeft(1); pdfCellT3.setBorderWidthRight(0);
            pdfCellT3.setBorderWidthTop(0); pdfCellT3.setBorderWidthBottom((i == file.getProductos().size()-1)?1:0);
            pdfCellT3.setBorderColor(BaseColor.GRAY);
            header.addCell(pdfCellT3); pdfCellT3.setPhrase(new Phrase(file.getProductos().get(i).getDescuentoImp(),boldFont1));
            header.addCell(pdfCellT3); 
            
            PdfPCell celdaFinal = new PdfPCell(new Phrase(file.getProductos().get(i).getTotalImp(),boldFont1));
            celdaFinal.setBorderWidthLeft(1); celdaFinal.setBorderWidthRight(1);
            celdaFinal.setBorderWidthTop(0); celdaFinal.setBorderWidthBottom((i == file.getProductos().size()-1)?1:0);
            celdaFinal.setBorderColor(BaseColor.GRAY);
            celdaFinal.setHorizontalAlignment(Element.ALIGN_RIGHT); 
            header.addCell(celdaFinal);
        }
        //Fin de creación de los conceptos.
        
        document.add(header);
    }
    
    public PdfPTable total() throws DocumentException{
        //Obtención y declaración de campos y etiquetas de los datos del archivo xml.
        String label[] = {"SUBTOTAL:","IVA16%:","TOTAL:"};
        String field[] = {file.getSubtotal(),file.getIva(),file.getTotal()};
        //Declaración y configuracuón inicial de la tabla.
        PdfPTable header = new PdfPTable(2);
        header.setTotalWidth(new float[]{85,15});
        header.setWidthPercentage(100);
        header.getDefaultCell().setBorder(2);
        for(int i = 0; i<3 ;i++){
            //pdfCell es el lado de la etiqueta.
            Font boldFont = new Font(Font.FontFamily.HELVETICA,6,Font.BOLD);
            boldFont.setColor(46,121,236);
            PdfPCell pdfCell = new PdfPCell(new Phrase(label[i],boldFont));
            pdfCell.setBorder(0);
            pdfCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            header.addCell(pdfCell);
            //pdfCell1 es el campo leído del xml.
            Font boldFont1 = new Font(Font.FontFamily.HELVETICA,6,Font.NORMAL);
            PdfPCell pdfCell1 = new PdfPCell(new Phrase(field[i],boldFont1));
            pdfCell1.setBorder(2);
            pdfCell1.setBorderColor(BaseColor.GRAY);
            pdfCell1.setHorizontalAlignment(Element.ALIGN_RIGHT);
            header.addCell(pdfCell1);
        }
        return header;
    }
    
    public PdfPTable observations() throws DocumentException{
        //Declaración y configuracuón inicial de la tabla.
        PdfPTable header = new PdfPTable(2);
        header.setTotalWidth(new float[]{15,85});
        header.setWidthPercentage(100);
        header.getDefaultCell().setBorder(0);
        
        //PdfCell es la etiqueta
        Font boldFont = new Font(Font.FontFamily.HELVETICA,7,Font.BOLD);
        boldFont.setColor(42,177,185);
        PdfPCell pdfCell = new PdfPCell(new Phrase("OBSERVACIONES:",boldFont));
        pdfCell.setBorder(0);
        pdfCell.setHorizontalAlignment(Element.ALIGN_LEFT);
        header.addCell(pdfCell);
        
        //pdfCell1 es el campo leído del xml.
        Font boldFont1 = new Font(Font.FontFamily.HELVETICA,7,Font.NORMAL);
        PdfPCell pdfCell1 = new PdfPCell(new Phrase(file.getObservaciones(),boldFont1));
        pdfCell1.setBorder(0);
        pdfCell1.setHorizontalAlignment(Element.ALIGN_LEFT);
        header.addCell(pdfCell1);
        return header;
    }
    
    public PdfPTable timbre() throws DocumentException, WriterException, IOException{
        //Declaración y configuracuón inicial de la tabla.
        PdfPTable header = new PdfPTable(4);
        header.setTotalWidth(new float[]{20,30,25,25});
        header.setWidthPercentage(100);
        header.getDefaultCell().setBorderColor(new BaseColor(219, 219, 219));
        
        //PdfCell para el título
        Font fontTitle = new Font(Font.FontFamily.HELVETICA,7,Font.BOLD);
        PdfPCell titulo = new PdfPCell(new Phrase("Información del Timbre Fiscal Digital\n\n",fontTitle));
        titulo.setBackgroundColor(new BaseColor(219, 219, 219));
        titulo.setHorizontalAlignment(Element.ALIGN_LEFT);
        titulo.setColspan(4);
        header.addCell(titulo);
        
        //PdfCell para los headers
        PdfPCell space = new PdfPCell(); 
        space.setBorderColor(BaseColor.LIGHT_GRAY);
        space.setBorderWidthLeft(0.5f); space.setBorderWidthRight(0);
        space.setBorderWidthTop(0); space.setBorderWidthBottom(0);
        header.addCell(space);
        PdfPCell headers = new PdfPCell(new Phrase("Folio Fiscal",fontTitle));
        headers.setHorizontalAlignment(Element.ALIGN_CENTER);
        headers.setBorderColor(BaseColor.LIGHT_GRAY);
        headers.setBorderWidthLeft(0); headers.setBorderWidthRight(0);
        headers.setBorderWidthTop(0); headers.setBorderWidthBottom(1);
        header.addCell(headers); headers.setPhrase(new Phrase("Certificado Digital SAT",fontTitle));
        header.addCell(headers); 
        PdfPCell headers1 = new PdfPCell(new Phrase("Fecha de Certificación",fontTitle));
        headers1.setHorizontalAlignment(Element.ALIGN_CENTER);
        headers1.setBorderWidthTop(0); headers1.setBorderWidthRight(0.5f);
        headers1.setBorderColor(BaseColor.LIGHT_GRAY);
        headers1.setBorderWidthLeft(0); headers1.setBorderWidthBottom(1);
        header.addCell(headers1); 
        
        //PdfCell para los valores
        Font fontValues = new Font(Font.FontFamily.HELVETICA,7,Font.NORMAL);
        header.addCell(space);
        PdfPCell values = new PdfPCell(new Phrase(file.getFolioFiscal(),fontValues));
        values.setHorizontalAlignment(Element.ALIGN_CENTER);
        values.setBorderColor(BaseColor.LIGHT_GRAY);
        values.setBorderWidthLeft(0); values.setBorderWidthRight(0);
        values.setBorderWidthTop(0); values.setBorderWidthBottom(0.5f);
        header.addCell(values); values.setPhrase(new Phrase(file.getCertificadoSAT(),fontValues));
        header.addCell(values); 
        PdfPCell values1 = new PdfPCell(new Phrase(file.getFechaCert(),fontValues));
        values1.setHorizontalAlignment(Element.ALIGN_CENTER);
        values1.setBorderWidthTop(0); values1.setBorderWidthRight(0.5f);
        values1.setBorderColor(BaseColor.LIGHT_GRAY);
        values1.setBorderWidthLeft(0); values1.setBorderWidthBottom(0.5f);
        header.addCell(values1);
        
        //PdfCell para el código QR
        CodigoQR codigoQR = new CodigoQR(110,110,file.getCodeQR());
        BufferedImage image = codigoQR.createQR();
        File outputfile = new File("code/"+file.getNamefile()+".jpg");
        ImageIO.write(image,"jpg",outputfile);
        Image img = com.itextpdf.text.Image.getInstance("code/"+file.getNamefile()+".jpg");        
        PdfPCell codigo = new PdfPCell(img);
        codigo.setHorizontalAlignment(Element.ALIGN_CENTER);
        codigo.setBorderColor(BaseColor.LIGHT_GRAY);
        codigo.setBorderWidthLeft(0.5f); codigo.setBorderWidthRight(0.5f);
        codigo.setBorderWidthTop(0); codigo.setBorderWidthBottom(0.5f);
        codigo.setRowspan(7);
        header.addCell(codigo);
        
        //PdfCell para los Valores fiscales
        PdfPCell valuesT = new PdfPCell(new Phrase("\n\n",fontValues));
        valuesT.setHorizontalAlignment(Element.ALIGN_CENTER);
        valuesT.setBorderColor(BaseColor.LIGHT_GRAY);
        valuesT.setBackgroundColor(new BaseColor(241, 241, 241));
        valuesT.setBorderWidthLeft(0); valuesT.setBorderWidthRight(0.5f);
        valuesT.setBorderWidthTop(0); valuesT.setBorderWidthBottom(0.5f);
        valuesT.setColspan(3);
        header.addCell(valuesT); //Cadena Original del Timbre
        
        //PdfCell para los Títulos fiscales
        PdfPCell titulosT = new PdfPCell(new Phrase("Cadena Original del Timbre",fontTitle));
        valuesT.setHorizontalAlignment(Element.ALIGN_LEFT);
        titulosT.setHorizontalAlignment(Element.ALIGN_LEFT);
        titulosT.setBorderColor(BaseColor.LIGHT_GRAY);
        titulosT.setBorderWidthLeft(0); titulosT.setBorderWidthRight(0.5f);
        titulosT.setBorderWidthTop(0); titulosT.setBorderWidthBottom(0.5f);
        titulosT.setColspan(3);
        header.addCell(titulosT);
        
        valuesT.setPhrase(new Phrase(file.getCadenaOriginal(),fontValues)); header.addCell(valuesT);
        titulosT.setPhrase(new Phrase("Sello Digital del Emisor",fontTitle)); header.addCell(titulosT);
        valuesT.setPhrase(new Phrase(file.getSelloDigitalE(),fontValues)); header.addCell(valuesT);
        titulosT.setPhrase(new Phrase("Sello Digital del SAT",fontTitle)); header.addCell(titulosT);
        valuesT.setPhrase(new Phrase(file.getSelloDigitalSAT(),fontValues)); header.addCell(valuesT);
        return header;
    }
    
    public PdfPTable bottom() throws BadElementException, IOException{ //Crea la tabla para el último footer de la página.
        PdfPTable headers = new PdfPTable(1);
        headers.getDefaultCell().setBorder(0);
        Image img = Image.getInstance("recursos/img_footer_b1soft.jpg");
        headers.addCell(img);        
        return headers;
    }
    
     private void writeFooterTable(PdfWriter writer, Document document, PdfPTable table) { //Acomoda la tabla en el fondo de la página.
        final int FIRST_ROW = 0;
        final int LAST_ROW = -1;
        //Table must have absolute width set.
        if(table.getTotalWidth()==0)
            table.setTotalWidth((document.right()-document.left())*table.getWidthPercentage()/80f);
        table.writeSelectedRows(FIRST_ROW, LAST_ROW, document.left(), document.bottom()+table.getTotalHeight(),writer.getDirectContent());
    }
}