public class DemoException
{
    public static void main(String[] args)
    {
        int i = 0;
        int j =9;

       // j = 9/0;
 // using try and catch block handling exception
        try
        {
            j = 8/0;
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong" + e );
        }

    }
}
