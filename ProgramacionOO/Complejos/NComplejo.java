public class NComplejo{
   private double numA;
   private double numB;

   public NComplejo(double numA, double numB){
      this.numA = numA;
      this.numB = numB;
   }

   public double getA(){
      return this.numA;
   }

   public double getB(){
      return this.numB;
   }

   public NComplejo sumar(NComplejo numero){
      return new NComplejo(numA+numero.getA(),numB+numero.getB());
   }

   public NComplejo restar(NComplejo numero){
      return new NComplejo(numA-numero.getA(),numB-numero.getB());
   }

   public NComplejo multiplicar(NComplejo numero){
      return new NComplejo((numA*numero.getA()-numB-numero.getB()),(numA*numero.getB()+numB*numero.getA()));
   }

   public NComplejo multiplicarInt(int numero){
      return new NComplejo(numero*numA,numero*numB);
   }

   public boolean comparar(NComplejo numero){
      if((numA == numero.getA())&&(numB == numero.getB()))
         return true;
      return false;
   }
}
