public class ProductArray
{
    public static void main(String[] args) {
        int prod = 1;
        int oprod=1;
        int arr[] = new int[5];
        arr[0] = 8;
        arr[1] = 2;
        arr[2] = 1;
        arr[3] = 3;
        arr[4] = 8;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                prod = prod * arr[i];
            }

            if(arr[i]%2!=0)
            {
                oprod = oprod * arr[i];
            }
        }
        System.out.println("Product of Even number is :" + prod);
        System.out.println("Product of Odd number is :" + oprod);
    }
}
