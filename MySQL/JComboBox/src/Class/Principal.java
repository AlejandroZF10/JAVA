package Class;

import Model.City;
import Model.ConnectionSQL;
import Model.Country;
import Model.State;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        DefaultComboBoxModel model = new DefaultComboBoxModel(new Country().showCountries());
        DefaultComboBoxModel model1 = new DefaultComboBoxModel(new Country().showCountries());
        comboboxpais.setModel(model);
        comboboxpais1.setModel(model1);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labeltitulo = new javax.swing.JLabel();
        comboboxpais = new javax.swing.JComboBox<>();
        scrollpane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        separetor1 = new javax.swing.JSeparator();
        labelestado = new javax.swing.JLabel();
        labelpais = new javax.swing.JLabel();
        labelciudad = new javax.swing.JLabel();
        comboboxpais1 = new javax.swing.JComboBox<>();
        comboboxestado = new javax.swing.JComboBox<>();
        comboboxciudad = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labeltitulo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        labeltitulo.setText("País");

        comboboxpais.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        comboboxpais.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboboxpaisItemStateChanged(evt);
            }
        });

        table.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID Estado", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollpane.setViewportView(table);

        labelestado.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        labelestado.setText("Estado");

        labelpais.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        labelpais.setText("País");

        labelciudad.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        labelciudad.setText("Ciudad");

        comboboxpais1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        comboboxpais1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboboxpais1ItemStateChanged(evt);
            }
        });

        comboboxestado.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        comboboxestado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboboxestadoItemStateChanged(evt);
            }
        });

        comboboxciudad.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separetor1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labeltitulo)
                        .addGap(31, 31, 31)
                        .addComponent(comboboxpais, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelestado)
                            .addComponent(labelciudad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelpais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboboxpais1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboboxciudad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboboxestado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboboxpais)
                    .addComponent(labeltitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(scrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(separetor1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelpais)
                    .addComponent(comboboxpais1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelestado)
                    .addComponent(comboboxestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelciudad)
                    .addComponent(comboboxciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboboxpaisItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboboxpaisItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED){
            Country count = (Country)comboboxpais.getSelectedItem();
            ResultSet result;
            PreparedStatement prepared;
            DefaultTableModel model = new DefaultTableModel();
            table.setModel(model);
            model.addColumn("ID Estado");
            model.addColumn("Nombre");
            try{
                int width[] = {50,150};
                ConnectionSQL connect = new ConnectionSQL();
                Connection conexion = connect.getConnect();
                prepared = conexion.prepareStatement("select idestado,nombre_estado from estados where idpais=?");
                prepared.setInt(1,count.getIdpais());
                result = prepared.executeQuery();
                ResultSetMetaData rsmd = result.getMetaData();
                int nocolums = rsmd.getColumnCount();
                for(int i = 0; i<nocolums ;i++)
                    table.getColumnModel().getColumn(i).setPreferredWidth(width[i]);
                while(result.next()){
                    Object rows[] = new Object[nocolums];
                    for(int i = 0; i<nocolums ;i++)
                        rows[i] = result.getObject(i+1);
                    model.addRow(rows);
                }
            }catch(SQLException except){
                System.err.println(except.toString());
            }
        }
    }//GEN-LAST:event_comboboxpaisItemStateChanged

    private void comboboxpais1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboboxpais1ItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED){
            Country count = (Country)comboboxpais1.getSelectedItem();
            State estado = new State();
            DefaultComboBoxModel model = new DefaultComboBoxModel(estado.showStates(count.getIdpais()));
            comboboxestado.setModel(model);
            comboboxciudad.removeAllItems();
            comboboxestado.removeAllItems();
        }
    }//GEN-LAST:event_comboboxpais1ItemStateChanged

    private void comboboxestadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboboxestadoItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED){
            State estado = (State)comboboxestado.getSelectedItem();
            City ciudad = new City();
            DefaultComboBoxModel model = new DefaultComboBoxModel(ciudad.showCities(estado.getIdestado()));
            comboboxciudad.setModel(model);
        }
    }//GEN-LAST:event_comboboxestadoItemStateChanged

    public static void main(String args[]) {
        try{
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            java.awt.EventQueue.invokeLater(() -> {
                new Principal().setVisible(true);
            });
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException except){
            System.err.println(except.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboboxciudad;
    private javax.swing.JComboBox<String> comboboxestado;
    private javax.swing.JComboBox<String> comboboxpais;
    private javax.swing.JComboBox<String> comboboxpais1;
    private javax.swing.JLabel labelciudad;
    private javax.swing.JLabel labelestado;
    private javax.swing.JLabel labelpais;
    private javax.swing.JLabel labeltitulo;
    private javax.swing.JScrollPane scrollpane;
    private javax.swing.JSeparator separetor1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}