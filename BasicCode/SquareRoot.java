public class SquareRoot
{
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0]=9;
        arr[1]=25;
        arr[2]=49;
        arr[3]=2;
        arr[4]=8;

        for(int i=0;i< arr.length; i++)
        {
         double res=   Math.sqrt(arr[i]);
            System.out.println(res);
        }
    }
}
