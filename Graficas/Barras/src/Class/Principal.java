package Class;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.text.DecimalFormat;
import javax.swing.BorderFactory;
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
        int total = 0;
        int positiony = 90;
        int mayor = (int)getMayor();
        long largo[] = new long[size];
        Color clrs[] = {new Color(44,202,144),new Color(255,102,104),new Color(43,56,64),
                        new Color(179,115,88),new Color(255,193,84),new Color(166,77,207),
                        new Color(44,202,144),new Color(255,102,104),new Color(43,56,64)};
        
        for(int i = 0; i<size ;i++){
            largo[i] = (datos[i]*300)/mayor;
            total = (int)(total + datos[i]);
        }
        DecimalFormat df = new DecimalFormat("#.00");
        for(int i = 0; i<size ;i++){
            g.setColor(clrs[i]);
            g.fillRect(180,positiony,(int)largo[i],40);
            g.drawString(df.format((double)(datos[i]*100)/total)+"%",180+(int)largo[i]+10,positiony+25);
            positiony += 50;
        }
        paneldatos.setPreferredSize(new Dimension(160,positiony+10));
        this.setPreferredSize(new Dimension(600,paneldatos.getHeight()));
        this.setMinimumSize(new Dimension(600,paneldatos.getHeight()));
        this.setSize(new Dimension(600,paneldatos.getHeight()));
        setDatos(clrs);
    }
    
    private void setDatos(Color clrs[]){
        int ycolor = 0;
        JLabel usuario[] = new JLabel[size];
        for(int i = 0; i<size; i++){
            usuario[i] = new JLabel(setText(nombres[i]));
            usuario[i].setFont(new Font("YU Gothic UI Semibold",Font.PLAIN,14));
            usuario[i].setBounds(5,ycolor,150,40);
            usuario[i].setBorder(BorderFactory.createLineBorder(clrs[i],2));
            paneldatos.add(usuario[i]);
            paneldatos.updateUI();
            ycolor += 50;
        }
    }
    
    private String setText(String mensaje){
        String[] palabras = mensaje.split(" ");
        int[] sizePalabras = new int[palabras.length];
        for(int i = 0; i < sizePalabras.length; i = i + 1){
            if(palabras[i].length() == 4)
                sizePalabras[i] = 20;
            else
                sizePalabras[i] = palabras[i].length() * 8;
        }
        int spaceDisp = 150, index = 0, nolineas = 1;
        for(int i = 0; i < sizePalabras.length; i = i + 1){
            if(spaceDisp > sizePalabras[i])
                spaceDisp = spaceDisp - sizePalabras[i] - 8;
            else{
                i = i - 1;
                nolineas = nolineas + 1;
                spaceDisp = 150;
            }
        }
        String[] cadena = new String[nolineas];
        for(int i = 0; i < cadena.length; i = i + 1)
            cadena[i] = "";
        spaceDisp = 160;
        for(int i = 0; i < sizePalabras.length; i = i + 1){
            if(spaceDisp > sizePalabras[i]){
                spaceDisp = spaceDisp - sizePalabras[i] - 8;
                cadena[index] = cadena[index] + palabras[i] + " ";
            }else{
                i = i - 1;
                index = index + 1;
                spaceDisp = 160;
            }
        }
        String cadenaFinal = "";
        for(int i = 0; i < cadena.length; i = i + 1)
            cadenaFinal = cadenaFinal + cadena[i] + "<br>";
        return "<html><div style='text-align: left;'>" + cadenaFinal + "</div></html>";
    }   
    
    private long getMayor(){
        long mayor = datos[0];
        for(int i = 0; i<size ;i++){
            if(datos[i]>mayor)
                mayor = datos[i];
        }
        return mayor;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labeltitle = new javax.swing.JLabel();
        paneldatos = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 425));
        setPreferredSize(new java.awt.Dimension(600, 425));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labeltitle.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        labeltitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltitle.setText("RESULTADO DEL PROCESO ELECTORAL");
        getContentPane().add(labeltitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 576, -1));

        paneldatos.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout paneldatosLayout = new javax.swing.GroupLayout(paneldatos);
        paneldatos.setLayout(paneldatosLayout);
        paneldatosLayout.setHorizontalGroup(
            paneldatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );
        paneldatosLayout.setVerticalGroup(
            paneldatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
        );

        getContentPane().add(paneldatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

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
    // End of variables declaration//GEN-END:variables
}