package Class;

import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal extends javax.swing.JFrame {
    private int horas = 0;
    private int minutos = 0;
    private int segundos = 0;
    private int centesima = 0;
    private final Timer time;
    
    public Principal() {
        time = new Timer(10,acciones);
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    private final ActionListener acciones = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            centesima += 1;
            if(centesima == 100){
                segundos += 1;
                centesima = 0;
            }
            if(segundos == 60){
                minutos += 1;
                segundos = 0;
            }
            if(minutos == 60){
                horas += 1;
                minutos = 0;
            }
            String tiempo = (horas<10?"0":"")+horas+":"+(minutos<10?"0":"")+minutos+":"+(segundos<10?"0":"")+segundos+":"+(centesima<10?"0":"")+centesima;
            TimeJL.setText(tiempo);
        }
    };

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelJP = new javax.swing.JPanel();
        IniciarJB = new javax.swing.JButton();
        PausarJB = new javax.swing.JButton();
        TerminarJB = new javax.swing.JButton();
        TituloJL = new javax.swing.JLabel();
        TimeJL = new javax.swing.JLabel();
        FondoJL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cronómetro");
        setResizable(false);

        PanelJP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IniciarJB.setBackground(new java.awt.Color(153, 255, 204));
        IniciarJB.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        IniciarJB.setText("INICIAR");
        IniciarJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarJBActionPerformed(evt);
            }
        });
        PanelJP.add(IniciarJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 110, -1));

        PausarJB.setBackground(new java.awt.Color(153, 255, 204));
        PausarJB.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        PausarJB.setText("PAUSAR");
        PausarJB.setEnabled(false);
        PausarJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PausarJBActionPerformed(evt);
            }
        });
        PanelJP.add(PausarJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 140, 110, -1));

        TerminarJB.setBackground(new java.awt.Color(153, 255, 204));
        TerminarJB.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        TerminarJB.setText("TERMINAR");
        TerminarJB.setEnabled(false);
        TerminarJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TerminarJBActionPerformed(evt);
            }
        });
        PanelJP.add(TerminarJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));

        TituloJL.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        TituloJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloJL.setText("Cronómetro");
        PanelJP.add(TituloJL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 330, -1));

        TimeJL.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        TimeJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TimeJL.setText("00:00:00:00");
        PanelJP.add(TimeJL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 330, -1));

        FondoJL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Fondo.jpg"))); // NOI18N
        PanelJP.add(FondoJL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 190));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelJP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelJP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IniciarJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarJBActionPerformed
        time.start();
        IniciarJB.setText("REANUDAR");
        IniciarJB.setEnabled(false);
        PausarJB.setEnabled(true);
        TerminarJB.setEnabled(true);
    }//GEN-LAST:event_IniciarJBActionPerformed

    private void PausarJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PausarJBActionPerformed
        time.stop();
        IniciarJB.setEnabled(true);
        PausarJB.setEnabled(false);
        TerminarJB.setEnabled(true);
    }//GEN-LAST:event_PausarJBActionPerformed

    private void TerminarJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TerminarJBActionPerformed
        if(time.isRunning())
            time.stop();
        time.stop();
        IniciarJB.setText("INICIAR");
        IniciarJB.setEnabled(true);
        PausarJB.setEnabled(false);
        TerminarJB.setEnabled(false);
        horas = 0;
        minutos = 0;
        segundos = 0;
        centesima = 0;
        TimeJL.setText("00:00:00:00");
    }//GEN-LAST:event_TerminarJBActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoJL;
    private javax.swing.JButton IniciarJB;
    private javax.swing.JPanel PanelJP;
    private javax.swing.JButton PausarJB;
    private javax.swing.JButton TerminarJB;
    private javax.swing.JLabel TimeJL;
    private javax.swing.JLabel TituloJL;
    // End of variables declaration//GEN-END:variables
}