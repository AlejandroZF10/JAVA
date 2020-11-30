import java.util.Scanner;

public class Principal{
   public static void main(String[] args) {
      int option = 0, entero = 0;
      double real1,imagine1,real2,imagine2;
      Scanner in = new Scanner(System.in);
      NComplejo numA,numB,suma,resta,multiplica;

      do{
         System.out.println("1-. Suma\n2-. Resta\n3-. Multiplicar");
         System.out.println("4-. Multiplicar INT\n5-. Comparar\n6-. Salir");
         System.out.print("\nOpcion: "); option = in.nextInt();

         switch(option){
            case 1:
               System.out.print("\nParte real: "); real1 = in.nextDouble();
               System.out.print("Parte imaginaria: "); imagine1 = in.nextDouble();
               System.out.print("Parte real: "); real2 = in.nextDouble();
               System.out.print("Parte imaginaria: "); imagine2 = in.nextDouble();
               numA = new NComplejo(real1,imagine1);
               numB = new NComplejo(real2,imagine2);
               suma = numA.sumar(numB);
               System.out.println("\nLa suma es: "+suma.getA()+" + "+suma.getB()+"i\n");
            break;
            case 2:
               System.out.print("\nParte real: "); real1 = in.nextDouble();
               System.out.print("Parte imaginaria: "); imagine1 = in.nextDouble();
               System.out.print("Parte real: "); real2 = in.nextDouble();
               System.out.print("Parte imaginaria: "); imagine2 = in.nextDouble();
               numA = new NComplejo(real1,imagine1);
               numB = new NComplejo(real2,imagine2);
               resta = numA.restar(numB);
               System.out.println("\nLa resta es: "+resta.getA()+" + "+resta.getB()+"i\n");
            break;
            case 3:
               System.out.print("\nParte real: "); real1 = in.nextDouble();
               System.out.print("Parte imaginaria: "); imagine1 = in.nextDouble();
               System.out.print("Parte real: "); real2 = in.nextDouble();
               System.out.print("Parte imaginaria: "); imagine2 = in.nextDouble();
               numA = new NComplejo(real1,imagine1);
               numB = new NComplejo(real2,imagine2);
               multiplica = numA.multiplicar(numB);
               System.out.println("\nLa multiplicacion es: "+multiplica.getA()+" + "+multiplica.getB()+"i\n");
            break;
            case 4:
               System.out.print("\nParte real: "); real1 = in.nextDouble();
               System.out.print("Parte imaginaria: "); imagine1 = in.nextDouble();
               System.out.print("Entero a multiplicar: "); entero = in.nextInt();
               numA = new NComplejo(real1,imagine1);
               multiplica = numA.multiplicarInt(entero);
               System.out.println("\nLa multiplicacion es: "+multiplica.getA()+" + "+multiplica.getB()+"i\n");
            break;
            case 5:
               System.out.print("\nParte real: "); real1 = in.nextDouble();
               System.out.print("Parte imaginaria: "); imagine1 = in.nextDouble();
               System.out.print("Parte real: "); real2 = in.nextDouble();
               System.out.print("Parte imaginaria: "); imagine2 = in.nextDouble();
               numA = new NComplejo(real1,imagine1);
               numB = new NComplejo(real2,imagine2);
               if(numA.comparar(numB))
                  System.out.println("\nLos numeros son iguales\n");
               else
                  System.out.println("\nLos numeros NO son iguales\n");
            break;
         }
      }while(option!=6);
   }
}
