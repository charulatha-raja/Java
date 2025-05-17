import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class EmployeDetails
{
    private int id;
    private String name;
    private int age;
    private long salary;
    private String gender;
    private String deptName;
    private String city;


    public EmployeDetails( int id,String name, int age,long salary,String gender,String deptName,String city)
    {
        this.id=id;
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.gender=gender;
        this.deptName=deptName;
        this.city=city;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getSalary() {
        return salary;
    }

    public String getGender() {
        return gender;
    }

    public String getDeptName() {
        return deptName;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "EmployeDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                ", deptName='" + deptName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
public class Employee
{
    public static void main(String[] args) {
        List<EmployeDetails> emp= Arrays.asList
                (new EmployeDetails(1,"Ram", 22, 20000,"Male","CSE","Chennai"),
                new EmployeDetails(2,"kiran", 22, 20000,"Male","CSE","Chennai"),
                new EmployeDetails(3,"Rosy", 33, 45000,"Female","ECE","Trichy"),
                new EmployeDetails(4,"John", 45, 23000,"Male","EEE","Kochi")
        );




        long highestSalary = emp.stream()
                .mapToLong(EmployeDetails::getSalary)
                .max().orElse(0);
        System.out.println("The highestSalary is :" + highestSalary);

        //Group the Employees by city.

        Map<String, List<EmployeDetails> > empCity = emp.stream()
                .collect(Collectors.groupingBy(EmployeDetails::getCity));

       // empCity.forEach(n-> System.out.println(n));

        System.out.println("Group the Employees by Citty :\n " + empCity);

        //Find the count of male and female employees present in the organization.

        Map<String, Long> noOfMaleFemale = emp.stream()
                .collect(Collectors.groupingBy( EmployeDetails::getGender, Collectors.counting()));
        System.out.println(noOfMaleFemale);

        //Group the Employees by dept .

        Map<String, List<EmployeDetails>> empDept = emp.stream()
                .collect(Collectors.groupingBy(EmployeDetails::getDeptName));

    List<String> uNames= emp.stream()
            .map(n->n.getName().toUpperCase())
            .collect(Collectors.toList());
        System.out.println(uNames);

        //5. Print employee details whose age is greater than 18.
        List<EmployeDetails> empAge = emp.stream()
                .filter(a->a.getAge()>33)
                .collect(Collectors.toList());
        System.out.println(empAge);


    }






}

