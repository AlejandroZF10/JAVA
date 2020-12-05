import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorRGB extends JFrame{
    private JFrame frame;
    private JPanel panel;
    private JLabel title,labelRGB;
    private JButton btnGreen,btnRed,btnBlue;
    private int btnpressed = 0;
    private int red = 0, green = 0, blue = 0;

    public ColorRGB(){
        setFrame();
        setPanel();
        setLabel();
        setButton();
        panel.updateUI();
    }

    private void setFrame(){
        frame = new JFrame();
        frame.setTitle("Colores RGB");
        frame.setSize(600,400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void setPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);
    }

    private void setLabel(){
        title = new JLabel("Color(R,G,B)");
        title.setBounds(10,10,560,40);
        title.setFont(new Font("Arial",0,20));
        title.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(title);

        labelRGB = new JLabel();
        labelRGB.setBounds(10,50,560,250);
        labelRGB.setOpaque(true);
        labelRGB.setBackground(Color.BLACK);
        panel.add(labelRGB);
    }

    private void setButton(){
        btnRed = new JButton("ROJO");
        btnRed.setBounds(10,310,125,30);
        btnRed.setFont(new Font("Arial",Font.BOLD,20));
        btnRed.setForeground(Color.RED);
        panel.add(btnRed);

        btnGreen = new JButton("VERDE");
        btnGreen.setBounds(230,310,125,30);
        btnGreen.setFont(new Font("Arial",Font.BOLD,20));
        btnGreen.setForeground(Color.GREEN);
        panel.add(btnGreen);

        btnBlue = new JButton("AZUL");
        btnBlue.setBounds(445,310,125,30);
        btnBlue.setFont(new Font("Arial",Font.BOLD,20));
        btnBlue.setForeground(Color.BLUE);
        panel.add(btnBlue);

        setColorRGB();
    }

    private void setColorRGB(){
        MouseWheelListener listenerMW = new MouseWheelListener(){
            @Override
            public void mouseWheelMoved(MouseWheelEvent mwe){
                switch(btnpressed){
                    case 1: //RED
                        red += mwe.getWheelRotation()*(-1);
                        if(red<0)
                            red = 0;
                        if(red>255)
                            red = 255;
                    break;
                    case 2: //GREEN
                        green += mwe.getWheelRotation()*(-1);
                        if(green<0)
                            green = 0;
                        if(green>255)
                            green = 255;
                    break;
                    case 3: //BLUE
                        blue += mwe.getWheelRotation()*(-1);
                        if(blue<0)
                            blue = 0;
                        if(blue>255)
                            blue = 255;
                    break;
                }
                labelRGB.setBackground(new Color(red,green,blue));
                title.setText("Color("+red+","+green+","+blue+")");
            }
        };
        labelRGB.addMouseWheelListener(listenerMW);

        ActionListener listenerR = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                btnpressed = 1;
            }
        };
        btnRed.addActionListener(listenerR);

        ActionListener listenerG = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                btnpressed = 2;
            }
        };
        btnGreen.addActionListener(listenerG);

        ActionListener listenerB = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                btnpressed = 3;
            }
        };
        btnBlue.addActionListener(listenerB);
    }

    public static void main(String[] args) {
        ColorRGB color = new ColorRGB();
    }
}
