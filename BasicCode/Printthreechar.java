public class Printthreechar
{
    public static void main(String[] args) {
        String str= "kim hai kimm say";
        String w = "";
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch!=' ')
            {
                w +=ch;
            }
            else {
                if(w.length()==3)
                {
                    System.out.println(w);

                }
                w=" ";
                System.out.println(w);
            }
        }
    }
}
