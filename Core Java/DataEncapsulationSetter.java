

class Student
{
	private int age;
	private String name;
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int a)
	{
		age = a;
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
}



public class DataEncapsulationSetter
{

	public static void main(String[] args)
	{
		Student obj = new Student();
		obj.setAge(35);
		obj.setName("Kiran");
		
		System.out.println(obj.getAge() + "\n" + obj.getName());
		
	}

}
