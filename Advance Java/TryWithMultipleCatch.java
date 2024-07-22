public class TryWithMultipleCatch
 {
    public static void main(String[] args) 
    {
        int i =2;
        int j =8;
        int []nums = new int[5];
        String s = null;
        s.length();


        try
        {
            j=8/i;
            System.out.println(s);
            System.out.println(nums[5]);
            
        }
        catch(ArithmeticException e) //using single catch 
        {
            System.out.println("Cannot divide by Zero" );
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException" );
        }

        catch(Exception e)
        {
            System.out.println("Something went wrong"  );
        }
        
        
    }
    
}
