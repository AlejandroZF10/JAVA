package View;

import javax.swing.UIManager;

public class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        searchTextField = new javax.swing.JTextField();
        claveTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        addressTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        phoneTextField = new javax.swing.JTextField();
        dateTextField = new javax.swing.JTextField();
        claveLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        phoneLabel1 = new javax.swing.JLabel();
        genereComboBox = new javax.swing.JComboBox<>();
        searchButton = new javax.swing.JButton();
        insertButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        cleanButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchTextField.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jPanel1.add(searchTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 10, 90, 30));

        claveTextField.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jPanel1.add(claveTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 60, 250, 30));

        nameTextField.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jPanel1.add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 110, 250, 30));

        addressTextField.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jPanel1.add(addressTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 160, 250, 30));

        emailTextField.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jPanel1.add(emailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 210, 250, 30));

        phoneTextField.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jPanel1.add(phoneTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 260, 250, 30));

        dateTextField.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jPanel1.add(dateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 360, 250, 30));

        claveLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        claveLabel.setText("Clave");
        jPanel1.add(claveLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 90, 30));

        nameLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        nameLabel.setText("Nombre");
        jPanel1.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 70, 30));

        addressLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        addressLabel.setText("Domicilio");
        jPanel1.add(addressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 90, 30));

        emailLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        emailLabel.setText("Correo");
        jPanel1.add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 70, 30));

        phoneLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        phoneLabel.setText("Telefóno");
        jPanel1.add(phoneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 90, 30));

        dateLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        dateLabel.setText("Fecha de registro");
        jPanel1.add(dateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 130, 30));

        phoneLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        phoneLabel1.setText("Género");
        jPanel1.add(phoneLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 90, 30));

        genereComboBox.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        genereComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Masculino", "Femenino" }));
        jPanel1.add(genereComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 310, 250, 30));

        searchButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        searchButton.setText("BUSCAR");
        jPanel1.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, 30));

        insertButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        insertButton.setText("INSERTAR");
        jPanel1.add(insertButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        updateButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        updateButton.setText("ACTUALIZAR");
        jPanel1.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, -1, -1));

        deleteButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        deleteButton.setText("ELIMINAR");
        jPanel1.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 410, -1, -1));

        cleanButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        cleanButton.setText("LIMPIAR");
        jPanel1.add(cleanButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            java.awt.EventQueue.invokeLater(() -> {
                new Register().setVisible(true);
            });
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException except) {
            System.err.println(except.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    public javax.swing.JTextField addressTextField;
    private javax.swing.JLabel claveLabel;
    public javax.swing.JTextField claveTextField;
    public javax.swing.JButton cleanButton;
    private javax.swing.JLabel dateLabel;
    public javax.swing.JTextField dateTextField;
    public javax.swing.JButton deleteButton;
    private javax.swing.JLabel emailLabel;
    public javax.swing.JTextField emailTextField;
    public javax.swing.JComboBox<String> genereComboBox;
    public javax.swing.JButton insertButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nameLabel;
    public javax.swing.JTextField nameTextField;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JLabel phoneLabel1;
    public javax.swing.JTextField phoneTextField;
    public javax.swing.JButton searchButton;
    public javax.swing.JTextField searchTextField;
    public javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
