public class PrintUppercaseCount
{
    public static void main(String[] args) {
        String str = "CHaruLATHA";
        int count =0;
        int lcount =0;

        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);

            if(Character.isUpperCase(ch))
            {
                //for count the lowercase and upper case character of a string
                count++;
            }

            if(Character.isLowerCase(ch))
            {
                lcount++;
            }
        }
        System.out.println(count +  " UpperCase");
        System.out.println(lcount +  " LowerCase");

    }
}
