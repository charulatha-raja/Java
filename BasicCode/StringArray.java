public class StringArray
{
    public static void main(String[] args) {

        String str[] = new String[5];
        str[0]="Hi";
        str[1]="Charu";
        str[2]="welcome";
        str[3]="TO";
        str[4]="Javaaa";

        for(int i=0; i< str.length;i++)
        {
            if(str[i].length()%2==0)// for printing event lenghth of an array
            {
                System.out.println(str[i]);
            }
            if(str[i].startsWith("J"))
            {
                System.out.println("Strts with :" + str[i]);
            }

            if(str[i].endsWith("u"))
            {
                System.out.println("Ends with : " + str[i]);

            }

        }

    }
}
