/**
 * Phase 1 - Create Person class without main method
 * @author benwiersma
 * CMSC203
 */
public class Person {

	/**
	 * Add two fields
	 */
	String name;
	int age;

	/**
	 * Print name and age
	 */
	public void SayName() {
		System.out.println("My name is " + name + " and my age is " + age);
	}

	/**
	 * Increment age by 1
	 */
	public void HaveBirthday() {
		age++;
	}
}
