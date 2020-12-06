package Class;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class Resultados extends javax.swing.JDialog {
    private final String user1,user2;
    private final int timesuser1,timesuser2,timesdeath;
    private DefaultTableModel model = new DefaultTableModel();
    
    public Resultados(java.awt.Frame parent, boolean modal, String user1, String user2, int timesuser1, int timesuser2, int timesdeath) {        
        super(parent, modal);
        this.setSize(630,250);
        this.user1 = user1;
        this.user2 = user2;
        this.timesuser1 = timesuser1;
        this.timesuser2 = timesuser2;
        this.timesdeath = timesdeath;
        initComponents();initTable();
        this.setLocationRelativeTo(null);
    }
    
    private void initTable(){
        model.addColumn("N° de veces que ganó "+user1);
        model.addColumn("N° de veces que ganó "+user2);
        model.addColumn("N° de empates");
        
        TableColumnModel columnModel = table.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(200);
        columnModel.getColumn(1).setPreferredWidth(200);
        columnModel.getColumn(2).setPreferredWidth(160);
        
        String data[] = {String.valueOf(timesuser1),String.valueOf(timesuser2),String.valueOf(timesdeath)};
        model.addRow(data);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        resultlabel = new javax.swing.JLabel();
        regresarButton = new javax.swing.JButton();
        scrollpane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        panel.setPreferredSize(new java.awt.Dimension(650, 250));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resultlabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 30)); // NOI18N
        resultlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultlabel.setText("Tabla de Resultados");
        panel.add(resultlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 570, -1));

        regresarButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        regresarButton.setText("REGRESAR");
        regresarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarButtonActionPerformed(evt);
            }
        });
        panel.add(regresarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 125, -1));

        table.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        table.setModel(model);
        scrollpane.setViewportView(table);

        panel.add(scrollpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 71, 570, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        
    }//GEN-LAST:event_formComponentResized

    private void regresarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_regresarButtonActionPerformed

  public static void main(String args[]) {
       try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panel;
    private javax.swing.JButton regresarButton;
    private javax.swing.JLabel resultlabel;
    private javax.swing.JScrollPane scrollpane;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
