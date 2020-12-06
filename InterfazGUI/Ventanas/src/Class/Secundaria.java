package Class;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Secundaria extends javax.swing.JDialog {
    String nombre = "";
    String apellido = "";
    String nacionalidad = "";
    String correo = "";
    
    public Secundaria(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setSize(400,300);
        this.setTitle("Ventana secundaria");
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panel = new javax.swing.JPanel();
        nombrelabel = new javax.swing.JLabel();
        apellidolabel = new javax.swing.JLabel();
        nacionalidadlabel = new javax.swing.JLabel();
        correolabel = new javax.swing.JLabel();
        nombretextfield = new javax.swing.JTextField();
        apellidotextfield = new javax.swing.JTextField();
        nacionalidadtextfield = new javax.swing.JTextField();
        correotextfield = new javax.swing.JTextField();
        enviarbutton = new javax.swing.JButton();
        limpiarbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 300));

        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombrelabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        nombrelabel.setText("Nombre");
        panel.add(nombrelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        apellidolabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        apellidolabel.setText("Apellido");
        panel.add(apellidolabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 30));

        nacionalidadlabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        nacionalidadlabel.setText("Nacionalidad");
        panel.add(nacionalidadlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 30));

        correolabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        correolabel.setText("Correo");
        panel.add(correolabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 30));

        nombretextfield.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        panel.add(nombretextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 200, 30));

        apellidotextfield.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        panel.add(apellidotextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 200, 30));

        nacionalidadtextfield.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        panel.add(nacionalidadtextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 200, 30));

        correotextfield.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        panel.add(correotextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 200, 30));

        enviarbutton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        enviarbutton.setText("ENVIAR");
        enviarbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarbuttonActionPerformed(evt);
            }
        });
        panel.add(enviarbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        limpiarbutton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        limpiarbutton.setText("LIMPIAR");
        limpiarbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarbuttonActionPerformed(evt);
            }
        });
        panel.add(limpiarbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enviarbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarbuttonActionPerformed
        boolean flag = true;
        if(nombretextfield.getText().equals(""))
            flag = false;
        if(apellidotextfield.getText().equals(""))
            flag = false;
        if(nacionalidadtextfield.getText().equals(""))
            flag = false;
        if(correotextfield.getText().equals(""))
            flag = false;
        if(flag){
            nombre = nombretextfield.getText();
            apellido = apellidotextfield.getText();
            nacionalidad = nacionalidadtextfield.getText();
            correo = correotextfield.getText();
        }else{
            JOptionPane.showMessageDialog(null,"Faltan campos por llenar!");
        }            
    }//GEN-LAST:event_enviarbuttonActionPerformed

    private void limpiarbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarbuttonActionPerformed
        nombretextfield.setText("");
        apellidotextfield.setText("");
        nacionalidadtextfield.setText("");
        correotextfield.setText("");
    }//GEN-LAST:event_limpiarbuttonActionPerformed
    public static void main(String args[]) {
        try{
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        }catch(ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException except){
            System.out.println(except.getMessage());
        }
        java.awt.EventQueue.invokeLater(() -> {
            Secundaria dialog = new Secundaria(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidolabel;
    private javax.swing.JTextField apellidotextfield;
    private javax.swing.JLabel correolabel;
    private javax.swing.JTextField correotextfield;
    public javax.swing.JButton enviarbutton;
    private javax.swing.JButton limpiarbutton;
    private javax.swing.JLabel nacionalidadlabel;
    private javax.swing.JTextField nacionalidadtextfield;
    private javax.swing.JLabel nombrelabel;
    private javax.swing.JTextField nombretextfield;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}