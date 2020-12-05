package Class;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;

public class Principal extends javax.swing.JFrame {
    DefaultMutableTreeNode noderoot = new DefaultMutableTreeNode("Raiz");
    DefaultTreeModel modelotree = new DefaultTreeModel(noderoot);
    
    public Principal() {
        initTree();
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    private void initTree(){
        DefaultMutableTreeNode nodecolor = new DefaultMutableTreeNode("Colores");
        DefaultMutableTreeNode nodered = new DefaultMutableTreeNode("Rojo");
        DefaultMutableTreeNode nodeblue = new DefaultMutableTreeNode("Azul");
        DefaultMutableTreeNode nodesport = new DefaultMutableTreeNode("Deportes");
        DefaultMutableTreeNode nodefutbol = new DefaultMutableTreeNode("Fútbol");
        DefaultMutableTreeNode nodebasket = new DefaultMutableTreeNode("Basket");
        noderoot.add(nodecolor);
        noderoot.add(nodesport);
        nodecolor.add(nodered);
        nodecolor.add(nodeblue);
        nodesport.add(nodefutbol);
        nodesport.add(nodebasket);
    }
    
    private void eventSelectedNode(DefaultMutableTreeNode selectednode){
        switch(selectednode.toString()){
            case "Rojo":
                imagelabel.setBackground(Color.RED);
            break;
            case "Azul":
                imagelabel.setBackground(Color.BLUE);
            break;
            case "Fútbol":
                ImageIcon image = new ImageIcon(getClass().getResource("/Image/Futbol.jpg"));
                imagelabel.setIcon(new ImageIcon(image.getImage().getScaledInstance(380,275,Image.SCALE_SMOOTH)));
            break;
            case "Basket":
                image = new ImageIcon(getClass().getResource("/Image/Basket.jpg"));
                imagelabel.setIcon(new ImageIcon(image.getImage().getScaledInstance(380,275,Image.SCALE_SMOOTH)));
            break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollpane = new javax.swing.JScrollPane();
        principaltree = new javax.swing.JTree();
        imagelabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TreeSelectionListener listener = new TreeSelectionListener(){
            @Override
            public void valueChanged(TreeSelectionEvent event){
                DefaultMutableTreeNode selectednode = (DefaultMutableTreeNode)principaltree.getLastSelectedPathComponent();
                eventSelectedNode(selectednode);
            }
        };
        principaltree.getSelectionModel().addTreeSelectionListener(listener);
        principaltree.setModel(modelotree);
        scrollpane.setViewportView(principaltree);

        imagelabel.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(scrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagelabel, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollpane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagelabel, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
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
       
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagelabel;
    private javax.swing.JTree principaltree;
    private javax.swing.JScrollPane scrollpane;
    // End of variables declaration//GEN-END:variables
}