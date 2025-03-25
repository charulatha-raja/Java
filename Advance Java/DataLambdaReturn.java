interface  Lap
{
    int add(int i , int j);
}
public class DataLambdaReturn
{
    public static void main(String[] args)
    {
        Lap obj = (int i, int j)->  i+j;


       int res= obj.add(2,3);
        System.out.println(res);


    }
}
