package Class;

import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Binario extends ObjectOutputStream{

    public Binario(OutputStream out) throws IOException {
        super(out);
    }

    public Binario() throws IOException, SecurityException {
        
    }
    
    @Override
    public void writeStreamHeader() throws IOException{
        File archivo = new File("Registro.bin");
        if(archivo.length() == 0)
            super.writeStreamHeader();
        else
            reset();
    }
}