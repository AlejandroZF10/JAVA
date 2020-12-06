package Class;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {
    DefaultTableModel model = new DefaultTableModel();
    
    public Principal() {
        initComponents();
        initProperties();
        this.setSize(500,400);
        this.setTitle("Ventana principal");
        this.setLocationRelativeTo(null);
    }
    
    private void initProperties(){
        table.setModel(model);
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Nacionalidad");
        model.addColumn("Correo");
        model.addRow(new Object[]{"Alejandro","Zepeda","Mexico","Hotmail"});
        model.addRow(new Object[]{"Esli","Hernandez","Mexico","Gmail"});
        model.addRow(new Object[]{"Uriel","Cajiga","Mexico","Outlook"});
        model.addRow(new Object[]{"Alejandro","Zepeda","Mexico","Hotmail"});
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        principal = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        nuevousuario = new javax.swing.JButton();
        eliminarusuario = new javax.swing.JButton();
        scrollpane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        principal.setLayout(new java.awt.GridBagLayout());

        titulo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Registro de usuarios");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        principal.add(titulo, gridBagConstraints);

        nuevousuario.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        nuevousuario.setText("NUEVO USUARIO");
        nuevousuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevousuarioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        principal.add(nuevousuario, gridBagConstraints);

        eliminarusuario.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        eliminarusuario.setText("ELIMINAR USUARIO");
        eliminarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarusuarioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        principal.add(eliminarusuario, gridBagConstraints);

        table.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Nacionalidad", "Correo"
            }
        ));
        scrollpane.setViewportView(table);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        principal.add(scrollpane, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevousuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevousuarioActionPerformed
        Secundaria ventana = new Secundaria(this,true);
        ventana.setVisible(true);
        model.addRow(new Object[]{ventana.nombre,ventana.apellido,ventana.nacionalidad,ventana.correo});
    }//GEN-LAST:event_nuevousuarioActionPerformed

    private void eliminarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarusuarioActionPerformed
        
    }//GEN-LAST:event_eliminarusuarioActionPerformed

    public static void main(String args[]) {
        try{
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        }catch(ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException except){
            System.out.println(except.getMessage());
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton eliminarusuario;
    private javax.swing.JButton nuevousuario;
    private javax.swing.JPanel principal;
    private javax.swing.JScrollPane scrollpane;
    private javax.swing.JTable table;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}