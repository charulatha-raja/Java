// class Student
// {
//     private int rollNo;
//     private String name;



//     public Student()
//     {
//         rollNo =1234;
//          name ="John";
//     }

//     public int getRollNo()
//     {
//           return rollNo;
//     }

//     public void setRollNo(int rollNo)
//     {
//        this.rollNo = rollNo;
//     }

//     public String getName()
//     {
//         return name;
//     }

//     public void setName(String name)
//     {
//         this.name = name;
//     }




// }




// public class DataConstructor 
// {
//     public static void main (String [] args)
//     {
//         Student obj = new Student();
       
//         System.out.println(obj.getRollNo());
//     }
// }






class Student
{
	private int age;
	private String name;
	
	public Student()
	{
		age=10;
		name = " Kim";
	}


	public Student(int a1 , String n1)
	{
      this.age=a1;
	  this.name =n1;
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
		this.name = n ;
	}
}


public class DataConstructor
{

	public static void main(String[] args)
	{
		Student  obj = new Student(40,"John");
		System.out.println (obj.getAge() + "\n" + obj.getName());
		
		
	}

}
