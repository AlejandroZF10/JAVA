package Class;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane = new javax.swing.JScrollPane();
        tableproducto = new javax.swing.JTable();
        labeltitulo = new javax.swing.JLabel();
        buttonconnect = new javax.swing.JButton();
        textfieldsearch = new javax.swing.JTextField();
        labelcode = new javax.swing.JLabel();
        labelname = new javax.swing.JLabel();
        labelprice = new javax.swing.JLabel();
        labelstock = new javax.swing.JLabel();
        textfieldcode = new javax.swing.JTextField();
        textfieldname = new javax.swing.JTextField();
        textfieldprice = new javax.swing.JTextField();
        textfieldstock = new javax.swing.JTextField();
        buttoninsert = new javax.swing.JButton();
        buttonupdate = new javax.swing.JButton();
        buttondelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 360));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableproducto.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        tableproducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Precio", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableproducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableproductoMouseClicked(evt);
            }
        });
        scrollPane.setViewportView(tableproducto);

        getContentPane().add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 56, 576, 210));

        labeltitulo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        labeltitulo.setText("Código");
        getContentPane().add(labeltitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 30));

        buttonconnect.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        buttonconnect.setText("SEARCH");
        buttonconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonconnectActionPerformed(evt);
            }
        });
        getContentPane().add(buttonconnect, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 10, -1, -1));

        textfieldsearch.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        textfieldsearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(textfieldsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 210, 30));

        labelcode.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        labelcode.setText("Código");
        getContentPane().add(labelcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 75, 30));

        labelname.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        labelname.setText("Nombre");
        getContentPane().add(labelname, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 75, 30));

        labelprice.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        labelprice.setText("Precio");
        getContentPane().add(labelprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 75, 30));

        labelstock.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        labelstock.setText("Cantidad");
        getContentPane().add(labelstock, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 75, 30));

        textfieldcode.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        getContentPane().add(textfieldcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 60, 300, 30));

        textfieldname.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        getContentPane().add(textfieldname, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 100, 300, 30));

        textfieldprice.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        getContentPane().add(textfieldprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 140, 300, 30));

        textfieldstock.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        getContentPane().add(textfieldstock, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 180, 300, 30));

        buttoninsert.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        buttoninsert.setText("INSERTAR");
        buttoninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoninsertActionPerformed(evt);
            }
        });
        getContentPane().add(buttoninsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 235, -1, -1));

        buttonupdate.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        buttonupdate.setText("MODIFICAR");
        buttonupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonupdateActionPerformed(evt);
            }
        });
        getContentPane().add(buttonupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 235, -1, -1));

        buttondelete.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        buttondelete.setText("ELIMINAR");
        buttondelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttondeleteActionPerformed(evt);
            }
        });
        getContentPane().add(buttondelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 235, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonconnectActionPerformed
        ResultSet result;
        PreparedStatement prepared;
        DefaultTableModel model = new DefaultTableModel();
        tableproducto.setModel(model);
        String where = "";
        String field = textfieldsearch.getText();
        if(!"".equals(field))
            where = "where codigo = '"+field+"'";
        try{
            int width[] = {25,150,25,25};
            ConnectionSQL connect = new ConnectionSQL();
            Connection conexion = connect.getConnect();
            prepared = conexion.prepareStatement("select codigo,nombre,precio,cantidad from producto "+where);
            result = prepared.executeQuery();
            ResultSetMetaData rsmd = result.getMetaData();
            int nocolums = rsmd.getColumnCount();
            model.addColumn("Código");
            model.addColumn("Nombre");
            model.addColumn("Precio");
            model.addColumn("Cantidad");
            for(int i = 0; i<nocolums ;i++)
                tableproducto.getColumnModel().getColumn(i).setPreferredWidth(width[i]);
            while(result.next()){
                Object rows[] = new Object[nocolums];
                for(int i = 0; i<nocolums ;i++)
                    rows[i] = result.getObject(i+1);
                model.addRow(rows);
            }
        }catch(SQLException except){
            System.err.println(except.toString());
        }
    }//GEN-LAST:event_buttonconnectActionPerformed

    private void tableproductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableproductoMouseClicked
        try{
            ResultSet result;
            PreparedStatement prepared;
            ConnectionSQL connect = new ConnectionSQL();
            Connection conexion = connect.getConnect();
            int row = tableproducto.getSelectedRow();
            String code = tableproducto.getValueAt(row,0).toString();
            prepared = conexion.prepareStatement("select codigo,nombre,precio,cantidad from producto where codigo=?");
            prepared.setString(1,code);
            result = prepared.executeQuery();
            while(result.next()){
                textfieldcode.setText(result.getString("codigo"));
                textfieldname.setText(result.getString("nombre"));
                textfieldprice.setText(String.valueOf(result.getDouble("precio")));
                textfieldstock.setText(String.valueOf(result.getInt("cantidad")));
            }
        }catch(SQLException except){
            System.err.println(except.toString());
        }
    }//GEN-LAST:event_tableproductoMouseClicked

    private void buttoninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoninsertActionPerformed
        PreparedStatement prepared;
        String code = textfieldcode.getText();
        String name = textfieldname.getText();
        double price = Double.parseDouble(textfieldprice.getText());
        int stock = Integer.parseInt(textfieldstock.getText());
        try{
            String query = "insert into producto (codigo,nombre,precio,cantidad) values (?,?,?,?)";
            ConnectionSQL connect = new ConnectionSQL();
            Connection conexion = connect.getConnect();
            prepared = conexion.prepareStatement(query);
            prepared.setString(1,code);
            prepared.setString(2,name);
            prepared.setDouble(3,price);
            prepared.setInt(4,stock);
            if(prepared.executeUpdate()>0)
                JOptionPane.showMessageDialog(null,"Registro insertado!");
        }catch(SQLException except){
            System.err.println(except.toString());
        }
    }//GEN-LAST:event_buttoninsertActionPerformed

    private void buttonupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonupdateActionPerformed
        PreparedStatement prepared;
        String key = textfieldsearch.getText();
        String code = textfieldcode.getText();
        String name = textfieldname.getText();
        double price = Double.parseDouble(textfieldprice.getText());
        int stock = Integer.parseInt(textfieldstock.getText());
        try{
            String query = "update producto set codigo=?,nombre=?,precio=?,cantidad=? where codigo=?";
            ConnectionSQL connect = new ConnectionSQL();
            Connection conexion = connect.getConnect();
            prepared = conexion.prepareStatement(query);
            prepared.setString(1,code);
            prepared.setString(2,name);
            prepared.setDouble(3,price);
            prepared.setInt(4,stock);
            prepared.setString(5,key);
            if(prepared.executeUpdate()>0)
                JOptionPane.showMessageDialog(null,"Registro modificado!");
        }catch(SQLException except){
            System.err.println(except.toString());
        }
    }//GEN-LAST:event_buttonupdateActionPerformed

    private void buttondeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttondeleteActionPerformed
        PreparedStatement prepared;
        String key = textfieldsearch.getText();
        try{
            String query = "delete from producto where codigo=?";
            ConnectionSQL connect = new ConnectionSQL();
            Connection conexion = connect.getConnect();
            prepared = conexion.prepareStatement(query);
            prepared.setString(1,key);
            if(prepared.executeUpdate()>0)
                JOptionPane.showMessageDialog(null,"Registro eliminado!");
        }catch(SQLException except){
            System.err.println(except.toString());
        }
    }//GEN-LAST:event_buttondeleteActionPerformed

    public static void main(String args[]) {
        try{
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException except){
            System.err.println(except.getMessage());
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonconnect;
    private javax.swing.JButton buttondelete;
    private javax.swing.JButton buttoninsert;
    private javax.swing.JButton buttonupdate;
    private javax.swing.JLabel labelcode;
    private javax.swing.JLabel labelname;
    private javax.swing.JLabel labelprice;
    private javax.swing.JLabel labelstock;
    private javax.swing.JLabel labeltitulo;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable tableproducto;
    private javax.swing.JTextField textfieldcode;
    private javax.swing.JTextField textfieldname;
    private javax.swing.JTextField textfieldprice;
    private javax.swing.JTextField textfieldsearch;
    private javax.swing.JTextField textfieldstock;
    // End of variables declaration//GEN-END:variables
}