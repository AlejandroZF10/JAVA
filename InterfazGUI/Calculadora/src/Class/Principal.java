package Class;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Principal extends javax.swing.JFrame {
    private String operation = "NULL";
    private String cadenanum = "";
    private double firstnum;
    private double secondnum;
    private double result;
    private boolean point = true;
    private boolean activate = true;
    
    public Principal() {
        initComponents();
        this.setSize(300,450);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panel = new javax.swing.JPanel();
        muestraLabel = new javax.swing.JLabel();
        numeroLabel = new javax.swing.JLabel();
        clearButton = new javax.swing.JButton();
        sqrtButton = new javax.swing.JButton();
        piButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        nineButton = new javax.swing.JButton();
        eightButton = new javax.swing.JButton();
        sevenButton = new javax.swing.JButton();
        sixButton = new javax.swing.JButton();
        fiveButton = new javax.swing.JButton();
        fourButton = new javax.swing.JButton();
        threeButton = new javax.swing.JButton();
        twoButton = new javax.swing.JButton();
        oneButton = new javax.swing.JButton();
        equalsButton = new javax.swing.JButton();
        zeroButton = new javax.swing.JButton();
        pointButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        restButton = new javax.swing.JButton();
        multButton = new javax.swing.JButton();
        divButton = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        calculadoraItem = new javax.swing.JMenuItem();
        conversorItem = new javax.swing.JMenuItem();
        separadorItem = new javax.swing.JPopupMenu.Separator();
        salirItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setLayout(new java.awt.GridBagLayout());

        muestraLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        muestraLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        panel.add(muestraLabel, gridBagConstraints);

        numeroLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        numeroLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        numeroLabel.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        panel.add(numeroLabel, gridBagConstraints);

        clearButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        clearButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Limpiar.png"))); // NOI18N
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(clearButton, gridBagConstraints);

        sqrtButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Raiz.png"))); // NOI18N
        sqrtButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqrtButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(sqrtButton, gridBagConstraints);

        piButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Pi.png"))); // NOI18N
        piButton.setToolTipText("");
        piButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(piButton, gridBagConstraints);

        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Borrar.png"))); // NOI18N
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(deleteButton, gridBagConstraints);

        nineButton.setBackground(new java.awt.Color(204, 204, 204));
        nineButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        nineButton.setText("9");
        nineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(nineButton, gridBagConstraints);

        eightButton.setBackground(new java.awt.Color(204, 204, 204));
        eightButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        eightButton.setText("8");
        eightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(eightButton, gridBagConstraints);

        sevenButton.setBackground(new java.awt.Color(204, 204, 204));
        sevenButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        sevenButton.setText("7");
        sevenButton.setToolTipText("");
        sevenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(sevenButton, gridBagConstraints);

        sixButton.setBackground(new java.awt.Color(204, 204, 204));
        sixButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        sixButton.setText("6");
        sixButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(sixButton, gridBagConstraints);

        fiveButton.setBackground(new java.awt.Color(204, 204, 204));
        fiveButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        fiveButton.setText("5");
        fiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(fiveButton, gridBagConstraints);

        fourButton.setBackground(new java.awt.Color(204, 204, 204));
        fourButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        fourButton.setText("4");
        fourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(fourButton, gridBagConstraints);

        threeButton.setBackground(new java.awt.Color(204, 204, 204));
        threeButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        threeButton.setText("3");
        threeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(threeButton, gridBagConstraints);

        twoButton.setBackground(new java.awt.Color(204, 204, 204));
        twoButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        twoButton.setText("2");
        twoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(twoButton, gridBagConstraints);

        oneButton.setBackground(new java.awt.Color(204, 204, 204));
        oneButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        oneButton.setText("1");
        oneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(oneButton, gridBagConstraints);

        equalsButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        equalsButton.setText("=");
        equalsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(equalsButton, gridBagConstraints);

        zeroButton.setBackground(new java.awt.Color(204, 204, 204));
        zeroButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        zeroButton.setText("0");
        zeroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(zeroButton, gridBagConstraints);

        pointButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        pointButton.setText(".");
        pointButton.setToolTipText("");
        pointButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(pointButton, gridBagConstraints);

        addButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        addButton.setText("+");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(addButton, gridBagConstraints);

        restButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        restButton.setText("-");
        restButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(restButton, gridBagConstraints);

        multButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        multButton.setText("X");
        multButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(multButton, gridBagConstraints);

        divButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        divButton.setText("/");
        divButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(divButton, gridBagConstraints);

        fileMenu.setText("Opciones");
        fileMenu.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N

        calculadoraItem.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        calculadoraItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Calculadora.png"))); // NOI18N
        calculadoraItem.setText("Calculadora");
        fileMenu.add(calculadoraItem);

        conversorItem.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        conversorItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Conversor.png"))); // NOI18N
        conversorItem.setText("Conversor");
        conversorItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conversorItemActionPerformed(evt);
            }
        });
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

    private void conversorItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conversorItemActionPerformed
        Secundario divisas = new Secundario();
        divisas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_conversorItemActionPerformed

    private void salirItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirItemActionPerformed

    private void zeroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroButtonActionPerformed
        if(!"".equals(cadenanum)){
            cadenanum += "0";
            numeroLabel.setText(cadenanum);
            activate = true;
        }
        
    }//GEN-LAST:event_zeroButtonActionPerformed

    private void oneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneButtonActionPerformed
        if("0".equals(numeroLabel.getText()))
            cadenanum = "1";
        else
            cadenanum += "1";
        numeroLabel.setText(cadenanum);
        activate = true;
    }//GEN-LAST:event_oneButtonActionPerformed

    private void twoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoButtonActionPerformed
        if("0".equals(numeroLabel.getText()))
            cadenanum = "2";
        else
            cadenanum += "2";
        numeroLabel.setText(cadenanum);
        activate = true;
    }//GEN-LAST:event_twoButtonActionPerformed

    private void threeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeButtonActionPerformed
        if("0".equals(numeroLabel.getText()))
            cadenanum = "3";
        else
            cadenanum += "3";
        numeroLabel.setText(cadenanum);
        activate = true;
    }//GEN-LAST:event_threeButtonActionPerformed

    private void fourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourButtonActionPerformed
        if("0".equals(numeroLabel.getText()))
            cadenanum = "4";
        else
            cadenanum += "4";
        numeroLabel.setText(cadenanum);
        activate = true;
    }//GEN-LAST:event_fourButtonActionPerformed

    private void fiveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveButtonActionPerformed
        if("0".equals(numeroLabel.getText()))
            cadenanum = "5";
        else
            cadenanum += "5";
        numeroLabel.setText(cadenanum);
        activate = true;
    }//GEN-LAST:event_fiveButtonActionPerformed

    private void sixButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixButtonActionPerformed
        if("0".equals(numeroLabel.getText()))
            cadenanum = "6";
        else
            cadenanum += "6";
        numeroLabel.setText(cadenanum);
        activate = true;
    }//GEN-LAST:event_sixButtonActionPerformed

    private void sevenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenButtonActionPerformed
        if("0".equals(numeroLabel.getText()))
            cadenanum = "7";
        else
            cadenanum += "7";
        numeroLabel.setText(cadenanum);
        activate = true;
    }//GEN-LAST:event_sevenButtonActionPerformed

    private void eightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightButtonActionPerformed
        if("0".equals(numeroLabel.getText()))
            cadenanum = "8";
        else
            cadenanum += "8";
        numeroLabel.setText(cadenanum);
        activate = true;
    }//GEN-LAST:event_eightButtonActionPerformed

    private void nineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineButtonActionPerformed
        if("0".equals(numeroLabel.getText()))
            cadenanum = "9";
        else
            cadenanum += "9";
        numeroLabel.setText(cadenanum);
        activate = true;
    }//GEN-LAST:event_nineButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        if(activate){
            if(!"".equals(cadenanum)){
                operation = "Sumar";
                firstnum = Double.parseDouble(cadenanum);
                muestraLabel.setText(cadenanum+" +");
                cadenanum = "";
                activate = false;
                point = true;
            }
        }
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void restButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restButtonActionPerformed
        if(activate){
            if(!"".equals(cadenanum)){
                operation = "Restar";
                firstnum = Double.parseDouble(cadenanum);
                muestraLabel.setText(cadenanum+" -");
                cadenanum = "";
                activate = false;
                point = true;
            }
        }
    }//GEN-LAST:event_restButtonActionPerformed

    private void multButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multButtonActionPerformed
        if(activate){
            if(!"".equals(cadenanum)){
                operation = "Multiplicar";
                firstnum = Double.parseDouble(cadenanum);
                muestraLabel.setText(cadenanum+" X");
                cadenanum = "";
                activate = false;
                point = true;
            }
        }
    }//GEN-LAST:event_multButtonActionPerformed

    private void divButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divButtonActionPerformed
        if(activate){
            if(!"".equals(cadenanum)){
                operation = "Dividir";
                firstnum = Double.parseDouble(cadenanum);
                muestraLabel.setText(cadenanum+" /");
                cadenanum = "";
                activate = false;
                point = true;
            }
        }
    }//GEN-LAST:event_divButtonActionPerformed

    private void equalsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsButtonActionPerformed
        if(operation.equals("NULL")){
            numeroLabel.setText(cadenanum);
        }else{
            switch(operation){
                case "Sumar":
                    secondnum = Double.parseDouble(cadenanum);
                    result = firstnum + secondnum;
                    numeroLabel.setText(String.format("%.2f",result));
                    cadenanum = String.valueOf(result);
                break;
                case "Restar":
                    secondnum = Double.parseDouble(cadenanum);
                    result = firstnum - secondnum;
                    numeroLabel.setText(String.format("%.2f",result));
                    cadenanum = String.valueOf(result);
                break;
                case "Multiplicar":
                    secondnum = Double.parseDouble(cadenanum);
                    result = firstnum * secondnum;
                    numeroLabel.setText(String.format("%.2f",result));
                    cadenanum = String.valueOf(result);
                break;
                case "Dividir":
                    secondnum = Double.parseDouble(cadenanum);
                    result = firstnum / secondnum;
                    numeroLabel.setText(String.format("%.2f",result));
                    cadenanum = String.valueOf(result);
                break;
            }
        }
        activate = true;
        operation = "NULL";
        muestraLabel.setText("");
    }//GEN-LAST:event_equalsButtonActionPerformed

    private void pointButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointButtonActionPerformed
        if(point){
            if("".equals(cadenanum)){
                cadenanum += "0.";
                numeroLabel.setText(cadenanum);
            }else{
                cadenanum += ".";
                numeroLabel.setText(cadenanum);
            }
            point = false;
        }     
    }//GEN-LAST:event_pointButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        if(cadenanum.length()>0){
            if(cadenanum.length() ==  1)
                cadenanum = "0";
            else
                cadenanum = cadenanum.substring(0,cadenanum.length()-1);
            numeroLabel.setText(cadenanum);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void sqrtButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqrtButtonActionPerformed
        if(activate){
            if(!"".equals(cadenanum)){
                firstnum = Double.parseDouble(cadenanum);
                muestraLabel.setText("sqrt("+cadenanum+")");
                cadenanum = "";
                result = Math.sqrt(firstnum);
                numeroLabel.setText(String.format("%.2f",result));
                cadenanum = String.valueOf(result);
                point = true;
            }
        }
    }//GEN-LAST:event_sqrtButtonActionPerformed

    private void piButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piButtonActionPerformed
        cadenanum += "3.1416";
        numeroLabel.setText(cadenanum);
        activate = true;
    }//GEN-LAST:event_piButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        muestraLabel.setText("");
        numeroLabel.setText("0");
        cadenanum = "0";
        operation = "NULL";
        activate = true;
        point = true;
    }//GEN-LAST:event_clearButtonActionPerformed

    public static void main(String args[]) {
        try{
            UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
        }catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException except) {
            System.out.println(except.getMessage());
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JMenuItem calculadoraItem;
    private javax.swing.JButton clearButton;
    private javax.swing.JMenuItem conversorItem;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton divButton;
    private javax.swing.JButton eightButton;
    private javax.swing.JButton equalsButton;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton fiveButton;
    private javax.swing.JButton fourButton;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel muestraLabel;
    private javax.swing.JButton multButton;
    private javax.swing.JButton nineButton;
    private javax.swing.JLabel numeroLabel;
    private javax.swing.JButton oneButton;
    private javax.swing.JPanel panel;
    private javax.swing.JButton piButton;
    private javax.swing.JButton pointButton;
    private javax.swing.JButton restButton;
    private javax.swing.JMenuItem salirItem;
    private javax.swing.JPopupMenu.Separator separadorItem;
    private javax.swing.JButton sevenButton;
    private javax.swing.JButton sixButton;
    private javax.swing.JButton sqrtButton;
    private javax.swing.JButton threeButton;
    private javax.swing.JButton twoButton;
    private javax.swing.JButton zeroButton;
    // End of variables declaration//GEN-END:variables
}