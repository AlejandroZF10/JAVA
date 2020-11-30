import javax.swing.JOptionPane;

public class Espiral{
   public static void main(String[] args) {
      int size = Integer.parseInt(JOptionPane.showInputDialog("Tamaño de la matriz"));
      int matriz[][] = new int[size][size];
      int contador = size * size;

      int a = 0 , b = size - 1;
      for(int j = 0; j<matriz.length ;j++){
         for(int i = a; i<=b ;i++) //Derecha -> izquierda
            matriz[a][i] = contador--;
         for(int i = a + 1; i<=b ;i++) //Arriba -> abajo
            matriz[i][b] = contador--;
         for(int i = b - 1; i>=a ;i--) //Izquierda -> derecha
            matriz[b][i] = contador--;
         for(int i = b - 1; i>=a+1 ;i--) //Abajo -> arriba
            matriz[i][a] = contador--;
         a = a + 1;
         b = b - 1;
      }

      for(int i = 0; i<size ;i++){
         for(int j = 0; j<size ;j++){
            if(size<=3)
               System.out.print(matriz[i][j]+" ");
            else if(size<10)
               System.out.print((matriz[i][j]<10)?"0"+matriz[i][j]+" ":matriz[i][j]+" ");
            else if(size<32)
               if(matriz[i][j]<10)
                  System.out.print("00"+matriz[i][j]+" ");
               else if(matriz[i][j]<100)
                  System.out.print("0"+matriz[i][j]+" ");
               else
                  System.out.print(matriz[i][j]+" ");
         }
         System.out.println();
      }
   }
}
