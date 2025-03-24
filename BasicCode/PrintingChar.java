public class PrintingChar
{
    public static void main(String[] args) {
        String str = "charulatha Raja";
        for(int i=0 ; i<str.length(); i++)
        {
            char ch = str.charAt(i);
           // System.out.println(ch + ":" + (int )ch); // print ascii code of the character

            if(Character.isUpperCase(ch)) // print Uppercase & lowercase char from a string
            {
                System.out.println(ch);
            }

        }

    }
}
