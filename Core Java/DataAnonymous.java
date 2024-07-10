class Student
{
    int age;
    String name;
     

    public Student(int age, String name)
    {
        this.age = age;
        this.name= name;
    }


    public void show()
    {
        System.out.println(name);
    }
}



public class DataAnonymous 
{
   public static void main(String [] args)
   {
      new Student(12, "john").show();;

   }    
}
