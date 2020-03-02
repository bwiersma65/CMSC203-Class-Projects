import java.util.Scanner;

/**
 * Phase 4 - Uses Scanner class to instantiate objects with user input 
 * @author benwiersma
 * CMSC203
 */
public class ClassDemo {
	
	public static void main(String[] args) {
		
		Person a = new Person();
		
		System.out.println(a.getName());
		
		a.setName("Bob");
		
		System.out.println(a.getName());
		
		a.setAge(21);
		
		System.out.println(a.getAge());	
		
		
		Person b = new Person("Kim");
		System.out.println(b.getName());
		System.out.println(b.getAge());	
		
		Person c = new Person("John", 40);
		System.out.println(c.getName());
		System.out.println(c.getAge());
		
		/**
		 * Scanner object created for taking input
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the name: ");
		String name = input.nextLine();
		System.out.println("Please enter the age: ");
		int age = input.nextInt();
		
		Person d = new Person(name, age);
		System.out.println(d.getName());
		System.out.println(d.getAge());
		
		int num = 10;
		System.out.println(num);
		System.out.println(d);
		
		 

		input.close();
	}
}
