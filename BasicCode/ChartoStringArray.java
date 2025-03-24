public class ChartoStringArray
{
    public static void main(String[] args) {

        String s="";
        char ch[] = new char[6];
        ch[0]='c';
        ch[1]='H';
        ch[2]='a';
        ch[3]='r';
        ch[4]='u';
        for(int i =0;i< ch.length;i++)
        {
            s = s+ch[i];
//            if(Character.isLowerCase(ch[i]))
//            {
//                s = s+ch[i];
//
//            }

        }
        System.out.println(s);

    }
}
