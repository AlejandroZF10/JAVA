package View;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Principal extends javax.swing.JFrame {
    public static Login lgn;
    public static Registro rgt;
    
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labeltitle = new javax.swing.JLabel();
        buttoniniciarsesion = new javax.swing.JButton();
        buttonregistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labeltitle.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        labeltitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltitle.setText("VENTANA PRINCIPAL");

        buttoniniciarsesion.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        buttoniniciarsesion.setText("SIGN IN");
        buttoniniciarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoniniciarsesionActionPerformed(evt);
            }
        });

        buttonregistrar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        buttonregistrar.setText("SIGN UP");
        buttonregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonregistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labeltitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttoniniciarsesion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(buttonregistrar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labeltitle)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttoniniciarsesion)
                    .addComponent(buttonregistrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttoniniciarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoniniciarsesionActionPerformed
        if(lgn == null){
            lgn = new Login();
            lgn.setVisible(true);
        }
    }//GEN-LAST:event_buttoniniciarsesionActionPerformed

    private void buttonregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonregistrarActionPerformed
        if(rgt == null){
            rgt = new Registro();
            rgt.setVisible(true);
        }
    }//GEN-LAST:event_buttonregistrarActionPerformed

    public static void main(String args[]) {
        try{
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            java.awt.EventQueue.invokeLater(() -> {
                new Principal().setVisible(true);
            });
        }catch(ClassNotFoundException|InstantiationException|IllegalAccessException|UnsupportedLookAndFeelException except){
            System.err.println(except.toString());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttoniniciarsesion;
    private javax.swing.JButton buttonregistrar;
    private javax.swing.JLabel labeltitle;
    // End of variables declaration//GEN-END:variables
}
