public class NumberPalindrome
{
    public static void main(String[] args) {
        int n = 141;
        int temp = n;
        int rev=0;

        while(n>0)
        {
            int reminder=  n%10;
            rev = (rev*10) + reminder;
            n = n/10;

        }
        if(temp==rev)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("its not ");
        }

    }
}
