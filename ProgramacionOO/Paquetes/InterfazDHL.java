import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class InterfazDHL extends JFrame{
   private JPanel panel;
   private JFrame principal;
   private Double peso;
   private JButton aceptar;
   private JComboBox options;
   private String direccion,ciudad,id;
   private int noSucursal,noPaquete,prioridad,indexS,indexP;
   private Sucursal branch[] = new Sucursal[10];
   private Paquete paquete[] = new Paquete[100];

   public InterfazDHL() {
      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      principal = new JFrame();
      panel = new JPanel();
      principal.setTitle("DHL");
      principal.setVisible(true);
      principal.setLayout(null);
      principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      principal.setBounds((screenSize.width/2)-300,(screenSize.height/2)-300,495,495);
      panel.setVisible(true);
      panel.setLayout(null);
      panel.setBounds(20,60,435,365);
      panel.setOpaque(true);
      panel.setBackground(Color.lightGray);
      principal.add(panel);
      initComponents(); initListeners();
   }

   public void initComponents(){
      indexP = indexS = 0;
      aceptar = new JButton("Aceptar");
      options = new JComboBox();

      options.addItem("Opciones");
      options.addItem("Nueva Sucursal");
      options.addItem("Nuevo Paquete");
      options.addItem("Consultar Sucursal");
      options.addItem("Consultar Paquete");
      options.addItem("Mostrar Sucursal");
      options.addItem("Mostrar Paquete");

      aceptar.setBounds(275,20,100,25); aceptar.setFont(new Font("Arial",Font.BOLD,14));
      options.setBounds(100,20,160,25); options.setFont(new Font("Arial",Font.BOLD,14));
      options.setOpaque(true); options.setBackground(Color.lightGray); options.setVisible(true);

      principal.add(options); principal.add(aceptar);
      principal.revalidate(); principal.repaint();
   }

   public void initListeners(){
      aceptar.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent event){
            switch(options.getSelectedIndex()){
               case 0:
                  JOptionPane.showMessageDialog(null,"Seleccione otra opcion!");
               break;
               case 1:
                  if(indexS<=branch.length)
                     nueva_Sucursal();
                  else
                     JOptionPane.showMessageDialog(null,"Limite de sucursales sobrepasado!");
               break;
               case 2:
                  int index = 0;
                  boolean flag = false;
                  noSucursal = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el numero de Sucursal"));
                  for(int i = 0; i<indexS ;i++){
                     if(branch[i].getNoSucursal() == noSucursal){
                           index = i;
                           flag = true;
                           break;
                     }
                  }
                  if(flag)
                     enviar_Paquete(index);
                  else
                     JOptionPane.showMessageDialog(null,"La Sucursal no existe!");
               break;
               case 3:
                  index = 0;
                  flag = false;
                  noSucursal = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el numero de Sucursal"));
                  for(int i = 0; i<indexS ;i++){
                     if(branch[i].getNoSucursal() == noSucursal){
                           index = i;
                           flag = true;
                           break;
                     }
                  }
                  if(flag)
                     consultar_Sucursal(index);
                  else
                     JOptionPane.showMessageDialog(null,"La Sucursal no existe!");
               break;
               case 4:
                  index = 0;
                  flag = false;
                  noPaquete = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el numero de Paquete"));
                  for(int i = 0; i<indexP ;i++){
                     if(paquete[i].getNoPaquete() == noPaquete){
                           index = i;
                           flag = true;
                           break;
                     }
                  }
                  if(flag)
                     consultar_Paquete(index);
                  else
                     JOptionPane.showMessageDialog(null,"El Paquete no existe!");
               break;
               case 5:
                  if(indexS>0)
                     mostrar_Sucursales();
                  else
                     JOptionPane.showMessageDialog(null,"No hay Sucursales disponibles!");
               break;
               case 6:
                  if(indexP>0)
                     mostrar_Paquetes();
                  else
                     JOptionPane.showMessageDialog(null,"No hay Paquetes disponibles!");
               break;
            }
         }
      });
   }

   public void nueva_Sucursal(){
      JButton doit = new JButton("DO IT!");
      JLabel numeroJL = new JLabel("Numero de Sucursal");
      JLabel direccionJL = new JLabel("Direccion de la Sucursal");
      JLabel ciudadJL = new JLabel("Ciudad de la Sucursal");
      JTextField numeroJT = new JTextField(); numeroJT.setBounds(190,20,225,25); panel.add(numeroJT);
      JTextField direccionJT = new JTextField(); direccionJT.setBounds(215,55,200,25); panel.add(direccionJT);
      JTextField ciudadJT = new JTextField(); ciudadJT.setBounds(200,90,215,25); panel.add(ciudadJT);
      numeroJL.setBounds(20,20,150,25); numeroJL.setFont(new Font("Arial",Font.BOLD,14));
      numeroJL.setOpaque(true); numeroJL.setBackground(Color.lightGray); panel.add(numeroJL);
      direccionJL.setBounds(20,55,175,25); direccionJL.setFont(new Font("Arial",Font.BOLD,14));
      direccionJL.setOpaque(true); direccionJL.setBackground(Color.lightGray); panel.add(direccionJL);
      ciudadJL.setBounds(20,90,160,25); ciudadJL.setFont(new Font("Arial",Font.BOLD,14));
      ciudadJL.setOpaque(true); ciudadJL.setBackground(Color.lightGray); panel.add(ciudadJL);
      doit.setBounds(167,125,100,25); panel.add(doit);
      doit.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent event){
            noSucursal = Integer.parseInt(numeroJT.getText());
            direccion = direccionJT.getText();
            ciudad = ciudadJT.getText();
            branch[indexS++] = new Sucursal(noSucursal,direccion,ciudad);
            JOptionPane.showMessageDialog(null,"Sucursal creada exitosamente!");
            panel.removeAll();
            panel.repaint();
         }
      });
      panel.repaint();
   }

   public void enviar_Paquete(int index){
      JButton doit = new JButton("DO IT!");
      JComboBox prioridadJC = new JComboBox();
      JLabel numeroJL = new JLabel("Numero de Paquete");
      JLabel idJL = new JLabel("ID de la Persona");
      JLabel pesoJL = new JLabel("Peso del Paquete");
      JLabel prioridadJL = new JLabel("Prioridad del Paquete");
      JTextField numeroJT = new JTextField(); numeroJT.setBounds(190,20,225,25); panel.add(numeroJT);
      JTextField idJT = new JTextField(); idJT.setBounds(165,55,250,25); panel.add(idJT);
      JTextField pesoJT = new JTextField(); pesoJT.setBounds(170,90,245,25); panel.add(pesoJT);
      numeroJL.setBounds(20,20,150,25); numeroJL.setFont(new Font("Arial",Font.BOLD,14));
      numeroJL.setOpaque(true); numeroJL.setBackground(Color.lightGray); panel.add(numeroJL);
      idJL.setBounds(20,55,125,25); idJL.setFont(new Font("Arial",Font.BOLD,14));
      idJL.setOpaque(true); idJL.setBackground(Color.lightGray); panel.add(idJL);
      pesoJL.setBounds(20,90,130,25); pesoJL.setFont(new Font("Arial",Font.BOLD,14));
      pesoJL.setOpaque(true); pesoJL.setBackground(Color.lightGray); panel.add(pesoJL);
      prioridadJL.setBounds(20,125,160,25); prioridadJL.setFont(new Font("Arial",Font.BOLD,14));
      prioridadJL.setOpaque(true); prioridadJL.setBackground(Color.lightGray); panel.add(prioridadJL);
      prioridadJC.addItem("Prioridad Normal"); prioridadJC.addItem("Prioridad Alta += 10 dolares");
      prioridadJC.addItem("Prioridad Express += 20 dolares");prioridadJC.setBounds(185,125,230,25);
      prioridadJC.setFont(new Font("Arial",Font.BOLD,14)); prioridadJC.setOpaque(true);
      prioridadJC.setBackground(Color.white); prioridadJC.setVisible(true); panel.add(prioridadJC);
      doit.setBounds(167,160,100,25); panel.add(doit);
      doit.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent event){
            noPaquete = Integer.parseInt(numeroJT.getText());
            id = idJT.getText();
            peso = Double.parseDouble(pesoJT.getText());
            switch(prioridadJC.getSelectedIndex()){
               case 0:
                  prioridad = 0;
               break;
               case 1:
                  prioridad = 1;
               break;
               case 2:
                  prioridad = 2;
               break;
            }
            paquete[indexP] = new Paquete(noPaquete,id,peso,prioridad);
            JOptionPane.showMessageDialog(null,"El precio del envio es: "+branch[index].getPrice(paquete[indexP++]));
            panel.removeAll();
            panel.repaint();
         }
      });
      panel.repaint();
   }

   public void consultar_Sucursal(int index){
      JButton doit = new JButton("DO IT!");
      JLabel noSucursalJL = new JLabel("No. Sucursal: "+branch[index].getNoSucursal());
      JLabel direccionJL = new JLabel("Direccion: "+branch[index].getDireccion());
      JLabel ciudadJL = new JLabel("Ciudad: "+branch[index].getCiudad());
      noSucursalJL.setBounds(20,20,250,25); noSucursalJL.setFont(new Font("Arial",Font.BOLD,14));
      noSucursalJL.setOpaque(true); noSucursalJL.setBackground(Color.lightGray); panel.add(noSucursalJL);
      direccionJL.setBounds(20,55,250,25); direccionJL.setFont(new Font("Arial",Font.BOLD,14));
      direccionJL.setOpaque(true); direccionJL.setBackground(Color.lightGray); panel.add(direccionJL);
      ciudadJL.setBounds(20,90,250,25); ciudadJL.setFont(new Font("Arial",Font.BOLD,14));
      ciudadJL.setOpaque(true); ciudadJL.setBackground(Color.lightGray); panel.add(ciudadJL);
      doit.setBounds(167,125,100,25); panel.add(doit);
      doit.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent event){
            panel.removeAll();
            panel.repaint();
         }
      });
      panel.repaint();
   }

   public void consultar_Paquete(int index){
      JButton doit = new JButton("DO IT!");
      JLabel noPaqueteJL = new JLabel("No. Paquete: "+paquete[index].getNoPaquete());
      JLabel idJL = new JLabel("ID: "+paquete[index].getId());
      JLabel pesoJL = new JLabel("Peso: "+paquete[index].getPeso());
      JLabel prioridadJL = new JLabel("Prioridad: "+paquete[index].getPrioridad());
      noPaqueteJL.setBounds(20,20,250,25); noPaqueteJL.setFont(new Font("Arial",Font.BOLD,14));
      noPaqueteJL.setOpaque(true); noPaqueteJL.setBackground(Color.lightGray); panel.add(noPaqueteJL);
      idJL.setBounds(20,55,250,25); idJL.setFont(new Font("Arial",Font.BOLD,14));
      idJL.setOpaque(true); idJL.setBackground(Color.lightGray); panel.add(idJL);
      pesoJL.setBounds(20,90,250,25); pesoJL.setFont(new Font("Arial",Font.BOLD,14));
      pesoJL.setOpaque(true); pesoJL.setBackground(Color.lightGray); panel.add(pesoJL);
      prioridadJL.setBounds(20,125,250,25); prioridadJL.setFont(new Font("Arial",Font.BOLD,14));
      prioridadJL.setOpaque(true); prioridadJL.setBackground(Color.lightGray); panel.add(prioridadJL);
      doit.setBounds(167,160,100,25); panel.add(doit);
      doit.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent event){
            panel.removeAll();
            panel.repaint();
         }
      });
      panel.repaint();
   }

   public void mostrar_Sucursales(){
      int y = 20;
      JButton doit = new JButton("DO IT!");
      JLabel sucursal[] = new JLabel[indexS];
      for(int i = 0; i<indexS ;i++){
         sucursal[i] = new JLabel(branch[i].getDatos());
         sucursal[i].setBounds(20,y,250,60); sucursal[i].setFont(new Font("Arial",Font.BOLD,14));
         sucursal[i].setOpaque(true); sucursal[i].setBackground(Color.lightGray); panel.add(sucursal[i]);
         panel.repaint();
         y = y + 75;
      }
      doit.setBounds(167,y,100,25); panel.add(doit);
      doit.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent event){
            panel.removeAll();
            panel.repaint();
         }
      });
   }

   public void mostrar_Paquetes(){
      int y = 20;
      JButton doit = new JButton("DO IT!");
      JLabel paquetes[] = new JLabel[indexS];
      for(int i = 0; i<indexP ;i++){
         paquetes[i] = new JLabel(paquete[i].getDatos());
         paquetes[i].setBounds(20,y,250,80); paquetes[i].setFont(new Font("Arial",Font.BOLD,14));
         paquetes[i].setOpaque(true); paquetes[i].setBackground(Color.darkGray); panel.add(paquetes[i]);
         panel.repaint();
         y = y + 95;
      }
      doit.setBounds(167,y,100,25); panel.add(doit);
      doit.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent event){
            panel.removeAll();
            panel.repaint();
         }
      });
   }

   public static void main(String[] args) {
      InterfazDHL DHL = new InterfazDHL();
   }
}
