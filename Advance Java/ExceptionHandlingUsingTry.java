public class ExceptionHandlingUsingTry 
{
    public static void main(String[] args) 
    {// normal statement
        // int i =4;
        // int j =20;

        // j =20/i;

        // System.out.println(j);

        //by using exception handling try catch

        int i =0;
        int j =8;
        try
        {
            j = 8/i;

        }
        catch (Exception e)
        {
            System.out.println("Something went wrong ....");
        }
        

        System.out.println("Eception handled!");


        


        
    }
    
}
