package Class;

import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {  
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelJP = new javax.swing.JPanel();
        LoginJB = new javax.swing.JButton();
        PasswordJPF = new javax.swing.JPasswordField();
        UserJTF = new javax.swing.JTextField();
        LogoJL = new javax.swing.JLabel();
        PasswordJL = new javax.swing.JLabel();
        UserJL = new javax.swing.JLabel();
        HeaderJL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Facebook");
        setResizable(false);

        PanelJP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoginJB.setBackground(new java.awt.Color(59, 89, 152));
        LoginJB.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        LoginJB.setForeground(new java.awt.Color(255, 255, 255));
        LoginJB.setText("Iniciar sesión");
        LoginJB.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        LoginJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginJBActionPerformed(evt);
            }
        });
        PanelJP.add(LoginJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 130, 30));

        PasswordJPF.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        PanelJP.add(PasswordJPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 140, 30));

        UserJTF.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        PanelJP.add(UserJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 180, 30));

        LogoJL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logo.jpg"))); // NOI18N
        PanelJP.add(LogoJL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 25, 170, 60));

        PasswordJL.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        PasswordJL.setForeground(new java.awt.Color(255, 255, 255));
        PasswordJL.setText("Contraseña");
        PanelJP.add(PasswordJL, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 140, -1));

        UserJL.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        UserJL.setForeground(new java.awt.Color(255, 255, 255));
        UserJL.setText("Correo electrónico");
        PanelJP.add(UserJL, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 180, -1));

        HeaderJL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Header.png"))); // NOI18N
        PanelJP.add(HeaderJL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelJP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelJP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginJBActionPerformed
        String username = "";
        String password = "";
        String usercorrect = "Alejandro Zepeda";
        String passcorrect = "FacebookPassword";
        username = UserJTF.getText();
        if(username.equals(usercorrect)){
            for(int i = 0; i<PasswordJPF.getPassword().length ;i++)
                password += PasswordJPF.getPassword()[i];
            if(password.equals(passcorrect))
                JOptionPane.showMessageDialog(null,"Bienvenido a Facebook!");
            else
                JOptionPane.showMessageDialog(null,"Contraseña incorrecta!");
        }else{
            JOptionPane.showMessageDialog(null,"Nombre de usuario incorrecto!");
        }
    }//GEN-LAST:event_LoginJBActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HeaderJL;
    private javax.swing.JButton LoginJB;
    private javax.swing.JLabel LogoJL;
    private javax.swing.JPanel PanelJP;
    private javax.swing.JLabel PasswordJL;
    private javax.swing.JPasswordField PasswordJPF;
    private javax.swing.JLabel UserJL;
    private javax.swing.JTextField UserJTF;
    // End of variables declaration//GEN-END:variables
}