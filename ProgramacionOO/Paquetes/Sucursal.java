public class Sucursal{
   private int noSucursal;
   private String direccion;
   private String ciudad;

   public Sucursal(int noSucursal, String direccion, String ciudad){
      this.noSucursal = noSucursal;
      this.direccion = direccion;
      this.ciudad = ciudad;
   }

   public int getNoSucursal(){
      return this.noSucursal;
   }

   public String getDireccion(){
      return this.direccion;
   }

   public String getCiudad(){
      return this.ciudad;
   }

   public String getDatos(){
      return "<html><body>No. Sucursal: "+noSucursal+"<br>"+
             "Direccion: "+direccion+"<br>"+
             "Ciudad: "+ciudad+" </body></html>";
   }

   public Double getPrice(Paquete packet){
      double precio = packet.getPeso();
      if(packet.getPrioridad() == 1)
         precio += 10;
      if(packet.getPrioridad() == 2)
         precio += 20;
      return precio;
   }
}
