public class ArrayChara
{
    public static void main(String[] args) {

//        int arr[] = new int[6];
//        arr[0] = 8;
//        arr[1] = 85;
//        arr[2] = 1;
//        arr[3] = 3;
//        arr[4] = 2;
//        arr[5]=5;
//
//        for(int i=0; i< arr.length;i++)
//        {
//            System.out.println(i+1 + " " + arr[i]); // for printing serial number of each array char
//        }

        char ch[] = new char[6];
        ch[0]='c';
        ch[1]='h';
        ch[2]='a';
        ch[3]='r';
        ch[4]='u';

        for(int i=0;i< ch.length;i++)
        {
            if (Character.isUpperCase(ch[i]))
            {
                System.out.println(ch[i]);
            }
        }


    }
}
