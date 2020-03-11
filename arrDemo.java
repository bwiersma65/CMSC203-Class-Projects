  
import java.util.Scanner;

public class arrDemo {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int[][] arr = new int[3][4];
		
		// students - rows, test scores - columns
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[r].length; c++) {
				arr[r][c] = -1;
			}
		}
		
		
		System.out.println("enter test score 1 for student 2: ");
		arr[1][0] = in.nextInt();
		System.out.println("enter test score 4 for student 1: ");
		arr[0][3] = in.nextInt();
		System.out.println("enter test score 3 for student 3: ");
		arr[2][2] = in.nextInt();
		
		show(arr);
		
		
		int[][] newArray = refCopy(arr); // reference copy of arr
		int[][] deepArray = deepCopy(arr); // deep copy of arr
		System.out.println();
		
		arr[0][0] = 100; // change to original arr array
		show(newArray);
		
		System.out.println();
		
		arr[0][0] = 200; // change to original arr array
		show(deepArray);
	}
	
	// reference copy
	public static int[][] refCopy(int[][] orgArr) {
		int[][] copy = orgArr;
		return copy;
	}
		
	// deep copy
	public static int[][] deepCopy(int[][] orgArr) {
		int[][] copy = new int[orgArr.length][orgArr[0].length];
			
		for (int r = 0; r < orgArr.length; r++) {
			for (int c = 0; c < orgArr[r].length; c++) {
				copy[r][c] = orgArr[r][c];
			}
		}
			
			return copy;
		}
		
		
		
		
		
		
		
	/**
	 * Displays contents of a 2-D array
	 * @param array
	 */
	public static void show(int[][] array) {
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	
}