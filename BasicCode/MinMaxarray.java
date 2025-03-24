public class MinMaxarray
{
    public static void main(String[] args) {


//        int arr[] = new int[5];
//        arr[0] = 87;
//        arr[1] = 200;
//        arr[2] = 1;
//        arr[3] = 83;
//        arr[4] = 8;
//        int max = arr[0]; int min = arr[0];
//
//        for(int i =0; i< arr.length; i++)
//        {
//            if(arr[i]>max)
//            {
//                max=arr[i];
//            }
//
//            if(arr[i]<min)
//            {
//                min=arr[i];
//            }
//        }
//
//        System.out.println("Maximum number in array is :" + max);
//        System.out.println("Minimum number in array is :" + min);

        int arr[] = new int[4];
         arr [0]=100;
        arr[1] = 200;
        arr[2] = 1;
        arr[3] = 83;

        int max = arr[0]; int min = arr[0];

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }

        System.out.println("Maximum number in array is :" + max);

    }
}
