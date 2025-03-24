public class Removespace
{
    public static void main(String[] args) {

        String str = " Welcome to the java world ReactJ";
        String w ="";

        for (int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch != ' ')
            {
                w += ch;
            }
            else
            {
                if(w.startsWith("R"))
                {
                    System.out.println(w);
                }


            }
        }

    }
}
