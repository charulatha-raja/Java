public class TestThrow
{

       public void validate(int age)
       {
           if(age<18)
           {
               throw new ArithmeticException("Person is not elogible to vote");
           }
           else
           {
               System.out.println("Eligible to vote");
           }
       }
        public static void main(String args[])
        {
           TestThrow obj = new TestThrow();
           obj. validate(13);
            System.out.println("rest of the code...");
        }
    }

