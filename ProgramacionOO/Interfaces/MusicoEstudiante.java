public class MusicoEstudiante implements Musico,Estudiante{
   @Override
   public void speak(){
      System.out.println("Im speaking spanish");
   }

   @Override
   public void playMusic(){
      System.out.println("Im playing the guitar");
   }

   @Override
   public void study(){
      System.out.println("Im studying POO");
   }
}
