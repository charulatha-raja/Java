import java.util.Arrays;

public class Fibonocci
{
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findFib(0, 1)));
    }

    public static int[] findFib(int n1,int n2){
         int sum =0;
         int [] arr=new int[10];
         arr[0]=0;
         arr[1]=1;
        for (int i =2 ; i<10; i++)
        {
            sum = n1+n2;
            arr[i]=sum;
            n1=n2;
            n2=sum;
        }
        return arr;
    }
}
