package Class;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Principal extends javax.swing.JFrame {
    private int count = 0;
    private int nouser1 = 0, nouser2 = 0, nodeath = 0;
    private boolean turn = true; //True - Jugador 1 / False - Jugador 2
    private final int winner[][] = new int[3][3]; //1 - Jugador 1 / 2 - Jugador 2
    private final boolean boxes[][] = new boolean[3][3];
    private final String nameuser1,nameuser2;
            
    public Principal(String nameuser1,String nameuser2) {
        initBoxes();
        initComponents();
        this.nameuser1 = nameuser1;
        this.nameuser2 = nameuser2;
        this.setSize(600,615);
        this.setLocationRelativeTo(null);
    }
    
    private void initBoxes(){
        for(int i = 0; i<3 ;i=i+1)
            for(int j = 0; j<3 ;j=j+1){
                boxes[i][j] = true;
                winner[i][j] = 0;
            }
    }
    
    private void setCross(JButton button){
        button.setIcon(new ImageIcon(getClass().getResource("/Image/Cruz.png")));
    }
    
    private void setCircle(JButton button){
        button.setIcon(new ImageIcon(getClass().getResource("/Image/Circulo.png")));
    }
    
    private void getWinner(){
        if(checkWinner(1)){
            nouser1 += 1;
            Ganador winnerwindow = new Ganador(this,true,nameuser1);
            winnerwindow.setVisible(true);
            restartGame();
        }else if(checkWinner(2)){
            nouser2 += 1;
            Ganador winnerwindow = new Ganador(this,true,nameuser2);
            winnerwindow.setVisible(true);
            restartGame();
        } else{
            for(int i = 0; i<3 ;i=i+1)
                for(int j = 0; j<3 ;j=j+1)
                    if(winner[i][j]!=0){
                        count += 1;
                    }
            if(count == 9){
                nodeath += 1;
                Empate deadheat = new Empate(this,true);
                deadheat.setVisible(true);
                restartGame();
            } else{
                count = 0;
            }
        }
    }
    
    private boolean checkWinner(int numero){
        boolean result = false;
        if((winner[0][0] == numero)&&(winner[0][1] == numero)&&(winner[0][2] == numero)){
            result = true;
        }else if((winner[1][0] == numero)&&(winner[1][1] == numero)&&(winner[1][2] == numero)){
            result = true;
        }else if((winner[2][0] == numero)&&(winner[2][1] == numero)&&(winner[2][2] == numero)){
            result = true;
        }else if((winner[0][0] == numero)&&(winner[1][0] == numero)&&(winner[2][0] == numero)){
            result = true;
        }else if((winner[0][1] == numero)&&(winner[1][1] == numero)&&(winner[2][1] == numero)){
            result = true;
        }else if((winner[0][2] == numero)&&(winner[1][2] == numero)&&(winner[2][2] == numero)){
            result = true;
        }else if((winner[0][0] == numero)&&(winner[1][1] == numero)&&(winner[2][2] == numero)){
            result = true;
        }else if((winner[0][2] == numero)&&(winner[1][1] == numero)&&(winner[2][0] == numero)){
            result = true;
        }
        return result;
    }
    
    private void restartGame(){
        initBoxes();
        upleftButton.setIcon(null);
        upButton.setIcon(null);
        uprightButton.setIcon(null);
        leftButton.setIcon(null);
        centerButton.setIcon(null);
        rightButton.setIcon(null);
        downleftButton.setIcon(null);
        downButton.setIcon(null);
        downrightButton.setIcon(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principal = new javax.swing.JPanel();
        upleftButton = new javax.swing.JButton();
        upButton = new javax.swing.JButton();
        uprightButton = new javax.swing.JButton();
        leftButton = new javax.swing.JButton();
        centerButton = new javax.swing.JButton();
        rightButton = new javax.swing.JButton();
        downleftButton = new javax.swing.JButton();
        downButton = new javax.swing.JButton();
        downrightButton = new javax.swing.JButton();
        menubar = new javax.swing.JMenuBar();
        menugame = new javax.swing.JMenu();
        newgameItem = new javax.swing.JMenuItem();
        resultItem = new javax.swing.JMenuItem();
        separator = new javax.swing.JPopupMenu.Separator();
        exitItem = new javax.swing.JMenuItem();
        helpgame = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        principal.setLayout(new java.awt.GridLayout(3, 3));

        upleftButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upleftButtonActionPerformed(evt);
            }
        });
        principal.add(upleftButton);

        upButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upButtonActionPerformed(evt);
            }
        });
        principal.add(upButton);

        uprightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uprightButtonActionPerformed(evt);
            }
        });
        principal.add(uprightButton);

        leftButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftButtonActionPerformed(evt);
            }
        });
        principal.add(leftButton);

        centerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                centerButtonActionPerformed(evt);
            }
        });
        principal.add(centerButton);

        rightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightButtonActionPerformed(evt);
            }
        });
        principal.add(rightButton);

        downleftButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downleftButtonActionPerformed(evt);
            }
        });
        principal.add(downleftButton);

        downButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downButtonActionPerformed(evt);
            }
        });
        principal.add(downButton);

        downrightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downrightButtonActionPerformed(evt);
            }
        });
        principal.add(downrightButton);

        menugame.setText("Juego");
        menugame.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N

        newgameItem.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        newgameItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Nuevo juego.png"))); // NOI18N
        newgameItem.setText("Nuevo juego");
        newgameItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newgameItemActionPerformed(evt);
            }
        });
        menugame.add(newgameItem);

        resultItem.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        resultItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Resultados.png"))); // NOI18N
        resultItem.setText("Resultados");
        resultItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultItemActionPerformed(evt);
            }
        });
        menugame.add(resultItem);
        menugame.add(separator);

        exitItem.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        exitItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Salir.png"))); // NOI18N
        exitItem.setText("Salir");
        exitItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitItemActionPerformed(evt);
            }
        });
        menugame.add(exitItem);

        menubar.add(menugame);

        helpgame.setText("Ayuda");
        helpgame.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        helpgame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpgameMouseClicked(evt);
            }
        });
        menubar.add(helpgame);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void upleftButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upleftButtonActionPerformed
        if(boxes[0][0]){
            if(turn){
                turn = false;
                winner[0][0] = 1;
                setCross(upleftButton);
            }else{
                turn = true;
                winner[0][0] = 2;
                setCircle(upleftButton);
            }
            boxes[0][0] = false;
            getWinner();
        }
    }//GEN-LAST:event_upleftButtonActionPerformed

    private void upButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upButtonActionPerformed
        if(boxes[0][1]){
            if(turn){
                turn = false;
                winner[0][1] = 1;
                setCross(upButton);
            }else{
                turn = true;
                winner[0][1] = 2;
                setCircle(upButton);
            }
            boxes[0][1] = false;
            getWinner();
        }
    }//GEN-LAST:event_upButtonActionPerformed

    private void uprightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uprightButtonActionPerformed
        if(boxes[0][2]){
            if(turn){
                turn = false;
                winner[0][2] = 1;
                setCross(uprightButton);
            }else{
                turn = true;
                winner[0][2] = 2;
                setCircle(uprightButton);
            }
            boxes[0][2] = false;
            getWinner();
        }
    }//GEN-LAST:event_uprightButtonActionPerformed

    private void leftButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftButtonActionPerformed
        if(boxes[1][0]){
            if(turn){
                turn = false;
                winner[1][0] = 1;
                setCross(leftButton);
            }else{
                turn = true;
                winner[1][0] = 2;
                setCircle(leftButton);
            }
            boxes[1][0] = false;
            getWinner();
        }
    }//GEN-LAST:event_leftButtonActionPerformed

    private void centerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_centerButtonActionPerformed
        if(boxes[1][1]){
            if(turn){
                turn = false;
                winner[1][1] = 1;
                setCross(centerButton);
            }else{
                turn = true;
                winner[1][1] = 2;
                setCircle(centerButton);
            }
            boxes[1][1] = false;
            getWinner();
        }
    }//GEN-LAST:event_centerButtonActionPerformed

    private void rightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightButtonActionPerformed
        if(boxes[1][2]){
            if(turn){
                turn = false;
                winner[1][2] = 1;
                setCross(rightButton);
            }else{
                turn = true;
                winner[1][2] = 2;
                setCircle(rightButton);
            }
            boxes[1][2] = false;
            getWinner();
        }
    }//GEN-LAST:event_rightButtonActionPerformed

    private void downleftButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downleftButtonActionPerformed
        if(boxes[2][0]){
            if(turn){
                turn = false;
                winner[2][0] = 1;
                setCross(downleftButton);
            }else{
                turn = true;
                winner[2][0] = 2;
                setCircle(downleftButton);
            }
            boxes[2][0] = false;
            getWinner();
        }
    }//GEN-LAST:event_downleftButtonActionPerformed

    private void downButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downButtonActionPerformed
        if(boxes[2][1]){
            if(turn){
                turn = false;
                winner[2][1] = 1;
                setCross(downButton);
            }else{
                turn = true;
                winner[2][1] = 2;
                setCircle(downButton);
            }
            boxes[2][1] = false;
            getWinner();
        }
    }//GEN-LAST:event_downButtonActionPerformed

    private void downrightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downrightButtonActionPerformed
        if(boxes[2][2]){
            if(turn){
                turn = false;
                winner[2][2] = 1;
                setCross(downrightButton);
            }else{
                turn = true;
                winner[2][2] = 2;
                setCircle(downrightButton);
            }
            boxes[2][2] = false;
            getWinner();
        }
    }//GEN-LAST:event_downrightButtonActionPerformed

    private void newgameItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newgameItemActionPerformed
        nouser1 = 0;
        nouser2 = 0;
        nodeath = 0;
        restartGame();
    }//GEN-LAST:event_newgameItemActionPerformed

    private void resultItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultItemActionPerformed
        Resultados result = new Resultados(this,true,nameuser1,nameuser2,nouser1,nouser2,nodeath);
        result.setVisible(true);
    }//GEN-LAST:event_resultItemActionPerformed

    private void exitItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitItemActionPerformed

    private void helpgameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpgameMouseClicked
        try{
            Desktop.getDesktop().browse(new URI("https://github.com/AlejandroZF10/Java"));
        }catch(URISyntaxException | IOException ex){
            
        }
    }//GEN-LAST:event_helpgameMouseClicked
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton centerButton;
    private javax.swing.JButton downButton;
    private javax.swing.JButton downleftButton;
    private javax.swing.JButton downrightButton;
    private javax.swing.JMenuItem exitItem;
    private javax.swing.JMenu helpgame;
    private javax.swing.JButton leftButton;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JMenu menugame;
    private javax.swing.JMenuItem newgameItem;
    private javax.swing.JPanel principal;
    private javax.swing.JMenuItem resultItem;
    private javax.swing.JButton rightButton;
    private javax.swing.JPopupMenu.Separator separator;
    private javax.swing.JButton upButton;
    private javax.swing.JButton upleftButton;
    private javax.swing.JButton uprightButton;
    // End of variables declaration//GEN-END:variables
}