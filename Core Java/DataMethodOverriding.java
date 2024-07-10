class A
{
    public int add(int a, int b)
    {
        return a+b;
    }

}


class B extends A
{
    public int add(int a, int b)
    {
        return a+b+2;
    }
}

public class DataMethodOverriding 
{
    public static void main(String[] args)
     {
        B obj = new B();
        int r=obj.add(1, 2);
        System.out.println(r);
    }
}
