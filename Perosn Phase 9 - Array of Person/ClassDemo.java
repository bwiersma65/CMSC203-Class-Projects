import java.util.Scanner;

/**
 *  Added component: using arrays to save Person objects
 * 1.Create array persons of type Person of size 5
 * 2.save the Person objects in the persons array
 * 3.Display information of Person objects using a loop
 *  @author  Student (Kian)
 *
 */
/**
 * Phase 9 - Added array for storing Person objects
 * @author benwiersma
 * CMSC203
 */
public class ClassDemo {
	public static void main(String[] args) {
	
		final int SIZE = 5;
		int[] personAges = new int[SIZE];
		Person [] persons = new Person[SIZE];
		
		int numOfPersons = 0;
		String name,ans;
		int age, ageTotal = 0;
		double ageAvg;
		
		Person p;
		Scanner input = new Scanner(System.in);
		
		do {

			System.out.println("Enter name :");
			name = input.nextLine();
			
			System.out.println("Enter age :");
			age = input.nextInt();
			
			personAges[numOfPersons] = age;
			/**
			 * Instantiate Person object, store inside array
			 */
			persons[numOfPersons++] = new Person(name,age,20);  
			
			input.nextLine();
			
			System.out.println("Do you want to continue? y/n");
			ans = input.nextLine();
			
		}while (ans.equals("y") && numOfPersons < SIZE );
		
		System.out.print("You entered : ");

		for (int i = 0; i < numOfPersons; i++) {
			System.out.print(personAges[i]+ " ");
			ageTotal += personAges[i];
		}
		
		ageAvg = (double)ageTotal / (numOfPersons);
		
		System.out.println("\nThe average of ages is " + ageAvg);
		
		System.out.println("Here is the list of persons : ");

		/**
		 * Iterates through Person array, printing each object's toString
		 */
		for (int i = 0; i < numOfPersons; i++)
			System.out.println(persons[i]);
		
		input.close();
	}
}
