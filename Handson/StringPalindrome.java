import java.util.Scanner;

public class StringPalindrome
{
    public static void main(String[] args) {

        String str;
        String rev="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name :");
        str=sc.nextLine();
        String orgstr= str;

        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            rev = ch+rev;
        }
        System.out.println("The reversed string is:" + rev);
        if(orgstr.equalsIgnoreCase(rev))
        {
            System.out.println("The given string is palindrome");
        }
        else {
            System.out.println("The given string is not palindrome");
        }
    }
}
