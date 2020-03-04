import java.util.Scanner;

/**
 * Phase 10 - Added query prompting for cities person lived in
 * @author benwiersma
 *
 */
public class ClassDemo {
	public static void main(String[] args) {
	
	 
		String name,ans, city;
		int age, size, cityCount=0;
		double minWage;
		Person p;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter name :");
		name = input.nextLine();
		
		System.out.println("Enter age :");
		age = input.nextInt();
		
		System.out.println("Enter min Wage :");
		minWage  = input.nextInt();
		
		input.nextLine();
		
		p = new Person(name,age,minWage);
		size = p.getDefaultSize();
		
		do 
		{
			System.out.println("Enter the name of the city:");
			city = input.nextLine();
			/**
			 * Invokes method to add city to array
			 */
			p.addCity(city);  
			
			System.out.println("Do you want to add another city: (y/n)");
			ans = input.nextLine();
			cityCount++;
			 
			
		/**
		 * Loops while user answers yes OR number of cities matches capacity of array
		 */
		} while (cityCount<size && ans.equals("y") );
		
		
		System.out.println("Here is the list of cities this person has lived in:");	
		
		System.out.println(p);
		System.out.println(p.citiesLivedIn());
		
		
		input.close();
	}
}
