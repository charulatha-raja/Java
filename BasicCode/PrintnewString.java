public class PrintnewString
{
    public static void main(String[] args) {

        //create a new string contains only a uppercase and lowercase
        String str = " Java WORld";
        String ns ="";
        String lns ="";

        for (int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch))
            {
                ns = ns+ch;
            }
            if (Character.isLowerCase(ch))
            {
                lns = lns+ch;
            }
        }

        System.out.println("Upper Case String is : " + ns);
        System.out.println("Lowe Case String is :" + lns);
    }
}
