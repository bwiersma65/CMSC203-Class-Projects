/**
 * Phase 1 - Create driver class with main method
 * @author benwiersma
 * CMSC203
 */
public class ClassDemo {
	
	 public static void main(String[] args) {
	 
	 /**
	  * Create Person object a
	  */
	 Person a = new Person();  
	 
	  /**
	   * Assign string to name field
	   */
	  a.name = "Bob"; 
	  /**
	   * Assign int to age field
	   */
	  a.age = 25;  
	  
	 /**
	  * Create another Person object b
	  */
	 Person b = new Person();  
	  b.name = "Mary"; 
	  b.age = 35;  
	  
	 a.SayName(); 
	 /**
	  * Increments a age by 1
	  */
	 a.HaveBirthday();  
	 
	 b.SayName(); 
	 /**
	  * Increments b age by 1
	  */
	 b.HaveBirthday();  
	 
	 /**
	  * Age should be different now from that displayed due to line 26 / 32
	  */
	 a.SayName(); 
	 b.SayName(); 
	 
	 }
}
