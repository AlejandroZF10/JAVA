package Class;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class Contactos extends javax.swing.JDialog {
    private DefaultTableModel model = new DefaultTableModel();

    public Contactos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initProperties();
        this.setLocationRelativeTo(null);
    }
    
    private void initProperties(){
        model.addColumn("ID Usuario");
        model.addColumn("Nombre");
        model.addColumn("Apellidos");
        model.addColumn("Teléfono");
        model.addColumn("Correo");
        table.setModel(model);
        
        TableColumnModel columnModel = table.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(80);
        columnModel.getColumn(1).setPreferredWidth(150);
        columnModel.getColumn(2).setPreferredWidth(150);
        columnModel.getColumn(3).setPreferredWidth(100);
        columnModel.getColumn(4).setPreferredWidth(200);
        
        String datos[];
        try{
            FileReader reader = new FileReader("Contactos.txt");
            BufferedReader buffer = new BufferedReader(reader);
            String cadena = buffer.readLine();
            while(cadena != null){
                datos = cadena.split("%");
                cadena = buffer.readLine();
                model.addRow(datos);
            }
        }catch(FileNotFoundException except){
            System.err.println(except.getMessage());
        }catch(IOException except){
            System.err.println(except.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principalPanel = new javax.swing.JPanel();
        tituloLabel = new javax.swing.JLabel();
        scrollPane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        regresarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        principalPanel.setMinimumSize(new java.awt.Dimension(700, 225));
        principalPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 20)); // NOI18N
        tituloLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloLabel.setText("LISTA DE CONTACTOS");
        principalPanel.add(tituloLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 676, -1));

        table.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Usuario", "Nombre", "Apellido", "Teléfono", "Correo"
            }
        ));
        scrollPane.setViewportView(table);

        principalPanel.add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 58, 676, 121));

        regresarButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        regresarButton.setText("REGRESAR");
        regresarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarButtonActionPerformed(evt);
            }
        });
        principalPanel.add(regresarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 192, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_regresarButtonActionPerformed

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            System.out.println(ex.getMessage());
        }
        java.awt.EventQueue.invokeLater(() -> {
            Contactos dialog = new Contactos(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel principalPanel;
    private javax.swing.JButton regresarButton;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable table;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}