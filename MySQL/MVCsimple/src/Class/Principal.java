package Class;

import Model.Model;
import View.View;
import Control.Control;

public class Principal {
    public static void main(String[] args) {
        View vista = new View();
        Model modelo = new Model();
        Control control = new Control(vista,modelo);
        control.initComponents();
    }
}