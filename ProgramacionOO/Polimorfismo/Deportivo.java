public class Deportivo extends Vehiculo{
   private int cilindros;

   public Deportivo(int cilindros,String matricula,String marca,String modelo){
      super(matricula,marca,modelo);
      this.cilindros = cilindros;
   }

   public int getCilindros(){
      return cilindros;
   }

   @Override
   public String mostrarDatos(){
      return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+"\nCilindros: "+cilindros;
   }
}
