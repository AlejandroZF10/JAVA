package Class;

import Model.ConnectionSQL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.UIManager;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Principal extends javax.swing.JFrame {
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttongenerate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 60));
        setPreferredSize(new java.awt.Dimension(400, 100));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttongenerate.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        buttongenerate.setText("GENERAR");
        buttongenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttongenerateActionPerformed(evt);
            }
        });
        getContentPane().add(buttongenerate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 15, 120, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttongenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttongenerateActionPerformed
        ConnectionSQL conexion = new ConnectionSQL();
        try{
            JasperReport report = null;
            Connection connect = conexion.getConnect();
            String pathreport = "src/Report/Report_country.jasper";
            report = (JasperReport)JRLoader.loadObjectFromFile(pathreport);
            Map parameter = new HashMap();
            parameter.put("id_ciudad",5);
            JasperPrint printer = JasperFillManager.fillReport(report,parameter,connect);
            JasperViewer viewer = new JasperViewer(printer,false);
            viewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            viewer.setVisible(true);
        }catch(JRException except){
            System.err.println(except.toString());
        }
    }//GEN-LAST:event_buttongenerateActionPerformed

    public static void main(String args[]) {
        try{
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            java.awt.EventQueue.invokeLater(() -> {
                new Principal().setVisible(true);
            });
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException except) {
            System.err.println(except.toString());
        }        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttongenerate;
    // End of variables declaration//GEN-END:variables
}