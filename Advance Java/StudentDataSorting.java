import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student
{
    int rollNo;
    String name ;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
}
public class StudentDataSorting
{
    public static void main(String[] args)
    {

        Comparator<Student> com = new Comparator<Student>() {
            @Override
            public int compare(Student i, Student j)
            {
                if(i.rollNo > j.rollNo)
                {
                    return 1;
                }
                else
                {
                    return  -1;
                }


            }
        };
        List<Student > studs = new ArrayList<>();
        studs.add(new Student(123, "Kim"));
        studs.add(new Student(345, "Jim"));
        studs.add(new Student(234, "Kiran"));
        studs.add(new Student(678, "Paul"));


        Collections.sort(studs, com);
        for(Student s : studs)
        {
            System.out.println(s);
        }


    }
}
