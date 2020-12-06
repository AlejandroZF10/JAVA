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
    private long datos[];
    private String nombres[];
    
    public Principal(String nombres[],long datos[]) {
        this.nombres = nombres;
        this.datos = datos;
        this.size = nombres.length;
        initComponents(); repaint();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labeltitle = new javax.swing.JLabel();
        scrollpanel = new javax.swing.JScrollPane();
        paneldatos = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(475, 650));
        setPreferredSize(new java.awt.Dimension(475, 650));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labeltitle.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        labeltitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltitle.setText("RESULTADO DEL PROCESO ELECTORAL");
        getContentPane().add(labeltitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 436, -1));

        scrollpanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        paneldatos.setPreferredSize(new java.awt.Dimension(438, 150));

        javax.swing.GroupLayout paneldatosLayout = new javax.swing.GroupLayout(paneldatos);
        paneldatos.setLayout(paneldatosLayout);
        paneldatosLayout.setHorizontalGroup(
            paneldatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );
        paneldatosLayout.setVerticalGroup(
            paneldatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );

        scrollpanel.setViewportView(paneldatos);

        getContentPane().add(scrollpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 440, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        int total = 0;
        int grados[] = new int[size];
        Color clrs[] = {new Color(44,202,144),new Color(255,102,104),new Color(43,56,64),
                        new Color(179,115,88),new Color(255,193,84),new Color(166,77,207),
                        new Color(44,202,144),new Color(255,102,104),new Color(43,56,64)};
        
        for(int i = 0; i<size ;i++)
            total = (int)(total + datos[i]);
        
        for(int i = 0; i<size ;i++){
            double numero = (double)(datos[i] * 360)/total;
            grados[i] = (int)Math.round(numero);
        }
        
        for(int i = 0; i<size ;i++){
            g.setColor(clrs[i]);
            g.fillArc(70,100,350,350,initgrados(i,grados),grados[i]);
        }
        setDatos(clrs,total);
    }
    
    private int initgrados(int index,int grados[]){
        int positionx = 0;
        for(int i = 0; i<index ;i++)
            positionx += grados[i];
        return positionx;
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
    
    public static void main(String args[]) {
        String nombres[] = {"Andrés Manuel López Obrador (Morena)","Ricardo Anaya Cortés (PAN)","José Antonio Meade Kuribreña (PRI)","Jaime Rodríguez Calderón (Indep)"};
        long datos[] = {30113483,12610120,9289853,2961732};
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