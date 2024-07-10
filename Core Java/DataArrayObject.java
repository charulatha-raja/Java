class Student
{
        int rollNo;
        String name;
        int marks;
}

public class DataArrayObject
{
    public static void main(String[] args)
    {
        
        Student s1 = new Student();
        s1.rollNo = 123;
        s1.name ="kiran";
        s1.marks = 99;

        Student s2 = new Student();
        s2.rollNo =  234;
        s2.name = "kim";
        s2.marks =  88;


        Student s3 = new Student();
        s3.rollNo = 888;
        s3.name = "Ram";
        s3.marks = 77;
              
        

        Student[] studs = new Student[3];
        studs[0] = s1;
        studs[1] = s2;
        studs[2] = s3;
        
        // for(int i=0; i<studs.length; i++)
        // {
        //     System.out.println("name" + ":" + studs[i].name+"\n"+"rollNo" + ":" + studs[1].rollNo + "\n" + "marks" + ":" + studs[i].marks  );
        //     System.out.println();
        // }

        for (Student obj : studs) // using fro each loop
        {
            System.out.println("name" + ":" + obj.name  + "\n" + "rollNo" + ":" + obj.rollNo + "\n" + "marks" + ":" + obj.marks);
            System.out.println();
            }
    }
}


