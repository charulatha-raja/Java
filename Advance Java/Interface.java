interface Student 
{

    int marks =77;
    public void studentMarks();
    public void studentRollNO();

}

class School implements Student
{

    public void studentMarks()
    {
      System.out.println("stud details");  
        
    }

   
    public void studentRollNO()
     {
        System.out.println("stud rollNo");  
     }
    
}

public class Interface 
{
    public static void main(String[] args)
    {
        Student obj = new School();
        obj.studentMarks();
        obj.studentRollNO();
        System.out.println(Student.marks);
    }
    
}
