package View;

import Model.User;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class SignIn extends javax.swing.JFrame {
    User person;
    
    public SignIn() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public SignIn(User person){
        this.person = person;
        initComponents();
        setLocationRelativeTo(null);
        switch(person.getIduser_type()){
            case 1: //Admin
            break;
            case 2: //User
                itemproviders.setVisible(false);
                menuitemadd.setVisible(false);
            break;
        }
        labelusername.setText("Username: "+person.getNameuser());
        labelname.setText("Nombre: "+person.getName());
        labelemail.setText("Correo: "+person.getEmail());
        labelrol.setText("Rol: "+person.getRolname());
        labellastsession.setText("Última sesión: "+person.getLastsession());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelusername = new javax.swing.JLabel();
        labelname = new javax.swing.JLabel();
        labelemail = new javax.swing.JLabel();
        labelrol = new javax.swing.JLabel();
        labellastsession = new javax.swing.JLabel();
        menubar = new javax.swing.JMenuBar();
        itemproducts = new javax.swing.JMenu();
        menuitemadd = new javax.swing.JMenuItem();
        menuitemupdate = new javax.swing.JMenuItem();
        menuitemstock = new javax.swing.JMenuItem();
        itemproviders = new javax.swing.JMenu();
        menuitemproviders = new javax.swing.JMenuItem();
        menuitemstockp = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelusername.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        labelusername.setText("Username:");

        labelname.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        labelname.setText("Nombre:");

        labelemail.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        labelemail.setText("Correo:");

        labelrol.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        labelrol.setText("Rol:");

        labellastsession.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        labellastsession.setText("Última sesión:");

        itemproducts.setText("Productos");
        itemproducts.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N

        menuitemadd.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        menuitemadd.setText("Agregar producto");
        itemproducts.add(menuitemadd);

        menuitemupdate.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        menuitemupdate.setText("Modificar producto");
        itemproducts.add(menuitemupdate);

        menuitemstock.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        menuitemstock.setText("Catálogo de productos");
        itemproducts.add(menuitemstock);

        menubar.add(itemproducts);

        itemproviders.setText("Proveedores");
        itemproviders.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N

        menuitemproviders.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        menuitemproviders.setText("Agregar proveedor");
        itemproviders.add(menuitemproviders);

        menuitemstockp.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        menuitemstockp.setText("Catálogo de proveedores");
        itemproviders.add(menuitemstockp);

        menubar.add(itemproviders);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelusername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelemail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelrol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labellastsession, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(labelusername)
                .addGap(18, 18, 18)
                .addComponent(labelname)
                .addGap(18, 18, 18)
                .addComponent(labelemail)
                .addGap(18, 18, 18)
                .addComponent(labelrol)
                .addGap(18, 18, 18)
                .addComponent(labellastsession)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try{
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            java.awt.EventQueue.invokeLater(() -> {
                new SignIn().setVisible(true);
            });
        }catch(ClassNotFoundException|InstantiationException|IllegalAccessException|UnsupportedLookAndFeelException except){
            System.err.println(except.toString());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu itemproducts;
    private javax.swing.JMenu itemproviders;
    private javax.swing.JLabel labelemail;
    private javax.swing.JLabel labellastsession;
    private javax.swing.JLabel labelname;
    private javax.swing.JLabel labelrol;
    private javax.swing.JLabel labelusername;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JMenuItem menuitemadd;
    private javax.swing.JMenuItem menuitemproviders;
    private javax.swing.JMenuItem menuitemstock;
    private javax.swing.JMenuItem menuitemstockp;
    private javax.swing.JMenuItem menuitemupdate;
    // End of variables declaration//GEN-END:variables
}
