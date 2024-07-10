class Student
{
    //Using 
    private int age ;
    private String name  ;

    public int getAge ()
    {
        return age;
    }

    

    public String getName()
    {
        return name;
    }
     
}


public class DataEncapsulation
 {
    public static void main (String [] args)
    {
       Student obj = new Student();
       obj.getAge();
       obj.getName();

       System.out.println(obj.getAge() + "\n"  + obj.getName());
       
    }
    
}
