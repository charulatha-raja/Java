class A
{
    public void show()
    {
        System.out.println("In display method");
    }

    class B
    {
        public void show()
        {
            System.out.println("In show method in B");
        }
    }
}
public class DataInnerClass
{
    public static void main(String[] args)
    {
         A obj = new A();
       //  obj.display();

         A.B obj1 = obj.new B();
         obj1.show();

       // A obj = new A ()
//        {
//            public void show()
//            {
//                System.out.println("In show method in B");
//            }
//        };
//         obj.show();


    }
}
