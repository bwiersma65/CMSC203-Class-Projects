public class ClassDemo {
 public static void main(String[] args) {
 // create Person object a
 Person a = new Person();  
  // Assign string to name field
  a.name = "Bob"; 
  // Assign int to age field
  a.age = 25;  
 // create another Person object b
 Person b = new Person();  
  b.name = "Mary"; 
  b.age = 35;  
 a.SayName(); 
 // increments age of a by 1
 a.HaveBirthday();  
 b.SayName(); 
 // increments age of b by 1
 b.HaveBirthday();  
 // age should now be different from that displayed due to line 13 / 16
 a.SayName(); 
 b.SayName(); 
 }
}
