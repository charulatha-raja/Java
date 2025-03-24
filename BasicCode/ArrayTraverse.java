public class ArrayTraverse
{
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0]=9;
        arr[1]=3;
        arr[2]=5;
        arr[3]=2;
        arr[4]=8;

        for(int i =0; i<arr.length; i++)
        {
            //print all the elements in the array
           // System.out.println(arr[i]);

            // printh event numbers in an array
            if(arr[i] %2==0)
            {
                System.out.println("Event number : "+  arr[i]);
            }

            if(arr[i]%2 !=0)
            {
                System.out.println("Odd number is " + arr[i]);
            }
        }
    }
}
