import java.util.Random;

public class Randomgn
{
    public static void main(String[] args) {

        // using random class method;

       Random  r = new Random();
       int randnum = r.nextInt();
        System.out.println(randnum);
        Double ranumd = r.nextDouble();
        System.out.println(ranumd);

        // using Math class

        System.out.println(Math.random());

        // using Appache common lang

    }
}
