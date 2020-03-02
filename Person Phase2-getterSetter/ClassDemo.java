/**
 Phase 2 - Changed to utilize getter and setter methods to access private fields
*/
public class ClassDemo {
	
	public static void main(String[] args) {
		
		Person a = new Person();
		
		/**
		 Call setter to set name field to "Bob"
		*/
		a.setName("Bob");
		
		/**
		 Call getter to print name to screen
		*/
		System.out.println(a.getName());
		
		a.setAge(21);
		
		System.out.println(a.getAge());	
	}
}
