public class Swap

{
    public static void main (String[] args)
    {
        int a=10;
        int b=20;
        int temp;
        System.out.println("Before swapping the values of " + a  + " " + b);

        //  logic 1 - using third variable
//        temp = a; //t=10
//        a=b; // a=20
//        b= temp; //b=10

//        System.out.println( "After swapping the values " + a + " " + b);

        // logic 2 - using + and - operators

//        a =a + b; // 10+20=30 , a=30
//        b=a-b; // 30-20 , b=10
//        a=a-b; // 30-10 , a=20

        // logic 2 - using single statement

        b= (a+b)- (a=b);
//        b = (10+20) - 20
//        b=30-20 , 10
        System.out.println( "After swapping the values " + a + " " + b);






    }
}
