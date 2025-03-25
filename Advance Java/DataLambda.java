interface ClassA
{
    void show ();
}
public class DataLambda
{
    public static void main(String[] args)
    {
        ClassA obj = ()-> System.out.println("In show interface");
        obj.show();

    }
}
