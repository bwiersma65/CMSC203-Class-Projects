import java.util.Scanner;

/**
 * Phase 5 - Uses a do-while loop to enable creation of multiple objects
 * @author benwiersma
 * CMSC203
 */
public class ClassDemo {
	public static void main(String[] args) {
 
		/**
		 * Revised code to enable user to create new Person object and repeat as desired
		 */
		
		String name,ans;
		int age;
		Person p;
		
		Scanner input = new Scanner(System.in);
		do {

			System.out.println("Enter name :");
			name = input.nextLine();
			
			System.out.println("Enter age :");
			age = input.nextInt();
			
			p = new Person(name,age);
			
			System.out.println(p.getName() + 
					   			" You are " +p.getAge() + " Years old");
			// Read in next line stored in keyboard buffer to prevent erroneous reading
			input.nextLine();
			
			System.out.println("Do you want to continue?");
			ans = input.nextLine();
		}while (ans.equals("y") );
		
		input.close();
	}
}
