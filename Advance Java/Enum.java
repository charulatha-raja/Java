enum Status
{
    Running , Failed , Completed , Error ;
}
public class Enum
 
{
    public static void main(String[] args)
     {
       // int i;
       // Status s = Status.Running;
       // System.out.println(s.ordinal());

         Status  ss[] = Status.values();
         for (Status status : ss)
          {
            System.out.println(status);
         }

        
        
       }
    
}
