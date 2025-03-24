public class TwoDigitArray
{
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0]=19;
        arr[1]=35;
        arr[2]=55;
        arr[3]=2;
        arr[4]=8;

        for(int i =0; i<arr.length; i++)
        {
            //divisible by 5
            if(arr[i]%5==0)
            {
                System.out.println(arr[i]);
            }
        }
    }
}
