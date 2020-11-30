public class Cuenta{
   private int noCuenta;
   private double saldo;

   public Cuenta(int noCuenta, double saldo){
      this.noCuenta = noCuenta;
      this.saldo = saldo;
   }

   public int getCuenta(){
      return this.noCuenta;
   }

   public double getSaldo(){
      return this.saldo;
   }

   public void inSaldo(double saldo){
      this.saldo += saldo;
   }

   public void outSaldo(double saldo){
      this.saldo -= saldo;
   }
}
