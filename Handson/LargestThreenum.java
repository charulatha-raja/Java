import java.util.Scanner;

public class LargestThreenum
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a = sc.nextInt();

        System.out.println("Enter the second number :");
        int b = sc.nextInt();

        System.out.println("Enter the third number :");
        int c = sc.nextInt();

        // approach 1
//        if(a>b && a>c)
//        {
//            System.out.println(a + " is greatest number");
//        } else if (b>a && b>c)
//        {
//            System.out.println(b + " is greatest number");
//
//        }
//        else
//        {
//            System.out.println(c+ " is greatest number");
//        }

        // approach 2  using ternary operator

     int l = a>b ? a:b; // largest of a and b
        int res = c>l ? c:l;
        System.out.println(res);


    }
}
