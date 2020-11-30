import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InterfazGUI extends JFrame{
   private JFrame principal;
   private String nombre;
   private int noCuenta,cantidad,ID;
   private double saldo;
   private Cuenta counts[];
   private Cliente cliente;
   private JLabel nombrelabel,idlabel;
   private ButtonGroup radioBG;
   private JRadioButton consultar,ingresar,retirar;

   public InterfazGUI(){
      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      nombre = JOptionPane.showInputDialog("Introduce tu nombre: ");
      ID = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu ID: "));
      cantidad = Integer.parseInt(JOptionPane.showInputDialog("Numero de cuentas que tienes: "));
      counts = new Cuenta[cantidad];
      for(int i = 0; i<counts.length ;i++){
         noCuenta = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu numero de cuenta: "));
         saldo = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu saldo: "));
         counts[i] = new Cuenta(noCuenta,saldo);
      }
      cliente = new Cliente(ID,nombre,counts);
      principal = new JFrame();
      principal.setTitle("Banamex");
      principal.setVisible(true);
      principal.setLayout(null);
      principal.setLocationRelativeTo(this);
      principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      principal.setBounds((screenSize.width/2)-300,(screenSize.height/2)-75,600,150);
      initComponents();
      initListeners();
   }

   public void initComponents(){
      consultar = new JRadioButton("Consultar",true);
      ingresar = new JRadioButton("Ingresar",false);
      retirar = new JRadioButton("Retirar",false);
      radioBG = new ButtonGroup();
      radioBG.add(consultar);principal.add(consultar);consultar.setBounds(20,60,160,20);consultar.setFont(new Font("Arial",Font.BOLD,14));
      consultar.setBackground(Color.lightGray);consultar.setOpaque(true);consultar.setHorizontalAlignment(SwingConstants.CENTER);
      radioBG.add(ingresar);principal.add(ingresar);ingresar.setBounds(210,60,160,20);ingresar.setFont(new Font("Arial",Font.BOLD,14));
      ingresar.setBackground(Color.lightGray);ingresar.setOpaque(true);ingresar.setHorizontalAlignment(SwingConstants.CENTER);
      radioBG.add(retirar);principal.add(retirar);retirar.setBounds(400,60,160,20);retirar.setFont(new Font("Arial",Font.BOLD,14));
      retirar.setBackground(Color.lightGray);retirar.setOpaque(true);retirar.setHorizontalAlignment(SwingConstants.CENTER);

      nombrelabel = new JLabel(nombre); principal.add(nombrelabel);nombrelabel.setBounds(20,20,350,20);nombrelabel.setFont(new Font("Arial",Font.BOLD,14));
      nombrelabel.setBackground(Color.lightGray);nombrelabel.setOpaque(true);nombrelabel.setHorizontalAlignment(SwingConstants.CENTER);
      idlabel = new JLabel(""+ID);principal.add(idlabel);idlabel.setBounds(400,20,160,20); idlabel.setFont(new Font("Arial",Font.BOLD,14));
      idlabel.setBackground(Color.lightGray);idlabel.setOpaque(true);idlabel.setHorizontalAlignment(SwingConstants.CENTER);
   }

   public void initListeners(){
      consultar.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent event) {
            noCuenta = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de cuenta"));
            noCuenta = buscarCuenta(counts,noCuenta);
            if(noCuenta == -1)
               JOptionPane.showMessageDialog(null,"Numero de cuenta inexistente");
            else
            JOptionPane.showMessageDialog(null,"Saldo disonible: "+cliente.getSaldo(noCuenta));
         }
      });

      retirar.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent event) {
            noCuenta = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de cuenta"));
            noCuenta = buscarCuenta(counts,noCuenta);
            if(noCuenta == -1)
               JOptionPane.showMessageDialog(null,"Numero de cuenta inexistente");
            else{
               saldo = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad a ingresar"));
               if(saldo<=cliente.getSaldo(noCuenta)){
                  cliente.outSaldo(noCuenta,saldo);
                  JOptionPane.showMessageDialog(null,"Saldo actualizado\nSaldo: "+cliente.getSaldo(noCuenta));
               }
               else
                  JOptionPane.showMessageDialog(null,"Saldo insuficiente");
            }
         }
      });

      ingresar.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent event) {
            noCuenta = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de cuenta"));
            noCuenta = buscarCuenta(counts,noCuenta);
            if(noCuenta == -1)
               JOptionPane.showMessageDialog(null,"Numero de cuenta inexistente");
            else{
               saldo = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad a ingresar"));
               cliente.inSaldo(noCuenta,saldo);
               JOptionPane.showMessageDialog(null,"Saldo actualizado\nSaldo: "+cliente.getSaldo(noCuenta));
            }
         }
      });
   }

   public int buscarCuenta(Cuenta[] cuentas,int noCuenta){
      int index = 0;
      boolean flag = false;
      for(int i = 0; i<cuentas.length ;i++){
         if(noCuenta == cuentas[i].getCuenta()){
            index = i;
            flag = true;
            break;
         }
      }
      if(flag)
         return index;
      return -1;
   }

   public static void main(String[] args) {
      InterfazGUI bank = new InterfazGUI();
   }
}
