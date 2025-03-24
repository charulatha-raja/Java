public class SumofEvenArray
{
    public static void main(String[] args)
    {
        int sum =0;
        int arr[] = new int[5];
        arr[0]=8;
        arr[1]=2;
        arr[2]=49;
        arr[3]=1;
        arr[4]=8;
        for(int i=0; i< arr.length;i++)
        {
            if(arr[i]%2!=0) // for both even and odd number
            {
                sum = sum+arr[i];
               // System.out.println("Even number is : " + sum);

            }
        }
        System.out.println("Even number is : " + sum);

    }
}
