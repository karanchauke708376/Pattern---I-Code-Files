package Pattern;
import java.util.Scanner;

public class Solid_Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Details Pattern Print : ");
		System.out.println("Enter The Number Cols : ");
		int cols = sc.nextInt();
		System.out.println("Enter The Number Row : ");
		int rows = sc.nextInt();
		
		// Outer Loop 
		for(int i = 1; i <= cols; i++) {
			
			// Inner Loop
			for(int j = 1; j <= rows; j++) {
				
				System.out.print(" *");
			}
			
			System.out.println();
		}
		
	}

}
