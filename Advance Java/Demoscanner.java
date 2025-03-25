import java.util.Scanner;

public class Demoscanner
{
    public static void main(String[] args)
    {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        System.out.println(num);
        System.out.println("Enter a name");
       String s= sc.next();
        System.out.println(s);


    }
}
