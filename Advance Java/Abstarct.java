abstract class  Car
{
     public  abstract void playMusic();
    
}

class Tata extends Car
{
   public void playMusic()
   {
      System.out.println("Tata , Play music");
   }
}



public class Abstarct
{
   public static void main(String[] args)
    {
       Car obj = new  Tata();
       obj.playMusic();
   }
}