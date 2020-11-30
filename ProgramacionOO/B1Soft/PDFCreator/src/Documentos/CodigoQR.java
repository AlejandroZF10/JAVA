package Documentos;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Writer;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.awt.image.BufferedImage;

public class CodigoQR {
    private final int width;
    private final int height;
    private final String data;

    public CodigoQR(int width, int height, String data) {
        this.width = width;
        this.height = height;
        this.data = data;
    }
    
    public BufferedImage createQR() throws WriterException{
        BitMatrix matrix;
        Writer writer = new QRCodeWriter();
        matrix = writer.encode(data,BarcodeFormat.QR_CODE,width,height);
        BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        for(int i = 0; i<height ;i++){
            for(int j = 0; j<width ;j++){
                int value = ((matrix.get(i,j))?0:1)&0xff;
                image.setRGB(i,j,(value == 0)?0:0xFFFFFF);
            }
        }
        return image;
    }
}