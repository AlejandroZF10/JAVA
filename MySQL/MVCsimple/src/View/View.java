package View;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class View extends javax.swing.JFrame {

    public View() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numberoneTF = new javax.swing.JTextField();
        numbertwoTF = new javax.swing.JTextField();
        resultTF = new javax.swing.JTextField();
        plusLB = new javax.swing.JLabel();
        titleLB = new javax.swing.JLabel();
        operationTB = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        numberoneTF.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        numberoneTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        numbertwoTF.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        numbertwoTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        resultTF.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        resultTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        plusLB.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        plusLB.setText("+");

        titleLB.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        titleLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLB.setText("IMPLEMENTACIÓN MVC SIMPLE");

        operationTB.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        operationTB.setText("+");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(numberoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(plusLB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numbertwoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(operationTB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(resultTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plusLB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numbertwoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(operationTB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try{
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException except){
            System.err.println(except.getMessage());
        }
        java.awt.EventQueue.invokeLater(() -> {
            new View().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField numberoneTF;
    public javax.swing.JTextField numbertwoTF;
    public javax.swing.JToggleButton operationTB;
    public javax.swing.JLabel plusLB;
    public javax.swing.JTextField resultTF;
    public javax.swing.JLabel titleLB;
    // End of variables declaration//GEN-END:variables
}