abstract class AClass
{
    public abstract  void display();

    public abstract  void show();
}



public class AbstactAnonymousInnerclass
{
    public static void main(String[] args)
    {
        AClass obj = new AClass()
        {
            public void display()
            {
                System.out.println(" In B display");
            }


            public void show()
            {
                System.out.println("In shhow");

            }
        };

        obj.display();
        obj.show();

    }
}
