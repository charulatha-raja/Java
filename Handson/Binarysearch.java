public class Binarysearch
{
    public static void main(String[] args)
    {
        int [] a = {1,2,3,4,5,6,7,8,9,10}; // array should br in sorted order
        boolean flag = false;
        int key = 27;
        int l =0;
        int h = a.length-1;

        while(l<=h)
        {
            int m = (l+h)/2;
            if(a[m]==key)
            {
                System.out.println("Element found");
                flag = true;
                break;
            }
            if(key>a[m])
            {
                l = m+1;
            }
            if(key<a[m])
            {
                h=m-1;
            }
        }

        if(flag==false)
        {
            System.out.println("Element not found");
        }


    }
}
