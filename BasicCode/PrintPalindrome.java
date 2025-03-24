public class PrintPalindrome
{
    public static void main(String[] args) {
        String str = "mam";
       // String s = "";
        String rev ="";
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            rev = ch+rev;

        }

        if(str.equalsIgnoreCase(rev))
        {
            System.out.println("It is Palindrome");
        }
        else
        {
            System.out.println("Itn is not Palindrome");
        }
    }
}
