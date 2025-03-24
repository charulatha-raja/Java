public class CaseArray
{
    public static void main(String[] args) {
        char ch[] = new char[7];
        ch[0]='c';
        ch[1]='H';
        ch[2]='a';
        ch[3]='r';
        ch[4]='u';
        ch[5]=' ';

        for(int i=0;i< ch.length;i++)
        {
            // similar for lower case .islowecase
            // for only digits : isDigit(ch[i])
            // for only remove all space : (!character.isspace(ch[i])
            if (Character.isUpperCase(ch[i]))
            {
                System.out.println("Uppercase is : " + ch[i]);
            }

            if (Character.isLowerCase(ch[i]))
            {
                System.out.println("Lowe case is : " + ch[i]);
            }
            if(Character.isSpaceChar(ch[i]))
            {
                System.out.println(ch[i]);
            }


        }
    }
}
