class Student
{
    private int age;
    private String name;


    public Student()
    {
         age=10;
         name="Ash";
    }
    public Student(int n1, String s)
    {
         this.age=n1;
         this.name=s;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int a)
    {
        this.age=a;
    }

    public String getName()
   {
     return name;
   }

   public void setName(String n)
   {
    name=n;
   }
}




public class DataParamConstructor
 {
    public static void main (String[] args)
    {
       Student obj = new Student( 33,"john")  ;
    
    }
}
