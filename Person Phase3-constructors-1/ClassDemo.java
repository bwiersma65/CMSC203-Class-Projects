/**
 * Phase 3 - Added the use of constructors to initialize objects with data passed by programmer
 * @author benwiersma
 * CMSC203
 */
public class ClassDemo {
	public static void main(String[] args) {
		
		/**
		 * Create object with no-arg constructor
		 * Sets fields to default initial values
		 */
		Person a = new Person();
		
		System.out.println(a.getName());
		
		a.setName("Bob");
		
		System.out.println(a.getName());
		
		a.setAge(21);
		
		System.out.println(a.getAge());	

		/**
		 * Create object with parameterized constructor
		 * Passing string to name field
		 */
		Person b = new Person("Kim");
		System.out.println(b.getName());
		System.out.println(b.getAge());	
		
		/**
		 * Create object with parameterized constructor
		 * Passing string and int to respective fields
		 */
		Person c = new Person("John", 40);
		System.out.println(c.getName());
		System.out.println(c.getAge());
		
		// Task for Student
		/**
		 * Create another Person object d using user input
		 * Print to screen
		 */
	
	}
}
