package Class;

import Model.Consult;
import Model.Student;
import View.Register;
import Control.ControlUser;
import javax.swing.UIManager;

public class Principal {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel"); 
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException except) {
            System.err.println(except.getMessage());
        }
        Register vista = new Register();
        Student user = new Student();
        Consult modelo = new Consult();
        ControlUser controlador = new ControlUser(vista,user,modelo);
        controlador.initComponents();
    }
}
