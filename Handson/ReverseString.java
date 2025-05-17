import java.util.Scanner;

public class ReverseString
{
    public static void main(String[] args) {

        String str;  String rev ="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name :");
         str= sc.nextLine(); // for string using nextline

        for(int i=0; i<str.length();i++)
        {
            char ch = str.charAt(i); //returns the character at the specified index in a string.
            rev = ch+rev;

        }
        System.out.println("The reversed string is: "+ rev);
    }
}
