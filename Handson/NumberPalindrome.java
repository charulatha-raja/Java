import java.util.Scanner;

public class NumberPalindrome
{
    public static void main(String[] args) {


        int rev=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int  nums = sc.nextInt();
        int org_num = nums;
        while(nums!=0)
        {
            rev= (rev*10)+ nums%10;
            nums = nums/10;

        }
        System.out.println("The reversed numer is "+ rev) ;

        if(org_num==rev)
        {
            System.out.println("The given number is palindrome");
        }
        else {
            System.out.println("The given number is not palindrome");
        }

    }
}
