public class Cliente{
   private Cuenta[] count;
   private final int ID;
   private final String nombre;

   public Cliente(int ID, String nombre, Cuenta[] count){
      this.ID = ID;
      this.nombre = nombre;
      this.count = count;
   }

   public int getID(){
      return this.ID;
   }

   public String getName(){
      return this.nombre;
   }

   public double getSaldo(int noCuenta){
      return count[noCuenta].getSaldo();
   }

   public void inSaldo(int noCuenta, double saldo){
      count[noCuenta].inSaldo(saldo);
   }

   public void outSaldo(int noCuenta, double saldo){
      count[noCuenta].outSaldo(saldo);
   }
}
