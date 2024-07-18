enum Status
{
    Running , Failed , Pending ,Success;
}


public class EnumIf
{
    public static void main(String[] args)
     {
        Status s = Status.Failed; // using if else condition
        if(s==Status.Running)
        {
            System.out.println("Running");
        }
        else if (s==Status.Failed)
         {
            System.out.println("Please try again");
        }
        else if (s==Status.Pending)
        {
            System.out.println("Please wait");

        }
        else if (s==Status.Success)
        {
           System.out.println("Done !");
        }

        
    }
    
}
