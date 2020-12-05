import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Contador extends JFrame{
    private int count = 0;
    private JFrame frame;
    private JButton button;
    private JLabel label;
    private JPanel panel;

    public Contador(){
        setFrame();
        setPanel();
        setLabel();
        setButton();
    }

    private void setFrame(){
        frame = new JFrame();
        frame.setTitle("Contador de click's");
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void setPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);
    }

    private void setButton(){
        button = new JButton("Click here");
        button.setBounds(125,100,150,40);
        button.setFont(new Font("Cooper black",0,18));
        ActionListener listener = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                count = count + 1;
                String value = (count<10)?"0"+count:""+count;
                label.setText("Numero de clicks: "+value);
            }
        };
        button.addActionListener(listener);
        panel.add(button);
    }

    private void setLabel(){
        label = new JLabel("Numero de clicks: 00");
        label.setBounds(10,10,360,40);
        label.setFont(new Font("Arial",0,18));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(label);
    }

    public static void main(String[] args) {
        Contador count = new Contador();
    }
}
