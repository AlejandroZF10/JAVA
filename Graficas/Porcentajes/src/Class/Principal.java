package Class;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.UIManager;

public class Principal extends javax.swing.JFrame {
    private int size;
    private long  datos[];
    private String nombres[];
    
    public Principal(String nombres[],long datos[]) {
        this.nombres = nombres;
        this.datos = datos;
        this.size = nombres.length;
        initComponents();
        setLocationRelativeTo(null);
        repaint();
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        int total = 0,positionx = 50;
        long largo[] = new long[size];
        Color clrs[] = {new Color(44,202,144),new Color(255,102,104),new Color(43,56,64),
                        new Color(179,115,88),new Color(255,193,84),new Color(166,77,207),
                        new Color(44,202,144),new Color(255,102,104),new Color(43,56,64)};
        
        for(int i = 0; i<size ;i++)
            total = total + (int)datos[i];
        for(int i = 0; i<size ;i++)
            largo[i] = (datos[i]*400)/total;
        for(int i = 0; i<size ;i++){
            System.out.println(positionx+" "+largo[i]);
            g.setColor(clrs[i]);
            g.fillRect(positionx,80,(int)largo[i],50);
            positionx += largo[i];
        }
        setDatos(clrs,total);
    }
    
    private void setDatos(Color clrs[],int total){
        int ycolor = 5;
        JLabel color[] = new JLabel[size];
        JLabel usuario[] = new JLabel[size];
        for(int i = 0; i<size; i++){
            color[i] = new JLabel();
            color[i].setOpaque(true);
            color[i].setBackground(clrs[i]);
            color[i].setBounds(5,ycolor,25,25);
            DecimalFormat df = new DecimalFormat("#.00");
            usuario[i] = new JLabel(nombres[i]+" ("+df.format((double)(datos[i]*100)/total)+"%)");
            usuario[i].setFont(new Font("YU Gothic UI Semibold",Font.PLAIN,16));
            usuario[i].setBounds(35,ycolor,450,25);
            if(ycolor > 125)
                paneldatos.setPreferredSize(new Dimension(420,ycolor+30));
            paneldatos.add(color[i]);
            paneldatos.add(usuario[i]);
            paneldatos.updateUI();
            ycolor += 30;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labeltitle = new javax.swing.JLabel();
        scrollpanel = new javax.swing.JScrollPane();
        paneldatos = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        labeltitle.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        labeltitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltitle.setText("RESULTADO DEL PROCESO ELECTORAL");

        scrollpanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        paneldatos.setPreferredSize(new java.awt.Dimension(438, 150));

        javax.swing.GroupLayout paneldatosLayout = new javax.swing.GroupLayout(paneldatos);
        paneldatos.setLayout(paneldatosLayout);
        paneldatosLayout.setHorizontalGroup(
            paneldatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 474, Short.MAX_VALUE)
        );
        paneldatosLayout.setVerticalGroup(
            paneldatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );

        scrollpanel.setViewportView(paneldatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labeltitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labeltitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(scrollpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        String nombres[] = {"Andrés Manuel López Obrador","José Antonio Meade Kuribreña","Jaime Rodríguez Calderón","Ricardo Anaya Cortés"};
        long datos[] = {30113483,9289853,2961732,12610120};
        try{
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            java.awt.EventQueue.invokeLater(() -> {
                new Principal(nombres,datos).setVisible(true);
            });
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException e){
            System.err.println(e.toString());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labeltitle;
    private javax.swing.JPanel paneldatos;
    private javax.swing.JScrollPane scrollpanel;
    // End of variables declaration//GEN-END:variables
}
