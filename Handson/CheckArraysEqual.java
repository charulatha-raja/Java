import java.util.Arrays;

public class CheckArraysEqual
{
    public static void main(String[] args)
    {
        int [] a1= {1,2,3,4,5};
        int [] a2 = {1,2,3,4,5};

        // using  in built method
     /*  boolean status= Arrays.equals(a1,a2);
       if(status==true)
       {
           System.out.println("Arrays are equal");
       }
       else {
           System.out.println("Arrays are not equal");
       }*/



        boolean status = true;
        //using another logic check length of an array
        if(a1.length== a2.length)
        {
          // compare the elemets of an array
            for(int i=0; i< a1.length;i++)
            {
                if ((a1[i]!=a2[i]))
                {
                    status=false;
                }

            }
        }
        else
        {
            status=false;
        }
        if(status==true)
        {
            System.out.println("both arrays are equal");
        }
        else
        {
            System.out.println("both arrays are not equal");

        }





    }
}
