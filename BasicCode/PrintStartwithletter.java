public class PrintStartwithletter
{

        public static void main(String[] args) {

            String str = "Welcome ReactJ";
            String w ="";

            for (int i=0; i<str.length(); i++)
            {
                char ch = str.charAt(i);
                if(ch!=' ')
                {
                    w += ch;


                }


                  // System.out.println(w.charAt(0)); // print the 1st letter of each character

                    if(w.startsWith("R"))
                    {

                        System.out.println(w);
                        w="";
                    }
                    else
                    {
                        w="";

                    }





            }


        }
    }


