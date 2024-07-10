class Laptop
{
    int price;
    String model;

    public String  toString()
    {
        return model + price ;
    }


}



public class ToStringAndEquals 
{
    public static void main(String[] args)
     {
       Laptop obj = new Laptop() ;
       obj.model="lenovo";
       obj.price = 1000;
       obj.toString();
      // System.out.println(obj.toString);
       
    }
}
