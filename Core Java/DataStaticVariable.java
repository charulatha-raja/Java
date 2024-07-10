class Mobile {
    int price;
    String brandName;
    static String name;

    public void printMethod() // instance method
     {
        System.out.println(price + "\n" + brandName + "\n" + name);
    }
}

public class DataStaticVariable {
    public static void main(String[] args
    ) {
        Mobile obj = new Mobile();
        obj.price = 1700;
        obj.brandName = "Samsung";
        Mobile.name = "SmartPhone";

        obj.printMethod();

    }

}
