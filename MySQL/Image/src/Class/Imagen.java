package Class;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Imagen extends JPanel{
    private String pathimage;
    private BufferedImage image;
    
    public Imagen(int width, int height, String pathimage){
        this.setSize(width,height);
        this.pathimage = pathimage;
    }
    
    public Imagen(int width, int height, BufferedImage image){
        this.image = image;
        this.setSize(width,height);
    }
    
    @Override
    public void paint(Graphics graph){
        Dimension size = getSize();
        //ImageIcon img = new ImageIcon(getClass().getResource(pathimage));
        //Image img = new ImageIcon(pathimage).getImage();
        graph.drawImage(image,0,0,size.width,size.height,null);
        this.setOpaque(false);
        super.paintComponent(graph);
    }
}