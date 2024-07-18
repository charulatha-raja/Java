enum Laptop 
{
    Macbook (1000), Lenovo (2000), Hp(3000) , Dell(4000) ;

    private int price ;
    private Laptop (int price)
    {
    this.price=price;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    
}

public class DataEnumClass 
{
    public static void main(String[] args)
     {
        
          Laptop lap = Laptop.Hp;

          System.out.println(lap.getPrice());

          Laptop obj = new Laptop();
    }
}
