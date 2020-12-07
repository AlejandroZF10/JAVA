package Class;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    private void writeFile(Atleta sport){
        try{
            FileOutputStream file = new FileOutputStream("Registro.bin",true);
            try(Binario streamheader = new Binario(file)){
                streamheader.writeObject(sport);
            }
        }catch (FileNotFoundException except){
            System.err.println(except.getMessage());
        }catch (IOException | SecurityException except){
            System.err.println(except.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principalPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        sportLabel = new javax.swing.JLabel();
        heightLabel = new javax.swing.JLabel();
        weightLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        ageTextField = new javax.swing.JTextField();
        sportTextField = new javax.swing.JTextField();
        heightTextField = new javax.swing.JTextField();
        weightTextField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        menuItem = new javax.swing.JMenu();
        registryItem = new javax.swing.JMenuItem();
        separator = new javax.swing.JPopupMenu.Separator();
        exitItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(415, 415));
        setMinimumSize(new java.awt.Dimension(415, 450));
        setPreferredSize(new java.awt.Dimension(415, 450));

        principalPanel.setPreferredSize(new java.awt.Dimension(400, 400));
        principalPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("REGISTRO");
        principalPanel.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 376, -1));

        nameLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        nameLabel.setText("Nombre");
        principalPanel.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 63, 113, 31));

        ageLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        ageLabel.setText("Edad");
        principalPanel.add(ageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 112, 113, 31));

        sportLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        sportLabel.setText("Deporte");
        principalPanel.add(sportLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 161, 113, 31));

        heightLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        heightLabel.setText("Estatura(cm)");
        principalPanel.add(heightLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 210, 113, 31));

        weightLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        weightLabel.setText("Peso(kg)");
        principalPanel.add(weightLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 259, 113, 33));

        nameTextField.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        principalPanel.add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 63, 245, -1));

        ageTextField.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        principalPanel.add(ageTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 112, 245, -1));

        sportTextField.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        principalPanel.add(sportTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 161, 245, -1));

        heightTextField.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        principalPanel.add(heightTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 210, 245, -1));

        weightTextField.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        principalPanel.add(weightTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 259, 245, 33));

        saveButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        saveButton.setText("REGISTRAR");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        principalPanel.add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 330, -1, -1));

        updateButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        updateButton.setText("ACTUALIZAR");
        principalPanel.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));

        deleteButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        deleteButton.setText("ELIMINAR");
        principalPanel.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 330, -1, -1));

        menuItem.setText("Menú");
        menuItem.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N

        registryItem.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        registryItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Run.png"))); // NOI18N
        registryItem.setText("Mostrar atletas");
        registryItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registryItemActionPerformed(evt);
            }
        });
        menuItem.add(registryItem);
        menuItem.add(separator);

        exitItem.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        exitItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Exit.png"))); // NOI18N
        exitItem.setText("Salir");
        menuItem.add(exitItem);

        menuBar.add(menuItem);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        String nombre = nameTextField.getText();
        int edad = Integer.parseInt(ageTextField.getText());
        String deporte = sportTextField.getText();
        double altura = Double.parseDouble(heightTextField.getText());
        double peso = Double.parseDouble(weightTextField.getText());
        writeFile(new Atleta(nombre,edad,deporte,altura,peso));
        
        nameTextField.setText("");
        ageTextField.setText("");
        sportTextField.setText("");
        heightTextField.setText("");
        weightTextField.setText("");
        JOptionPane.showMessageDialog(null,nombre+" registred successfully!");
    }//GEN-LAST:event_saveButtonActionPerformed

    private void registryItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registryItemActionPerformed
        Registro datos = new Registro(this,true);
        datos.setVisible(true);
    }//GEN-LAST:event_registryItemActionPerformed

    public static void main(String args[]) {
        try{
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException except){
            
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JMenuItem exitItem;
    private javax.swing.JLabel heightLabel;
    private javax.swing.JTextField heightTextField;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuItem;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JPanel principalPanel;
    private javax.swing.JMenuItem registryItem;
    private javax.swing.JButton saveButton;
    private javax.swing.JPopupMenu.Separator separator;
    private javax.swing.JLabel sportLabel;
    private javax.swing.JTextField sportTextField;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton updateButton;
    private javax.swing.JLabel weightLabel;
    private javax.swing.JTextField weightTextField;
    // End of variables declaration//GEN-END:variables
}