// using this keyword
class Student
{
    private int age;
    private String name;


    public int getAge()
    {
          return age;
    }

    public void setAge(int age)
    {
      this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}



public class ThisData 
{
    public static void main (String [] args)
    {
        Student obj = new Student();
        obj.setAge(45);
        obj.setName("Kiran");

        System.out.println(obj.getAge() + "\n" + obj.getName()) ;

    }
    
}
