import java.util.Scanner;

public class Transpuesta{
   public static void main(String[] args){
      int matriz[][] = new int[3][3];
      Scanner in = new Scanner(System.in);

      System.out.println("Digite una matriz");
      for(int i = 0; i<matriz.length ;i++){
         for(int j = 0; j<matriz[i].length ;j++){
            System.out.print("Matriz["+i+"]["+j+"]: ");
            matriz[i][j] = in.nextInt();
         }
      }

      System.out.println("Matriz original");
      for(int i = 0; i<matriz.length ;i++){
         for(int j = 0; j<matriz[i].length ;j++)
            System.out.print(matriz[i][j]+" ");
         System.out.println();
      }

      int auxiliar = 0;
      for(int i = 0; i<matriz.length ;i++){
         for(int j = 0; j<i ;j++){
            auxiliar = matriz[i][j];
            matriz[i][j] = matriz[j][i];
            matriz[j][i] = auxiliar;
         }
      }

      System.out.println("Matriz Transpuesta");
      for(int i = 0; i<matriz.length ;i++){
         for(int j = 0; j<matriz[i].length ;j++)
            System.out.print(matriz[i][j]+" ");
         System.out.println();
      }
   }
}
