class Ano
{
    public void show()
    {
        System.out.println("In show A");
    }
}
public class AnnonymousInnerclass
{



        public static void main(String[] args)
        {
            Ano obj = new Ano()
            {
                public void show()
                {
                    System.out.println("In show B");
                }
            };

            obj.show();


        }

    }


