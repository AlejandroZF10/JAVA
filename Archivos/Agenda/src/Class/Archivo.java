package Class;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Archivo {
    private File archivo;
    
    public void createFile(String path){
        archivo = new File(path);
        try{
            if(!archivo.exists())
                if(archivo.createNewFile())
                    JOptionPane.showMessageDialog(null,"File created successfully!");
                else
                    JOptionPane.showMessageDialog(null,"File can't be created!");
        }catch(IOException except){
            System.err.println(except.getMessage());
        }   
    }
    
    public void writeFile(ArrayList<Persona> person){
        try(FileWriter writer = new FileWriter(archivo,true)){
            for(int i = 0; i<person.size() ;i++)
                writer.write(person.get(i).getIdusuario()+"%"+person.get(i).getNombre()+"%"+
                person.get(i).getApellido()+"%"+person.get(i).getTelefono()+"%"+person.get(i).getCorreo()+"\r\n");
            writer.close();
        }catch(IOException except){
            System.err.println(except.getMessage());
        }
    }
    
    public int getNoContacts(){
        int nocontacts = 0;
        try{
            FileReader reader = new FileReader("Contactos.txt");
            try (BufferedReader buffer = new BufferedReader(reader)) {
                while(buffer.readLine() != null)
                    nocontacts += 1;
            }
        }catch(FileNotFoundException except){
            System.err.println(except.getMessage());
        }catch(IOException except){
            System.err.println(except.getMessage());
        }
        return nocontacts;
    }
}