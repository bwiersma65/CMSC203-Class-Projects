/**
 * Phase 2 - Add getter and setter methods to access private class fields
 * @author benwiersma
 * CMSC203
 */
public class Person {
	
	/**
	 * 2 - Fields have been made private; only class members may access them now
	 */
	private String name;
	private int age;

	/**
	 * Setter method
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * Getter method
	 * @return
	 */
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
