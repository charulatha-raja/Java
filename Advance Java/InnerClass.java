class A 
{
    int a=10;
    public void show()
    {
        System.out.println("In show");
    }

    class B
    {
        public void playMusic()
        {
            System.out.println("Play Music");
        }
    }
}
public class InnerClass 
{
    public static void main(String[] args) 
    {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();
        obj1.playMusic();
    }
}
