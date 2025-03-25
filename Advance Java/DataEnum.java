enum Status
{
    Running , Failed , Success , Pending;
}
public class DataEnum
{
    public static void main(String[] args)
    {

//        Status  [] s = Status.values() ;
//        for (Status ss : s)
//        {
//            System.out.println(ss + ":" + ss.ordinal());
//        }


        Status s = Status.Running;
        switch (s)
        {
            case Running :
                System.out.println("All Good ");
                break;


            case Pending :
                System.out.println("Pls Waitd ");
                break;


            case Failed :
                System.out.println("Pls Try again ");
                break;


            case Success :
                System.out.println("Done");
                break;


        }


    }
}
