import java.util.Scanner;

public class Principal{
   public static void initTab(String tablero[][]){
      int n = tablero.length-1;
      for(int i = 0; i<tablero.length ;i++){
         tablero[tablero.length-1][i] = i+" ";
         tablero[n--][0] = i+" ";
      }
      for(int i = 0; i<tablero.length-1 ;i++)
         for(int j = 1; j<tablero[i].length ;j++)
            tablero[i][j] = "0 ";
   }

   public static void showTab(String tablero[][]){
      for(int i = 0; i<tablero.length ;i++){
         for(int j = 0; j<tablero[i].length ;j++)
            System.out.print(tablero[i][j]);
         System.out.println();
      }
   }

   public static void main(String[] args) {
      int x = 0, y = 0, opcion = 0;
      Scanner in = new Scanner(System.in);
      System.out.print("Coordenada inicial en X: "); x = in.nextInt();
      System.out.print("Coordenada inicial en Y: "); y = in.nextInt();
      Tablero new_tab = new Tablero(x,y-1);
      String tablero[][] = new String[10][10];
      initTab(tablero); tablero[new_tab.getY()][new_tab.getX()] = "X ";
      showTab(tablero); tablero[new_tab.getY()][new_tab.getX()] = "0 ";
      System.out.println();

      do{
         int incrementoX = 0, incrementoY = 0;
         System.out.println("\n0-. EXIT\n1-. UP\n2-. DOWN\n3-. RIGTH\n4-. LEFT");
         System.out.println("5-. UP RIGTH\n6-. UP LEFT\n7-. DOWN LEFT\n8-. DOWN RIGTH");
         System.out.print("SELECCIONE UNA OPCION: "); opcion = in.nextInt();
         switch(opcion){
            case 1:
               System.out.print("\nIncremento en Y: ");
               incrementoY = in.nextInt();
               if(new_tab.getY()-incrementoY>=0){
                  new_tab.moveUp(incrementoY);
                  tablero[new_tab.getY()][new_tab.getX()] = "X ";
                  showTab(tablero);
               }
               else
                  System.out.println("---> Coordenadas invalidas <---");
            break;
            case 2:
               System.out.print("\nDecremento en Y: ");
               incrementoY = in.nextInt();
               if(new_tab.getY()+incrementoY<9){
                  new_tab.moveDown(incrementoY);
                  tablero[new_tab.getY()][new_tab.getX()] = "X ";
                  showTab(tablero);
               }
               else
                  System.out.println("---> Coordenadas invalidas <---");
            break;
            case 3:
               System.out.print("\nIncremento en X: ");
               incrementoX = in.nextInt();
               if(new_tab.getX()+incrementoX<10){
                  new_tab.moveRigth(incrementoX);
                  tablero[new_tab.getY()][new_tab.getX()] = "X ";
                  showTab(tablero);
               }
               else
                  System.out.println("---> Coordenadas invalidas <---");
            break;
            case 4:
               System.out.print("\nDecremento en X: ");
               incrementoX = in.nextInt();
               if(new_tab.getX()-incrementoX>0){
                  new_tab.moveLeft(incrementoX);
                  tablero[new_tab.getY()][new_tab.getX()] = "X ";
                  showTab(tablero);
               }
               else
                  System.out.println("---> Coordenadas invalidas <---");
            break;
            case 5:
               System.out.print("\nIncremento en X: "); incrementoX = in.nextInt();
               System.out.print("Incremento en Y: "); incrementoY = in.nextInt();
               if((new_tab.getX()+incrementoX<10)&&(new_tab.getY()-incrementoY>=0)){
                  new_tab.moveUpRigth(incrementoX,incrementoY);
                  tablero[new_tab.getY()][new_tab.getX()] = "X ";
                  showTab(tablero);
               }
               else
                  System.out.println("---> Coordenadas invalidas <---");
            break;
            case 6:
               System.out.print("\nDecremento en X: "); incrementoX = in.nextInt();
               System.out.print("Incremento en Y: "); incrementoY = in.nextInt();
               if((new_tab.getY()-incrementoY>=0)&&(new_tab.getX()-incrementoX>0)){
                  new_tab.moveUpLeft(incrementoX,incrementoY);
                  tablero[new_tab.getY()][new_tab.getX()] = "X ";
                  showTab(tablero);
               }
               else
                  System.out.println("---> Coordenadas invalidas <---");
            break;
            case 7:
               System.out.print("\nDecremento en X: "); incrementoX = in.nextInt();
               System.out.print("Decremento en Y: "); incrementoY = in.nextInt();
               if((new_tab.getX()-incrementoX>0)&&(new_tab.getY()+incrementoY<9)){
                  new_tab.moveDownLeft(incrementoX,incrementoY);
                  tablero[new_tab.getY()][new_tab.getX()] = "X ";
                  showTab(tablero);
               }
               else
                  System.out.println("---> Coordenadas invalidas <---");
            break;
            case 8:
               System.out.print("\nIncremento en X: "); incrementoX = in.nextInt();
               System.out.print("Decremento en Y: "); incrementoY = in.nextInt();
               if((new_tab.getY()+incrementoY<9)&&(new_tab.getX()+incrementoX<10)){
                  new_tab.moveDownRigth(incrementoX,incrementoY);
                  tablero[new_tab.getY()][new_tab.getX()] = "X ";
                  showTab(tablero);
               }
               else
                  System.out.println("---> Coordenadas invalidas <---");
            break;
         }
         tablero[new_tab.getY()][new_tab.getX()] = "0 ";
      }while(opcion != 0);
   }
}
