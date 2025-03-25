public class ExceptionMultipletrycatch
{
    public static void main(String[] args)
    {
        int i =0;
        int j =0;
        int nums[] = new int[5];
        String str= null;
        try
        {
            j = 8/2;
            System.out.println(str.length());
             System.out.println(nums[1]);
            System.out.println(nums[5]);

        }
        catch (NullPointerException e)
        {
            System.out.println("getting NullPointerException");
        }


        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(" Getting ArrayIndexOutOfBoundsException" );
        }
        catch (Exception e) // parent class
        {
            System.out.println("Something went wrong" + e);
        }

    }
}
