enum Status
{
    Running , Failed , Pending ,Success;
}

public class EnumSwitch
 {
    public static void main(String[] args)
     {
        Status s = Status.Success;
        switch (s) 
        {
            case Running:
                System.out.println("Running successfully ");
                break;

            case Failed:
            System.out.println("Please try again");
            break;
            
            case Pending:
            System.out.println("Please wait");
            break;

           
        
            default:
            System.out.println("Successfully done");
                break;
        }
        
    }
    
}
