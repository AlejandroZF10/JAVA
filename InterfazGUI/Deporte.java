import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Deporte extends JFrame{
    private JFrame frame;
    private JPanel panel;
    private JLabel label,image;
    private JRadioButton btnBasket,btnTennis;
    private JRadioButton btnSoccer,btnFootball;

    public Deporte(){
        setFrame();
        setPanel();
        setLabel();
        setRadioButton();
        panel.updateUI();
    }

    private void setFrame(){
        frame = new JFrame();
        frame.setTitle("Deporte favorito");
        frame.setSize(500,300);
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
        label = new JLabel("Seleccione su deporte favorito");
        label.setBounds(10,10,460,40);
        label.setFont(new Font("Arial",0,20));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(label);
    }

    private void setRadioButton(){
        ButtonGroup group = new ButtonGroup();

        btnSoccer = new JRadioButton("Futbol");
        btnSoccer.setBounds(10,50,100,30);
        btnSoccer.setFont(new Font("Arial",1,15));
        panel.add(btnSoccer);

        btnBasket = new JRadioButton("BasketBall");
        btnBasket.setBounds(10,105,125,30);
        btnBasket.setFont(new Font("Arial",1,15));
        panel.add(btnBasket);

        btnFootball = new JRadioButton("Americano");
        btnFootball.setBounds(10,165,100,30);
        btnFootball.setFont(new Font("Arial",1,15));
        panel.add(btnFootball);

        btnTennis = new JRadioButton("Tenis");
        btnTennis.setBounds(10,220,100,30);
        btnTennis.setFont(new Font("Arial",1,15));
        panel.add(btnTennis);

        group.add(btnSoccer);
        group.add(btnFootball);
        group.add(btnBasket);
        group.add(btnTennis);

        setImage();
    }

    private void setImage(){
        final ImageIcon imageSoccer = new ImageIcon(getClass().getResource("/Image/Futbol.jpg"));
        final ImageIcon imageBasket = new ImageIcon(getClass().getResource("/Image/Basketball.jpg"));
        final ImageIcon imageFutbol = new ImageIcon(getClass().getResource("/Image/Americano.jpg"));
        final ImageIcon imageTennis = new ImageIcon(getClass().getResource("/Image/Tenis.jpg"));

        image = new JLabel();
        image.setBounds(150,50,320,190);
        panel.add(image);

        ActionListener listenerSoccer = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                image.setIcon(new ImageIcon(imageSoccer.getImage().getScaledInstance(image.getWidth(),image.getHeight(),Image.SCALE_SMOOTH)));
            }
        };
        btnSoccer.addActionListener(listenerSoccer);

        ActionListener listenerBasket = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                image.setIcon(new ImageIcon(imageBasket.getImage().getScaledInstance(image.getWidth(),image.getHeight(),Image.SCALE_SMOOTH)));
            }
        };
        btnBasket.addActionListener(listenerBasket);

        ActionListener listenerFutbol = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                image.setIcon(new ImageIcon(imageFutbol.getImage().getScaledInstance(image.getWidth(),image.getHeight(),Image.SCALE_SMOOTH)));
            }
        };
        btnFootball.addActionListener(listenerFutbol);

        ActionListener listenerTennis = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                image.setIcon(new ImageIcon(imageTennis.getImage().getScaledInstance(image.getWidth(),image.getHeight(),Image.SCALE_SMOOTH)));
            }
        };
        btnTennis.addActionListener(listenerTennis);
    }

    public static void main(String[] args) {
        Deporte sport = new Deporte();
    }
}
