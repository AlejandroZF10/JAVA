package Control;

import Model.Consult;
import Model.Student;
import View.Register;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import javax.swing.JOptionPane;

public class ControlUser implements ActionListener{
    private Register vista;
    private Student user;
    private Consult modelo;

    public ControlUser(Register vista, Student user, Consult modelo) {
        this.vista = vista;
        this.user = user;
        this.modelo = modelo;
        this.vista.insertButton.addActionListener(this);
        this.vista.cleanButton.addActionListener(this);
        this.vista.searchButton.addActionListener(this);
        this.vista.updateButton.addActionListener(this);
        this.vista.deleteButton.addActionListener(this);
    }
    
    public void initComponents(){
        vista.setVisible(true);
        vista.setTitle("Registro de usuarios");
        vista.setLocationRelativeTo(null);
    }
        
    @Override
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == vista.insertButton){
            user.setClave(vista.claveTextField.getText());
            user.setNombre(vista.nameTextField.getText());
            user.setDomicilio(vista.addressTextField.getText());
            user.setCorreo(vista.emailTextField.getText());
            user.setTelefono(vista.phoneTextField.getText());
            user.setNacimiento(Date.valueOf(vista.dateTextField.getText()));
            user.setGenero(vista.genereComboBox.getSelectedItem().toString());
            if(modelo.insertData(user))
                JOptionPane.showMessageDialog(null,"Registro insertado correctamente!");
            else
                JOptionPane.showMessageDialog(null,"Error al insertar el registro!");
            cleanBox();
        }else if(event.getSource() == vista.cleanButton){
            cleanBox();
        }else if(event.getSource() == vista.searchButton){
            user.setClave(vista.searchTextField.getText());
            if(modelo.searchData(user)){
                vista.claveTextField.setText(user.getClave());
                vista.nameTextField.setText(user.getNombre());
                vista.addressTextField.setText(user.getDomicilio());
                vista.emailTextField.setText(user.getCorreo());
                vista.phoneTextField.setText(user.getTelefono());
                vista.dateTextField.setText(String.valueOf(user.getNacimiento()));
                vista.genereComboBox.setSelectedIndex((user.getGenero().equals("Masculino")?1:2));
            }else{
                JOptionPane.showMessageDialog(null,"Registro no encontrado!");
            }
        }else if(event.getSource() == vista.updateButton){
            user.setIdstudet(Integer.parseInt(vista.searchTextField.getText()));
            user.setClave(vista.claveTextField.getText());
            user.setNombre(vista.nameTextField.getText());
            user.setDomicilio(vista.addressTextField.getText());
            user.setCorreo(vista.emailTextField.getText());
            user.setTelefono(vista.phoneTextField.getText());
            user.setNacimiento(Date.valueOf(vista.dateTextField.getText()));
            user.setGenero(vista.genereComboBox.getSelectedItem().toString());
            if(modelo.updateData(user))
                JOptionPane.showMessageDialog(null,"Registro actualizado correctamente!");
            else
                JOptionPane.showMessageDialog(null,"Error al actualizar el registro!");
            cleanBox();
        }else if(event.getSource() == vista.deleteButton){
            user.setIdstudet(Integer.parseInt(vista.searchTextField.getText()));
            if(modelo.deleteData(user))
                JOptionPane.showMessageDialog(null,"Registro eliminado correctamente!");
            else
                JOptionPane.showMessageDialog(null,"Error al eliminar el registro!");
        }
    }
    
    public void cleanBox(){
        vista.searchTextField.setText("");
        vista.claveTextField.setText("");
        vista.nameTextField.setText("");
        vista.addressTextField.setText("");
        vista.emailTextField.setText("");
        vista.phoneTextField.setText("");
        vista.dateTextField.setText("");
        vista.genereComboBox.setSelectedIndex(0);
    }
}