@FunctionalInterface
interface Computer 
{
    void display();
}

class Laptop implements Computer
{
    public void display()
    {
        System.out.println("display in Laptop");
    }
}

public class FunctionalInterface1 
{
    public static void main(String[] args)
     {

        Laptop lap = new Laptop();
        lap.display();
        
    }
    
}
