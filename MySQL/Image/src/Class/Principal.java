package Class;

import Model.ConnectionSQL;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Principal extends javax.swing.JFrame {
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelimage = new javax.swing.JPanel();
        buttonupload = new javax.swing.JButton();
        buttondownload = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 400));
        setPreferredSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelimage.setPreferredSize(new java.awt.Dimension(600, 350));

        javax.swing.GroupLayout panelimageLayout = new javax.swing.GroupLayout(panelimage);
        panelimage.setLayout(panelimageLayout);
        panelimageLayout.setHorizontalGroup(
            panelimageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        panelimageLayout.setVerticalGroup(
            panelimageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        getContentPane().add(panelimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 25, -1, -1));

        buttonupload.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        buttonupload.setText("Draw Image");
        buttonupload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonuploadActionPerformed(evt);
            }
        });
        getContentPane().add(buttonupload, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        buttondownload.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        buttondownload.setText("Image DB");
        buttondownload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttondownloadActionPerformed(evt);
            }
        });
        getContentPane().add(buttondownload, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 400, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonuploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonuploadActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        chooser.setFileFilter(new FileNameExtensionFilter("*.jpg","jpg"));
        int seleccion = chooser.showOpenDialog(this);
        PreparedStatement ps = null;
        ConnectionSQL connectsql = new ConnectionSQL();
        switch(seleccion){
            case JFileChooser.APPROVE_OPTION:
                File file = chooser.getSelectedFile();
                try{
                    Connection conexion = connectsql.getConnect();
                    FileInputStream fis = new FileInputStream(file);
                    ps = conexion.prepareStatement("insert into draw_image(img) values(?)");
                    ps.setBinaryStream(1,fis,(int)file.length());
                    if(ps.executeUpdate()>0)
                        JOptionPane.showMessageDialog(null,"Imagen guardada!");
                }catch(SQLException | FileNotFoundException except){
                    System.err.println(except.toString());
                }
            break;
        }
        /*
        String pathimage = file.getAbsolutePath();
        int width = panelimage.getWidth();
        int height = panelimage.getHeight();
        Imagen imagen = new Imagen(width,height,pathimage);
        panelimage.add(imagen);
        panelimage.repaint();*/
    }//GEN-LAST:event_buttonuploadActionPerformed

    private void buttondownloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttondownloadActionPerformed
        ResultSet rs = null;
        PreparedStatement ps = null;
        ConnectionSQL connectsql = new ConnectionSQL();
        int idimage = Integer.parseInt(JOptionPane.showInputDialog("ID Image:"));
        try{
            String query = "select img from draw_image where idimage=?";
            Connection conexion = connectsql.getConnect();
            ps = conexion.prepareStatement(query);
            ps.setInt(1,idimage);
            rs = ps.executeQuery();
            BufferedImage buffer = null;
            while(rs.next()){
                InputStream img = rs.getBinaryStream(1);
                buffer = ImageIO.read(img);
                int width = panelimage.getWidth();
                int height = panelimage.getHeight();
                Imagen imagen = new Imagen(width,height,buffer);
                panelimage.add(imagen);
                panelimage.repaint();
            }
            rs.close();
        }catch(SQLException | IOException except){
            System.err.println(except.toString());
        }
        
    }//GEN-LAST:event_buttondownloadActionPerformed

    public static void main(String args[]) {
        try{
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException except){
            System.err.println(except.toString());
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttondownload;
    private javax.swing.JButton buttonupload;
    private javax.swing.JPanel panelimage;
    // End of variables declaration//GEN-END:variables
}
