public class ReverseString
{
    public static void main(String[] args)
    {
        String str= "Charulatha";
        //string are immutable so here convert into array by suing toCharArray

        char [] value = str.toCharArray();

        for(int i = value.length-1; i>=0;i--)

        {
            System.out.print(value[i]);
        }

    }
}
