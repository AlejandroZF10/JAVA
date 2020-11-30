import java.util.Scanner;
import javax.swing.JOptionPane;

public class Simetrica{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int filas = Integer.parseInt(JOptionPane.showInputDialog("Numero de  filas"));
      int columnas = Integer.parseInt(JOptionPane.showInputDialog("Numero de  columnas"));
      int matriz[][] = new int[filas][columnas];
      boolean simetrica = true;

      System.out.println("Digite una matriz");
      for(int i = 0; i<filas ;i++)
         for(int j = 0; j<columnas ;j++){
            System.out.print("Matriz["+i+"]["+j+"]: ");
            matriz[i][j] = in.nextInt();
         }
      if(filas == columnas){
         int i = 0, j = 0;
         while(i<filas && simetrica){
            j = 0;
            while(j<i && simetrica){
               if(matriz[i][j] != matriz[j][i])
                  simetrica = false;
               j = j + 1;
            }
            i = i + 1;
         }
      }
      if(simetrica)
         JOptionPane.showMessageDialog(null,"Matriz Simetrica");
      else
         JOptionPane.showMessageDialog(null,"Matriz NO Simetrica");
   }
}
