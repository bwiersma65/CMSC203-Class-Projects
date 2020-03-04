/**
 * Phase 6 - Added a toString class method
 * @author benwiersma
 * CMSC203
 */
public class Person {

	private String name;
	private int age;

	
	public Person()
	{
		name = "noname";
		age = 1;
	}

	public Person(String name)
	{
		this.name = name;
		age = 1;
	}
	
	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	

	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return age;
	}
	
	
	public void SayName() {
		System.out.println("My name is " + name + " and my age "
							+ "is " + age);
	}

	public void HaveBirthday() {
		age++;
	}
	
	/**
	 * toString method returns a String 
	 * representing a Person object
	 * @return returns String representation of object
	 */
	public String toString()
	{
		return "The person's name is " + 
				name + " and their age is " + age;
	}
}
