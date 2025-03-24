public class Printreverse
{
    public static void main(String[] args) {
//        String str ="Charulatha";
//        String rev ="";
//
//        for (int i=0; i<str.length(); i++)
//        {
//            char ch = str.charAt(i);
//            rev =  ch+rev;
//        }
//        System.out.println(rev);


        String str = "Surya";
        String rev="";

        for(int i=0; i<=str.length();i++)
        {
            char ch = str.charAt(i);
            rev = ch + rev ;
            System.out.println(rev);
        }
    }
}
