package Control;

import View.View;
import Model.Model;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Control implements ActionListener{
    private View vista;
    private Model modelo;

    public Control(View vista, Model modelo) {
        this.vista = vista;
        this.modelo = modelo;
        vista.operationTB.addActionListener(this);
    }
    
    public void initComponents(){
        vista.setVisible(true);
        vista.setTitle("Modelo MVC");
        vista.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        modelo.setNumero1(Integer.parseInt(vista.numberoneTF.getText()));
        modelo.setNumero2(Integer.parseInt(vista.numbertwoTF.getText()));
        if(vista.operationTB.isSelected()){ //Suma
            vista.resultTF.setText(String.valueOf(modelo.sumar()));    
        }else{ //Resta
            vista.resultTF.setText(String.valueOf(modelo.restar()));
        }
    }
}