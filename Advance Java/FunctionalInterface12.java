@FunctionalInterface
interface  Function12
{
    void show();
}
public class FunctionalInterface12
{
    public static void main(String[] args)
    {
        Function12 obj = new Function12()
        {
            @Override
            public void show() {
                System.out.println(" In Functtional interface");
            }
        };

        obj.show();

    }

}
