public class ThrowsException
{
    public void show() throws  ClassNotFoundException
    {
        Class.forName("char");
    }
    public static void main(String[] args)
    {
        ThrowsException obj = new ThrowsException();
        try {
            obj.show();
        } catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
