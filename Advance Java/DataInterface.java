interface  S
{

    int age =12;
    String name ="Kiran";
    void show();
}
 class R implements  S
 {
     public  void show()
     {
         System.out.println("In show ");
     }
 }

public class DataInterface
{
    public static void main(String[] args)
    {
        S obj = new R();
        obj.show();
        System.out.println(S.age);

    }
}
