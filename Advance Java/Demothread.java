class AThread extends  Thread
{
    public void run()
    {
        for (int i=0; i<=10; i++)
        {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

class BThread extends  Thread
{
    public void run()
    {
        for (int i=0; i<=10; i++)
        {
            System.out.println("Hellooo");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}


public class Demothread
{

    public static void main(String[] args)
    {
        AThread obj1 = new AThread();
        BThread obj2 = new BThread();

        obj1.start();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        obj2.start();


    }
}
