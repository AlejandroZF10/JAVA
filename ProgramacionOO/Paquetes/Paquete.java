public class Paquete{
   private int noPaquete;
   private String id;
   private Double peso;
   private int prioridad;

   public Paquete(int noPaquete, String id, Double peso, int prioridad){
      this.noPaquete = noPaquete;
      this.id = id;
      this.peso = peso;
      this.prioridad = prioridad;
   }

   public int getNoPaquete(){
      return this.noPaquete;
   }

   public String getId(){
      return this.id;
   }

   public Double getPeso(){
      return this.peso;
   }

   public int getPrioridad(){
      return this.prioridad;
   }

   public String getDatos(){
      String priority = "Prioridad: ";
      switch(prioridad){
         case 0:
            priority = priority+" Normal";
         break;
         case 1:
            priority = priority+" Alta";
         break;
         case 2:
            priority = priority+" Express";
         break;
      }
      return "<html><body>No. Paquete: "+noPaquete+"<br>"+
             "ID: "+id+"<br>"+"Peso: "+peso+" kg<br>"
             +priority+"</body></html>";
   }
}
