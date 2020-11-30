import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Poligono>poligono = new ArrayList<Poligono>();
    
    public static void main(String[] args){
        fillPoligono();
        showResult();
    }
    
    public static void fillPoligono(){
        int option = 1;
        do{
            System.out.println("Digite el poligono a ingresar");
            System.out.println("1-. Triangulo\n2-. Rectangulo\n3-. Salir");
            System.out.print("Opcion: "); option = scanner.nextInt();
            switch(option){
                case 1:
                    fillTriangulo();
                break;
                case 2:
                    fillRectangulo();
                break;
                default:
                    System.out.println("Opcion invalida");
            }
        }while(option!=3);        
    }
    
    public static void fillTriangulo(){
        double size1,size2,size3;
        System.out.print("Lado 1 del triangulo = "); size1 = scanner.nextDouble();
        System.out.print("Lado 2 del triangulo = "); size2 = scanner.nextDouble();
        System.out.print("Lado 3 del triangulo = "); size3 = scanner.nextDouble();
        Triangulo triangulo = new Triangulo(size1,size2,size3,3);
        poligono.add(triangulo);        
    }
    
    public static void fillRectangulo(){
        double size1,size2;
        System.out.print("Lado 1 del rectangulo = "); size1 = scanner.nextDouble();
        System.out.print("Lado 2 del rectangulo = "); size2 = scanner.nextDouble();
        Rectangulo rectangulo = new Rectangulo(size1,size2,2);
        poligono.add(rectangulo);
    }
    
    public static void showResult(){
        for(Poligono pol: poligono){
            System.out.println(pol.toString());
            System.out.println("Area = "+pol.area());
            System.out.println("");
        }
    }
}