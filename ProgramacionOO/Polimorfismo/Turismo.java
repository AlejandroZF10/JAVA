public class Turismo extends Vehiculo{
   private int noPuertas;

   public Turismo(int noPuertas,String matricula,String marca,String modelo){
      super(matricula,marca,modelo);
      this.noPuertas = noPuertas;
   }

   public int getPuertas(){
      return noPuertas;
   }

   @Override
   public String mostrarDatos(){
      return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+"\No. Puertas: "+noPuertas;
   }
}
