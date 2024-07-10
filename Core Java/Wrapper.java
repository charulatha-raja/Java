public class Wrapper
 {
    public static void main(String[] args) 
    {
        int n=3;
        Integer obj = n; // auto boxing
        System.out.println(obj);


        int n2 = n; // auto-unboxing
        System.out.println(n2);


        String str = "3";
        int n3 = Integer.parseInt(str); // convert a string into Integer using parseIntmethod 
        System.out.println(n3*2);
    }
}
