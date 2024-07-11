class A
{
    public void show()
    {
        System.out.println("In show A");
    }
}
public class AnonymousInnerClass 
{
    public static void main(String[] args) 
    {
        A obj = new A()
        {
            public void show()
            {
                System.out.println("In show B");
            } 
        };
        obj.show();
    }
    
}
