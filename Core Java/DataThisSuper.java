class A
{
   public A()
   {
    System.out.println("in A");
   }
}


class B extends A
{
    public B()
    {
        System.out.println("in B");
    }

    public B(int n)
    {
        this();
        System.out.println("in int B");
    }


}


public class DataThisSuper
 {
    public static void main(String[] args)
     {
        B obj = new B(5);

    }
    
}
