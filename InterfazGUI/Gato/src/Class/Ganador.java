package Class;

public class Ganador extends javax.swing.JDialog {
    private final String nombre;
    
    public Ganador(java.awt.Frame parent, boolean modal, String nombre) {
        super(parent, modal);
        initComponents();
        this.nombre = nombre;
        this.setLocationRelativeTo(null);
        nombreLabel.setText("Felicitaciones "+nombre+"!");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        ganadorLabel = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        jugarButton = new javax.swing.JButton();
        salirButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setForeground(new java.awt.Color(255, 255, 255));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ganadorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Ganador.gif"))); // NOI18N
        panel.add(ganadorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 70, -1, -1));

        nombreLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        nombreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreLabel.setText("ALEJANDRO");
        panel.add(nombreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 10, 320, -1));

        jugarButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jugarButton.setText("JUGAR DE NUEVO");
        jugarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugarButtonActionPerformed(evt);
            }
        });
        panel.add(jugarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        salirButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        salirButton.setText("SALIR");
        salirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirButtonActionPerformed(evt);
            }
        });
        panel.add(salirButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 250, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jugarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugarButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_jugarButtonActionPerformed

    private void salirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirButtonActionPerformed

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
    private javax.swing.JLabel ganadorLabel;
    private javax.swing.JButton jugarButton;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JPanel panel;
    private javax.swing.JButton salirButton;
    // End of variables declaration//GEN-END:variables
}
