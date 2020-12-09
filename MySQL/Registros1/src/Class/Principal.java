package Class;

import com.mysql.jdbc.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Principal extends javax.swing.JFrame {
    private static int iduserfirst = 0;
    private static String user = "root";
    private static String password = "MySQL23";
    private static String url = "jdbc:mysql://localhost:8080/simplelogin?autoReconnet=true&&useSSL=false";
    
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        searchID();
    }
    
    private void cleanText(){
        iduserTextField.setText("");
        nameTextField.setText("");
        lastnameTextField.setText("");
        ageTextField.setText("");
        phoneTextField.setText("");
        emailTextField.setText("");
        dateTextField.setText("");
    }
    
    private Connection getConnect(){
        Connection conexion = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection)DriverManager.getConnection(url,user,password);
        }catch(SQLException | ClassNotFoundException except){
            System.err.println(except.toString());
        }
        return conexion;
    }
        
    private void searchID(){
        ResultSet result;
        PreparedStatement prepared;
        Connection conexion = getConnect();
        try{
            prepared = conexion.prepareStatement("select count(idperson) as idperson from people");
            result = prepared.executeQuery();
            if(result.next()){
                if(result.getInt("idperson")==0)
                    iduserfirst = 1;
                else if(result.getInt("idperson")>0){
                    prepared = conexion.prepareStatement("select idperson as idperson from people order by idperson desc limit 1");
                    result = prepared.executeQuery();
                    if(result.next()){
                        int id = result.getInt("idperson");
                        prepared = conexion.prepareStatement("select (idperson) as idperson from people where idperson=?");
                        prepared.setInt(1,id);
                        result = prepared.executeQuery();
                        if(result.next())
                            iduserfirst = result.getInt("idperson");
                    }
                }
            }
            conexion.close();
            iduserTextField.setText((iduserfirst<10)?"0"+(iduserfirst+1):(iduserfirst+1)+"");
        }catch(SQLException except){
            System.err.println(except.toString());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principalPanel = new javax.swing.JPanel();
        iduserLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        lastnameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        insertButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        searchTextField = new javax.swing.JTextField();
        iduserTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        lastnameTextField = new javax.swing.JTextField();
        ageTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        phoneTextField = new javax.swing.JTextField();
        dateTextField = new javax.swing.JTextField();
        updateButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        principalPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iduserLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        iduserLabel.setText("ID Usuario");
        principalPanel.add(iduserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 90, 30));

        nameLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        nameLabel.setText("Nombre");
        principalPanel.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 70, 30));

        lastnameLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        lastnameLabel.setText("Apellidos");
        principalPanel.add(lastnameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 90, 30));

        ageLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        ageLabel.setText("Edad");
        principalPanel.add(ageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 70, 30));

        emailLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        emailLabel.setText("Correo");
        principalPanel.add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 70, 30));

        phoneLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        phoneLabel.setText("Telefóno");
        principalPanel.add(phoneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 90, 30));

        dateLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        dateLabel.setText("Fecha de registro");
        principalPanel.add(dateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 150, 30));

        insertButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        insertButton.setText("REGISTRAR");
        insertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButtonActionPerformed(evt);
            }
        });
        principalPanel.add(insertButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        deleteButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        deleteButton.setText("ELIMINAR");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        principalPanel.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, -1, -1));

        searchButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        searchButton.setText("BUSCAR");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        principalPanel.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 10, -1, -1));

        searchTextField.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        principalPanel.add(searchTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 10, 90, 30));

        iduserTextField.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        iduserTextField.setEnabled(false);
        principalPanel.add(iduserTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 60, 250, 30));

        nameTextField.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        principalPanel.add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 110, 250, 30));

        lastnameTextField.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        principalPanel.add(lastnameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 160, 250, 30));

        ageTextField.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        principalPanel.add(ageTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 210, 250, 30));

        emailTextField.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        principalPanel.add(emailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 260, 250, 30));

        phoneTextField.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        principalPanel.add(phoneTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 310, 250, 30));

        dateTextField.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        principalPanel.add(dateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 360, 250, 30));

        updateButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        updateButton.setText("ACTUALIZAR");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        principalPanel.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 410, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
        PreparedStatement prepared;
        Connection conexion = getConnect();
        try{
            prepared = conexion.prepareStatement("insert into people(idperson,name,lastname,age,email,cellphone,dates) values(?,?,?,?,?,?,?)");
            prepared.setInt(1,Integer.parseInt(iduserTextField.getText()));
            prepared.setString(2,nameTextField.getText());
            prepared.setString(3,lastnameTextField.getText());
            prepared.setInt(4,Integer.parseInt(ageTextField.getText()));
            prepared.setString(5,emailTextField.getText());
            prepared.setString(6,phoneTextField.getText());
            prepared.setDate(7,Date.valueOf(dateTextField.getText()));
            if(prepared.executeUpdate()>0){
                iduserfirst += 1;
                JOptionPane.showMessageDialog(null,"Usuario registrado!");
            }
            else
                JOptionPane.showMessageDialog(null,"Error en el registro!");
            cleanText();
            conexion.close();
            iduserTextField.setText((iduserfirst<10)?"0"+(iduserfirst+1):(iduserfirst+1)+"");
        }catch(SQLException except){
            System.err.println(except.toString());
        }
    }//GEN-LAST:event_insertButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        ResultSet result;
        PreparedStatement prepared;
        Connection conexion = getConnect();
        try {
            prepared = conexion.prepareStatement("select * from people where idperson=?");
            prepared.setInt(1, Integer.parseInt(searchTextField.getText()));
            result = prepared.executeQuery();
            if (result.next()) {
                iduserTextField.setText((result.getInt("idperson") < 10) ? "0" + result.getInt("idperson") : result.getInt("idperson") + "");
                nameTextField.setText(result.getString("name"));
                lastnameTextField.setText(result.getString("lastname"));
                ageTextField.setText(result.getInt("age") + "");
                phoneTextField.setText(result.getString("cellphone"));
                emailTextField.setText(result.getString("email"));
                dateTextField.setText(String.valueOf(result.getDate("dates")));
            }
            conexion.close();
        } catch (SQLException except) {
            System.err.println(except.toString());
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        PreparedStatement prepared;
        Connection conexion = getConnect();
        try {
            prepared = conexion.prepareStatement("delete from people where idperson=?");
            if(JOptionPane.showConfirmDialog(null,"¿Desea eliminar el contacto?")==0){
                prepared.setInt(1, Integer.parseInt(searchTextField.getText()));
                prepared.execute();                
                conexion.close();
                searchID();
                JOptionPane.showMessageDialog(null,"Usuario eliminado!");
            }
        } catch (SQLException except) {
            System.err.println(except.toString());
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        if(updateButton.isSelected()){ //Mostrar
            ResultSet result;
            PreparedStatement prepared;
            Connection conexion = getConnect();
            try{
                prepared = conexion.prepareStatement("select * from people where idperson=?");
                prepared.setInt(1,Integer.parseInt(searchTextField.getText()));
                result = prepared.executeQuery();
                if(result.next()){
                    iduserTextField.setText((result.getInt("idperson")<10)?"0"+result.getInt("idperson"):result.getInt("idperson")+"");
                    nameTextField.setText(result.getString("name"));
                    lastnameTextField.setText(result.getString("lastname"));
                    ageTextField.setText(result.getInt("age")+"");
                    phoneTextField.setText(result.getString("cellphone"));
                    emailTextField.setText(result.getString("email"));
                    dateTextField.setText(String.valueOf(result.getDate("dates")));           
                }
                conexion.close();
            }catch(SQLException except){
                System.err.println(except.toString());
            }
        }else{ //Actualizar
            PreparedStatement prepared;
            Connection conexion = getConnect();
            try{
                String query = "update people set name=?,lastname=?,age=?,email=?,cellphone=?,dates=? where idperson=?";
                prepared = conexion.prepareStatement(query);
                prepared.setString(1,nameTextField.getText());
                prepared.setString(2,lastnameTextField.getText());
                prepared.setInt(3,Integer.parseInt(ageTextField.getText()));
                prepared.setString(4,emailTextField.getText());
                prepared.setString(5,phoneTextField.getText());
                prepared.setDate(6,Date.valueOf(dateTextField.getText()));
                prepared.setInt(7,Integer.parseInt(iduserTextField.getText()));
                if(prepared.executeUpdate()>0)
                    JOptionPane.showMessageDialog(null,"Usuario actualizado!");
                else
                    JOptionPane.showMessageDialog(null,"Error al actualizar!");
                cleanText();
                conexion.close();
                iduserTextField.setText((iduserfirst<10)?"0"+(iduserfirst+1):iduserfirst+"");
            }catch(SQLException except){
                System.err.println(except.toString());
            }
        }
    }//GEN-LAST:event_updateButtonActionPerformed
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException except) {
            System.err.println(except.toString());
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextField dateTextField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel iduserLabel;
    private javax.swing.JTextField iduserTextField;
    private javax.swing.JButton insertButton;
    private javax.swing.JLabel lastnameLabel;
    private javax.swing.JTextField lastnameTextField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JPanel principalPanel;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JToggleButton updateButton;
    // End of variables declaration//GEN-END:variables
}
