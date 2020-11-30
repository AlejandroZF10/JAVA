import java.util.Scanner;
import javax.swing.JOptionPane;

public class Suma{
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int filas = Integer.parseInt(JOptionPane.showInputDialog("Numero de filas"));
      int columnas = Integer.parseInt(JOptionPane.showInputDialog("Numero de columnas"));
      int matriz[][] = new int[filas][columnas];

      System.out.println("Digite una matriz");
      for(int i = 0; i<matriz.length ;i++){
         for(int j = 0; j<matriz[i].length ;j++){
            System.out.print("Matriz["+i+"]["+j+"]: ");
            matriz[i][j] = in.nextInt();
         }
      }

      System.out.println("\nResultado de la matriz");
      for(int i = 0; i<matriz.length ;i++){
         int sumaF = 0;
         for(int j = 0; j<matriz[i].length ;j++){
            System.out.print((matriz[i][j]<10)?"0"+matriz[i][j]+" ":matriz[i][j]+" ");
            sumaF = sumaF + matriz[i][j];
         }
         System.out.println(" = "+sumaF);
      }

      for(int i = 0; i<matriz.length ;i++)
         System.out.print((filas<4)?"= ":"== ");
      System.out.println();

      for(int i = 0; i<matriz.length ;i++){
         int sumaC = 0;
         for(int j = 0; j<matriz[i].length ;j++)
            sumaC = sumaC + matriz[j][i];
         System.out.print(sumaC+" ");
      }
   }
}
