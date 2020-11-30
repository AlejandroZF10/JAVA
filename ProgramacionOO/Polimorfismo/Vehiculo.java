public class Vehiculo{
   protected String matricula;
   protected String marca;
   protected String modelo;

   public Vehiculo(String matricula,String marca,String modelo){
      this.matricula = matricula;
      this.marca = marca;
      this.modelo = modelo;
   }

   public String getMatricula(){
      return this.matricula;
   }

   public String getMarca(){
      return this.marca;
   }

   public String getModelo(){
      return this.modelo;
   }

   public String mostrarDatos(){
      return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo;
   }
}
