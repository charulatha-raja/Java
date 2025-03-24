public class CountofEvenNumber
{
    public static void main(String[] args)
    {
        int count=0;
        int arr[] = new int[5];
        arr[0] = 8;
        arr[1] = 85;
        arr[2] = 1;
        arr[3] = 3;
        arr[4] = 2;
        for(int i=0;i< arr.length; i++)
        {
            if(arr[i]%2==0)
            {
                count++;
            }
        }
        System.out.println("Even number count is :" + count);
    }
}
