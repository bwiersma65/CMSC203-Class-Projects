import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * Phase 6.1 - Replaced Scanner object and statements with JOptionPane methods 
 * @author benwiersma
 * CMSC203
 */
public class ClassDemo {
	public static void main(String[] args) {
 
		String name,ans;
		int age;
		Person p;
		
		do {

			name = JOptionPane.showInputDialog("Enter name :");
			
			age = Integer.parseInt(JOptionPane.showInputDialog("Enter age :"));	
			
			p = new Person(name,age);
			
			JOptionPane.showMessageDialog(null, p);

			ans = JOptionPane.showInputDialog("Do you want to continue?");

		}while (ans.equals("y") );		
	}
}
