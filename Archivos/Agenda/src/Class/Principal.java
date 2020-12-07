package Class;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Principal extends javax.swing.JFrame {
    private int id = 0;
    private ArrayList<Persona>person = new ArrayList<>();
    
    public Principal() {
        initComponents();
        initProperties();
        this.setLocationRelativeTo(null);
    }
    
    private void initProperties(){
        Archivo file = new Archivo();
        if(file.getNoContacts() == 0)
            id = 1000;
        else{
            id = file.getNoContacts()+1000;
            String datos[];
            try{
                FileReader reader = new FileReader("Contactos.txt");
                BufferedReader buffer = new BufferedReader(reader);
                String cadena = buffer.readLine();
                while(cadena != null){
                    datos = cadena.split("%");
                    cadena = buffer.readLine();
                    person.add(new Persona(datos[0],datos[1],datos[2],datos[3],datos[4]));
                }
            }catch(FileNotFoundException except){
                System.err.println(except.getMessage());
            }catch(IOException except){
                System.err.println(except.getMessage());
            }
        }
        idusuarioTextField.setText(id+"");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principalPanel = new javax.swing.JPanel();
        tituloLabel = new javax.swing.JLabel();
        guardarButton = new javax.swing.JButton();
        idusuarioLabel = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        apellidoLabel = new javax.swing.JLabel();
        telefonoLabel = new javax.swing.JLabel();
        correoLabel = new javax.swing.JLabel();
        idusuarioTextField = new javax.swing.JTextField();
        nombreTextField = new javax.swing.JTextField();
        apellidoTextField = new javax.swing.JTextField();
        telefonoTextField = new javax.swing.JTextField();
        correoTextField = new javax.swing.JTextField();
        menuBar = new javax.swing.JMenuBar();
        menuOption = new javax.swing.JMenu();
        mostrarItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        principalPanel.setMinimumSize(new java.awt.Dimension(400, 400));
        principalPanel.setPreferredSize(new java.awt.Dimension(400, 400));
        principalPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        tituloLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloLabel.setText("AGENDA DE CONTACTOS");
        principalPanel.add(tituloLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, -1));

        guardarButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        guardarButton.setText("GUARDAR");
        guardarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarButtonActionPerformed(evt);
            }
        });
        principalPanel.add(guardarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 360, -1, -1));

        idusuarioLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        idusuarioLabel.setText("ID Usuario");
        principalPanel.add(idusuarioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 95, 30));

        nombreLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        nombreLabel.setText("Nombre");
        principalPanel.add(nombreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 95, 30));

        apellidoLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        apellidoLabel.setText("Apellido");
        principalPanel.add(apellidoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 95, 30));

        telefonoLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        telefonoLabel.setText("Telefóno");
        principalPanel.add(telefonoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 95, 30));

        correoLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        correoLabel.setText("Correo");
        principalPanel.add(correoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 95, 30));

        idusuarioTextField.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        idusuarioTextField.setEnabled(false);
        principalPanel.add(idusuarioTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 255, 30));

        nombreTextField.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        principalPanel.add(nombreTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 255, 30));

        apellidoTextField.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        principalPanel.add(apellidoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 255, 30));

        telefonoTextField.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        principalPanel.add(telefonoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 255, 30));

        correoTextField.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        principalPanel.add(correoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 255, 30));

        menuOption.setText("Archivos");
        menuOption.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N

        mostrarItem.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        mostrarItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Agenda.png"))); // NOI18N
        mostrarItem.setText("Mostrar contactos");
        mostrarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarItemActionPerformed(evt);
            }
        });
        menuOption.add(mostrarItem);

        menuBar.add(menuOption);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarButtonActionPerformed
        String idusuario = idusuarioTextField.getText();
        String nombre = nombreTextField.getText();
        String apellido = apellidoTextField.getText();
        String telefono = telefonoTextField.getText();
        String correo = correoTextField.getText();
        Archivo file = new Archivo();
        file.createFile("Contactos.txt");
        person.add(new Persona(idusuario,nombre,apellido,telefono,correo));
        file.writeFile(person); id = id + 1; 
        idusuarioTextField.setText(id+"");
        nombreTextField.setText("");
        apellidoTextField.setText("");
        telefonoTextField.setText("");
        correoTextField.setText("");
        JOptionPane.showMessageDialog(null,nombre+" "+apellido+" saved successfully!");
    }//GEN-LAST:event_guardarButtonActionPerformed

    private void mostrarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarItemActionPerformed
        if(person.size()>0){
            Contactos contact = new Contactos(this,true);
            contact.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null,"Contacts empty!");
        }
    }//GEN-LAST:event_mostrarItemActionPerformed

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            System.out.println(ex.getMessage());
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidoLabel;
    private javax.swing.JTextField apellidoTextField;
    private javax.swing.JLabel correoLabel;
    private javax.swing.JTextField correoTextField;
    private javax.swing.JButton guardarButton;
    private javax.swing.JLabel idusuarioLabel;
    private javax.swing.JTextField idusuarioTextField;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuOption;
    private javax.swing.JMenuItem mostrarItem;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JPanel principalPanel;
    private javax.swing.JLabel telefonoLabel;
    private javax.swing.JTextField telefonoTextField;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
