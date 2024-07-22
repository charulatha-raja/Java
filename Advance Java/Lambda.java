interface A 
{
    void show();
}
public class Lambda 
{
    public static void main(String[] args)
     {
    //    A obj = () -> System.out.println("In show ");

       A obj = new A() {
        public void show() {
            System.out.println("In show "); 
        }
       };
           
        
       obj.show();
    }
}
