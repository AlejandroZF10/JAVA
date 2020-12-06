package Class;

import javax.swing.JOptionPane;

public class Inicial extends javax.swing.JFrame {
    private String nameuser1 = "";
    private String nameuser2 = "";
    
    public Inicial() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        nombreusuario1 = new javax.swing.JLabel();
        nombreusuario2 = new javax.swing.JLabel();
        textusuario1 = new javax.swing.JTextField();
        textusuario2 = new javax.swing.JTextField();
        guardarButton = new javax.swing.JButton();
        jugarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("TRES EN RAYA");
        panel.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 376, -1));

        nombreusuario1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        nombreusuario1.setText("Nombre jugador 1:");
        panel.add(nombreusuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 79, -1, 28));

        nombreusuario2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        nombreusuario2.setText("Nombre jugador 2:");
        panel.add(nombreusuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 125, -1, 28));

        textusuario1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        panel.add(textusuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 79, 200, -1));

        textusuario2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        panel.add(textusuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 125, 200, -1));

        guardarButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        guardarButton.setText("GUARDAR");
        guardarButton.setPreferredSize(new java.awt.Dimension(100, 30));
        guardarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarButtonActionPerformed(evt);
            }
        });
        panel.add(guardarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 175, 120, 30));

        jugarButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jugarButton.setText("JUGAR");
        jugarButton.setEnabled(false);
        jugarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugarButtonActionPerformed(evt);
            }
        });
        panel.add(jugarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 175, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarButtonActionPerformed
        if((textusuario1.getText().length()>0)&&(textusuario2.getText().length()>0)){
            nameuser1 = textusuario1.getText();
            nameuser2 = textusuario2.getText();
            jugarButton.setEnabled(true);
            guardarButton.setEnabled(false);
            JOptionPane.showMessageDialog(null,nameuser1+" juega con X\n"+nameuser2+" juega con O\n");
        }
    }//GEN-LAST:event_guardarButtonActionPerformed

    private void jugarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugarButtonActionPerformed
        Principal ventana = new Principal(nameuser1,nameuser2);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jugarButtonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new Inicial().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton guardarButton;
    private javax.swing.JButton jugarButton;
    private javax.swing.JLabel nombreusuario1;
    private javax.swing.JLabel nombreusuario2;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField textusuario1;
    private javax.swing.JTextField textusuario2;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
