public class Tablero{
   private int x;
   private int y;

   public Tablero(int x, int y){
      this.x = x;
      this.y = y;
   }

   public int getX(){
      return this.x;
   }

   public int getY(){
      return this.y;
   }

   public void moveUp(int y){
      this.y -= y;
   }

   public void moveDown(int y){
      this.y += y;
   }

   public void moveRigth(int x){
      this.x += x;
   }

   public void moveLeft(int x){
      this.x -= x;
   }

   public void moveUpRigth(int x, int y){
      this.x += x;
      this.y -= y;
   }

   public void moveUpLeft(int x, int y){
      this.x -= x;
      this.y -= y;
   }

   public void moveDownLeft(int x, int y){
      this.x -= x;
      this.y += y;
   }

   public void moveDownRigth(int x, int y){
      this.x += x;
      this.y += y;
   }
}
