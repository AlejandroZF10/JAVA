package View;

import Model.SQLUser;
import Model.Securitypass;
import Model.User;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labeltitle = new javax.swing.JLabel();
        labelusername = new javax.swing.JLabel();
        labelpassword = new javax.swing.JLabel();
        textfieldusername = new javax.swing.JTextField();
        passwordfield = new javax.swing.JPasswordField();
        buttonsignin = new javax.swing.JButton();
        buttonforgot = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        labeltitle.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        labeltitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltitle.setText("INICIO DE SESIÓN");

        labelusername.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        labelusername.setText("Usuario");

        labelpassword.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        labelpassword.setText("Contraseña");

        textfieldusername.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N

        passwordfield.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 10)); // NOI18N

        buttonsignin.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        buttonsignin.setText("SIGN IN");
        buttonsignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonsigninActionPerformed(evt);
            }
        });

        buttonforgot.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        buttonforgot.setText("FORGOT PASSWORD?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labeltitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelpassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelusername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonsignin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonforgot))
                            .addComponent(passwordfield)
                            .addComponent(textfieldusername))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labeltitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelusername)
                    .addComponent(textfieldusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelpassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordfield))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonsignin)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonforgot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonsigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonsigninActionPerformed
        User person = new User();
        SQLUser sqluser = new SQLUser();
        String username = textfieldusername.getText();
        String password = new String(passwordfield.getPassword());
        Date dt = new Date();
        DateFormat dft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(username.equals("")||password.equals("")){
            JOptionPane.showMessageDialog(null,"Faltan campos por llenar!");
        }else{
            String hashpass = Securitypass.md5(password);
            person.setNameuser(username);
            person.setPassword(hashpass);
            person.setLastsession(dft.format(dt));
            if(sqluser.login(person)){
                Principal.lgn = null;
                this.dispose();
                SignIn sgn = new SignIn(person);
                sgn.setVisible(true);
            }
        }
        textfieldusername.setText("");
        passwordfield.setText("");
    }//GEN-LAST:event_buttonsigninActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Principal.lgn = null;
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {
        try{
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            java.awt.EventQueue.invokeLater(() -> {
                new Login().setVisible(true);
            });
        }catch(ClassNotFoundException|InstantiationException|IllegalAccessException|UnsupportedLookAndFeelException except){
            System.err.println(except.toString());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonforgot;
    private javax.swing.JButton buttonsignin;
    private javax.swing.JLabel labelpassword;
    private javax.swing.JLabel labeltitle;
    private javax.swing.JLabel labelusername;
    private javax.swing.JPasswordField passwordfield;
    private javax.swing.JTextField textfieldusername;
    // End of variables declaration//GEN-END:variables
}
