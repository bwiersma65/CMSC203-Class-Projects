import java.util.Scanner;

/**
 * Phase 6 - toString method used
 * @author benwiersma
 * CMSC203
 */
public class ClassDemo {
	public static void main(String[] args) {
 
		
		
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
			
			/**
			 * In passing object p, the class toString method is implicitly invoked
			 */
			System.out.println(p);
			
			System.out.println(p.getName() + 
					   			" You are " +p.getAge() + " Years old");

			input.nextLine();
			
			System.out.println("Do you want to continue?");
			ans = input.nextLine();
		}while (ans.equals("y") );
		
		input.close();
	}
}
