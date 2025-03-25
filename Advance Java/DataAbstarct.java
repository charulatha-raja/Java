abstract class Computer
{
    public  abstract  void show() ;

    public void music ()
    {
        System.out.println("Music playing..");
    }
}

class Laptop extends Computer
{
    public void show ()
    {
        System.out.println("In sjow laptop");
    }
}
public class DataAbstarct
{
    public static void main(String[] args)
    {
         Computer obj = new Laptop();
         obj.show();
         obj.music();
    }
}
