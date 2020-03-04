/**
 * Phase 5 - No change from previous phase
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
}
