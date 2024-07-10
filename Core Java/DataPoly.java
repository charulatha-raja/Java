class A 
{
    public void show()
    {
        System.out.println("in A show");
    }
}

class B extends A
{
    public void show()
    {
        System.out.println("in B show");
    }
}


public class DataPoly
 {
    public static void main(String[] args) 
    {
        A obj = new B(); // using data dispatch method 
        obj.show();
    }
}