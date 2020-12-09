package View;

import Model.SQLUser;
import Model.Securitypass;
import Model.User;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Registro extends javax.swing.JFrame {

    public Registro() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labeluser = new javax.swing.JLabel();
        labelpassword = new javax.swing.JLabel();
        labelname = new javax.swing.JLabel();
        labelemail = new javax.swing.JLabel();
        labelpasswordconfirm = new javax.swing.JLabel();
        textfielduser = new javax.swing.JTextField();
        textfieldname = new javax.swing.JTextField();
        textfieldemail = new javax.swing.JTextField();
        passwordfield = new javax.swing.JPasswordField();
        passwordconfirmfield = new javax.swing.JPasswordField();
        buttonregister = new javax.swing.JButton();
        buttonclean = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        labeluser.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        labeluser.setText("Usuario");

        labelpassword.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        labelpassword.setText("Contraseña");

        labelname.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        labelname.setText("Nombre");

        labelemail.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        labelemail.setText("Correo");

        labelpasswordconfirm.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        labelpasswordconfirm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelpasswordconfirm.setText("<html>Confirmar <br>Contraseña</html>");

        textfielduser.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N

        textfieldname.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N

        textfieldemail.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N

        passwordfield.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 10)); // NOI18N

        passwordconfirmfield.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 10)); // NOI18N

        buttonregister.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        buttonregister.setText("REGISTRAR");
        buttonregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonregisterActionPerformed(evt);
            }
        });

        buttonclean.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        buttonclean.setText("LIMPIAR");
        buttonclean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoncleanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelemail)
                                    .addComponent(labeluser)
                                    .addComponent(labelpassword)
                                    .addComponent(labelname))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textfieldname, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textfieldemail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(passwordfield, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textfielduser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(buttonregister)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonclean)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelpasswordconfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(passwordconfirmfield)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labeluser)
                    .addComponent(textfielduser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelpassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordfield))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelpasswordconfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordconfirmfield, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelname)
                    .addComponent(textfieldname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelemail)
                    .addComponent(textfieldemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonclean)
                    .addComponent(buttonregister))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonregisterActionPerformed
        User person = new User();
        SQLUser sqlperson = new SQLUser();
        String password = new String(passwordfield.getPassword());
        String passwordconfirm = new String(passwordconfirmfield.getPassword());
        if(textfielduser.getText().equals("")||password.equals("")||textfieldname.getText().equals("")||textfieldemail.getText().equals("")||passwordconfirm.equals("")){
            JOptionPane.showMessageDialog(null,"Faltan campos por llenar!");
        }else{
            if(password.equals(passwordconfirm)){
                if(sqlperson.confirmar(textfielduser.getText()) == 0){
                    if(sqlperson.verificaremail(textfieldemail.getText())){
                        String newpassword = Securitypass.md5(password);
                        person.setNameuser(textfielduser.getText());
                        person.setPassword(newpassword);
                        person.setName(textfieldname.getText());
                        person.setEmail(textfieldemail.getText());
                        person.setIduser_type(2);
                        if(sqlperson.registrar(person)){
                            JOptionPane.showMessageDialog(null, "Registro correcto!");
                            textfielduser.setText("");
                            passwordfield.setText("");
                            passwordconfirmfield.setText("");
                            textfieldname.setText("");
                            textfieldemail.setText("");
                        }else{
                            JOptionPane.showMessageDialog(null, "Error al registrar usuario!");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Formato inválido del correo!");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "El nombre de usuario "+textfielduser.getText()+" ya existe!");
                }
            }else{
                JOptionPane.showMessageDialog(null,"Las contraseñas no coinciden!");
            }
        }
    }//GEN-LAST:event_buttonregisterActionPerformed

    private void buttoncleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoncleanActionPerformed
        textfielduser.setText("");
        passwordfield.setText("");
        passwordconfirmfield.setText("");
        textfieldname.setText("");
        textfieldemail.setText("");
    }//GEN-LAST:event_buttoncleanActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Principal.rgt = null;
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {
        try{
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            java.awt.EventQueue.invokeLater(() -> {
                new Registro().setVisible(true);
            });
        }catch(ClassNotFoundException|InstantiationException|IllegalAccessException|UnsupportedLookAndFeelException except){
            System.err.println(except.toString());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonclean;
    private javax.swing.JButton buttonregister;
    private javax.swing.JLabel labelemail;
    private javax.swing.JLabel labelname;
    private javax.swing.JLabel labelpassword;
    private javax.swing.JLabel labelpasswordconfirm;
    private javax.swing.JLabel labeluser;
    private javax.swing.JPasswordField passwordconfirmfield;
    private javax.swing.JPasswordField passwordfield;
    private javax.swing.JTextField textfieldemail;
    private javax.swing.JTextField textfieldname;
    private javax.swing.JTextField textfielduser;
    // End of variables declaration//GEN-END:variables
}