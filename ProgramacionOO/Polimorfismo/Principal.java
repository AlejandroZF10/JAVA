public class Principal{
   public static void main(String[] args) {
      Vehiculo arraycar[] = new Vehiculo[3];

      arraycar[0] = new Vehiculo("909-NGR","Ferrari","A7");
      arraycar[1] = new Turismo(2,"ZCJ-302","Audi","Q5");
      arraycar[2] = new Deportivo(8,"457-GHJ","Mazda","C3");

      for(Vehiculo index: arraycar)
         System.out.println(index.mostrarDatos());
   }
}
