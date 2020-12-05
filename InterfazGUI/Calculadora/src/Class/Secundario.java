package Class;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Secundario extends javax.swing.JFrame {
    private String divisa = "";
    private String cambio = "";
    private String cantidad = "";
    private double dinero;
    private double conversion;
    private boolean point = true;
    
    public Secundario() {
        initComponents();
        initProperties();
        this.setSize(300,550);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panel = new javax.swing.JPanel();
        monedaUsuario1 = new javax.swing.JLabel();
        monedaCambio1 = new javax.swing.JLabel();
        combomonedaU = new javax.swing.JComboBox<>();
        monedaUsuario2 = new javax.swing.JLabel();
        monedaCambio2 = new javax.swing.JLabel();
        combomonedaC = new javax.swing.JComboBox<>();
        clearButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        nineButton = new javax.swing.JButton();
        eightButton = new javax.swing.JButton();
        sevenButton = new javax.swing.JButton();
        sixButton = new javax.swing.JButton();
        fivaButton = new javax.swing.JButton();
        fourButton = new javax.swing.JButton();
        threeButton = new javax.swing.JButton();
        twoButton = new javax.swing.JButton();
        oneButton = new javax.swing.JButton();
        zeroButton = new javax.swing.JButton();
        pointButton = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        calculadoraItem = new javax.swing.JMenuItem();
        conversorItem = new javax.swing.JMenuItem();
        separadorItem = new javax.swing.JPopupMenu.Separator();
        salirItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setLayout(new java.awt.GridBagLayout());

        monedaUsuario1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        monedaUsuario1.setText("$");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 0, 0);
        panel.add(monedaUsuario1, gridBagConstraints);

        monedaCambio1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        monedaCambio1.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        panel.add(monedaCambio1, gridBagConstraints);

        combomonedaU.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        combomonedaU.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estados Unidos - Dolar", "Unión Europea - Euro", "Reino Unido - Libra", "México - Peso" }));
        combomonedaU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combomonedaUActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        panel.add(combomonedaU, gridBagConstraints);

        monedaUsuario2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        monedaUsuario2.setText("$");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 0, 0);
        panel.add(monedaUsuario2, gridBagConstraints);

        monedaCambio2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        monedaCambio2.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        panel.add(monedaCambio2, gridBagConstraints);

        combomonedaC.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        combomonedaC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estados Unidos - Dolar", "Unión Europea - Euro", "Reino Unido - Libra", "México - Peso" }));
        combomonedaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combomonedaCActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        panel.add(combomonedaC, gridBagConstraints);

        clearButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        clearButton.setText("C");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        panel.add(clearButton, gridBagConstraints);

        deleteButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        deleteButton.setText("D");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        panel.add(deleteButton, gridBagConstraints);

        nineButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        nineButton.setText("9");
        nineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(nineButton, gridBagConstraints);

        eightButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        eightButton.setText("8");
        eightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(eightButton, gridBagConstraints);

        sevenButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        sevenButton.setText("7");
        sevenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(sevenButton, gridBagConstraints);

        sixButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        sixButton.setText("6");
        sixButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(sixButton, gridBagConstraints);

        fivaButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        fivaButton.setText("5");
        fivaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fivaButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(fivaButton, gridBagConstraints);

        fourButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        fourButton.setText("4");
        fourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(fourButton, gridBagConstraints);

        threeButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        threeButton.setText("3");
        threeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(threeButton, gridBagConstraints);

        twoButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        twoButton.setText("2");
        twoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(twoButton, gridBagConstraints);

        oneButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        oneButton.setText("1");
        oneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(oneButton, gridBagConstraints);

        zeroButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        zeroButton.setText("0");
        zeroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(zeroButton, gridBagConstraints);

        pointButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        pointButton.setText(".");
        pointButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(pointButton, gridBagConstraints);

        fileMenu.setText("Opciones");
        fileMenu.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N

        calculadoraItem.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        calculadoraItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Calculadora.png"))); // NOI18N
        calculadoraItem.setText("Calculadora");
        calculadoraItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculadoraItemActionPerformed(evt);
            }
        });
        fileMenu.add(calculadoraItem);

        conversorItem.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        conversorItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Conversor.png"))); // NOI18N
        conversorItem.setText("Conversor");
        fileMenu.add(conversorItem);
        fileMenu.add(separadorItem);

        salirItem.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        salirItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Salir.png"))); // NOI18N
        salirItem.setText("Salir");
        salirItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirItemActionPerformed(evt);
            }
        });
        fileMenu.add(salirItem);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void initProperties(){
        InputStream is;
        Properties properties = new Properties();
        System.out.println();
	try{
            is = new FileInputStream(System.getProperty("user.dir")+"/src/properties/app.properties");
            properties.load(is);
            /*dolar = Double.parseDouble(properties.getProperty("moneda.dolar"));
            euro = Double.parseDouble(properties.getProperty("moneda.euro"));
            libra = Double.parseDouble(properties.getProperty("moneda.libra"));*/
	}catch(IOException except){
            System.err.println(except.toString());
	}
    }
    
    private void getMoney(){
        cantidad = monedaCambio1.getText();
        dinero = Double.parseDouble(cantidad);
        foreignExchange();
        System.out.println(dinero+" "+conversion);
        dinero *= conversion;
        monedaCambio2.setText(String.format("%.2f",dinero));
    }
    
    private void foreignExchange(){
        if(divisa.equals(cambio)){
            conversion = 1;
        }else if(divisa.equals("Estados Unidos - Dolar")&&cambio.equals("Unión Europea - Euro")){
            conversion = 0.84;
        }else if(divisa.equals("Estados Unidos - Dolar")&&cambio.equals("Reino Unido - Libra")){
            conversion = 0.76;
        }else if(divisa.equals("Estados Unidos - Dolar")&&cambio.equals("México - Peso")){
            conversion = 22.38;
        }else if(divisa.equals("Unión Europea - Euro")&&cambio.equals("Estados Unidos - Dolar")){
            conversion = 1.19;
        }else if(divisa.equals("Unión Europea - Euro")&&cambio.equals("Reino Unido - Libra")){
            conversion = 0.90;
        }else if(divisa.equals("Unión Europea - Euro")&&cambio.equals("México - Peso")){
            conversion = 26.57;
        }else if(divisa.equals("Reino Unido - Libra")&&cambio.equals("Estados Unidos - Dolar")){
            conversion = 1.31;
        }else if(divisa.equals("Reino Unido - Libra")&&cambio.equals("Unión Europea - Euro")){
            conversion = 1.11;
        }else if(divisa.equals("Reino Unido - Libra")&&cambio.equals("México - Peso")){
            conversion = 29.39;
        }else if(divisa.equals("México - Peso")&&cambio.equals("Estados Unidos - Dolar")){
            conversion = 0.045;
        }else if(divisa.equals("México - Peso")&&cambio.equals("Unión Europea - Euro")){
            conversion = 0.038;
        }else if(divisa.equals("México - Peso")&&cambio.equals("Reino Unido - Libra")){
            conversion = 0.034;
        }
    }
    
    private void calculadoraItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculadoraItemActionPerformed
        Principal calculadora = new Principal();
        calculadora.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_calculadoraItemActionPerformed

    private void salirItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirItemActionPerformed

    private void combomonedaUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combomonedaUActionPerformed
        divisa = (String)combomonedaU.getSelectedItem();
        switch(divisa){
            case "Estados Unidos - Dolar":
                monedaUsuario1.setText("$");
            break;
            case "Unión Europea - Euro":
                monedaUsuario1.setText("€");
            break;
            case "Reino Unido - Libra":
                monedaUsuario1.setText("£");
            break;
            case "México - Peso":
                monedaUsuario1.setText("$");
            break;
        }
        getMoney();
    }//GEN-LAST:event_combomonedaUActionPerformed

    private void combomonedaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combomonedaCActionPerformed
        cambio = (String)combomonedaC.getSelectedItem();
        switch(cambio){
            case "Estados Unidos - Dolar":
                monedaUsuario2.setText("$");
            break;
            case "Unión Europea - Euro":
                monedaUsuario2.setText("€");
            break;
            case "Reino Unido - Libra":
                monedaUsuario2.setText("£");
            break;
            case "México - Peso":
                monedaUsuario2.setText("$");
            break;
        }
        getMoney();
    }//GEN-LAST:event_combomonedaCActionPerformed

    private void zeroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroButtonActionPerformed
        if(!"".equals(cantidad)){
            if("0".equals(monedaCambio1.getText()))
                cantidad = "0";
            else
                cantidad += "0";
            monedaCambio1.setText(cantidad);
            getMoney();
        }
    }//GEN-LAST:event_zeroButtonActionPerformed

    private void oneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneButtonActionPerformed
        System.out.println(combomonedaU.getSelectedItem()+" "+combomonedaU.getSelectedItem());
        if("0".equals(monedaCambio1.getText()))
            cantidad = "1";
        else
            cantidad += "1";
        monedaCambio1.setText(cantidad);
        getMoney();
    }//GEN-LAST:event_oneButtonActionPerformed

    private void twoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoButtonActionPerformed
        if("0".equals(monedaCambio1.getText()))
            cantidad = "2";
        else
            cantidad += "2";
        monedaCambio1.setText(cantidad);
        getMoney();
    }//GEN-LAST:event_twoButtonActionPerformed

    private void threeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeButtonActionPerformed
        if("0".equals(monedaCambio1.getText()))
            cantidad = "3";
        else
            cantidad += "3";
        monedaCambio1.setText(cantidad);
        getMoney();
    }//GEN-LAST:event_threeButtonActionPerformed

    private void fourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourButtonActionPerformed
        if("0".equals(monedaCambio1.getText()))
            cantidad = "4";
        else
            cantidad += "4";
        monedaCambio1.setText(cantidad);
        getMoney();
    }//GEN-LAST:event_fourButtonActionPerformed

    private void fivaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fivaButtonActionPerformed
        if("0".equals(monedaCambio1.getText()))
            cantidad = "5";
        else
            cantidad += "5";
        monedaCambio1.setText(cantidad);
        getMoney();
    }//GEN-LAST:event_fivaButtonActionPerformed

    private void sixButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixButtonActionPerformed
        if("0".equals(monedaCambio1.getText()))
            cantidad = "6";
        else
            cantidad += "6";
        monedaCambio1.setText(cantidad);
        getMoney();
    }//GEN-LAST:event_sixButtonActionPerformed

    private void sevenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenButtonActionPerformed
        if("0".equals(monedaCambio1.getText()))
            cantidad = "7";
        else
            cantidad += "7";
        monedaCambio1.setText(cantidad);
        getMoney();
    }//GEN-LAST:event_sevenButtonActionPerformed

    private void eightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightButtonActionPerformed
        if("0".equals(monedaCambio1.getText()))
            cantidad = "8";
        else
            cantidad += "8";
        monedaCambio1.setText(cantidad);
        getMoney();
    }//GEN-LAST:event_eightButtonActionPerformed

    private void nineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineButtonActionPerformed
        if("0".equals(monedaCambio1.getText()))
            cantidad = "9";
        else
            cantidad += "9";
        monedaCambio1.setText(cantidad);
        getMoney();
    }//GEN-LAST:event_nineButtonActionPerformed

    private void pointButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointButtonActionPerformed
        if(point){
            if("".equals(cantidad)){
                cantidad = "0.";
            }else{
                cantidad += ".";
            }
            monedaCambio1.setText(cantidad);
            point = false;
        }
    }//GEN-LAST:event_pointButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        cantidad = "0";
        point = true;
        monedaCambio1.setText(cantidad);
        monedaCambio2.setText(cantidad);
    }//GEN-LAST:event_clearButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int size = cantidad.length();
        if(size>0){
            if(size == 1)
                cantidad = "0";
            else
                cantidad = cantidad.substring(0,cantidad.length()-1);
            monedaCambio1.setText(cantidad);
            getMoney();
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    public static void main(String args[]) {
        try{
            UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
        }catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException except) {
            System.out.println(except.getMessage());
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Secundario().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem calculadoraItem;
    private javax.swing.JButton clearButton;
    private javax.swing.JComboBox<String> combomonedaC;
    private javax.swing.JComboBox<String> combomonedaU;
    private javax.swing.JMenuItem conversorItem;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton eightButton;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton fivaButton;
    private javax.swing.JButton fourButton;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel monedaCambio1;
    private javax.swing.JLabel monedaCambio2;
    private javax.swing.JLabel monedaUsuario1;
    private javax.swing.JLabel monedaUsuario2;
    private javax.swing.JButton nineButton;
    private javax.swing.JButton oneButton;
    private javax.swing.JPanel panel;
    private javax.swing.JButton pointButton;
    private javax.swing.JMenuItem salirItem;
    private javax.swing.JPopupMenu.Separator separadorItem;
    private javax.swing.JButton sevenButton;
    private javax.swing.JButton sixButton;
    private javax.swing.JButton threeButton;
    private javax.swing.JButton twoButton;
    private javax.swing.JButton zeroButton;
    // End of variables declaration//GEN-END:variables
}