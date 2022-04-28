package Pattern;
import java.util.Scanner;


public class Hollow_Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Details Pattern Print : ");
		System.out.println("Enter The Rows : ");
		int Rows  = sc.nextInt();
		System.out.println("Enter The Cols : ");
		int Cols = sc.nextInt();
		
		// Outer Loop
		for(int i = 1; i <= Cols; i++) {
			
			// Inner Loop
			for(int j = 1; j <= Rows; j++) {
				
				
				if( i == 1 || j == 1 || i == Rows || j == Cols) {
					
					System.out.print(" *");
					
				} else {
					
					System.out.print("  ");
				}
				
			}
				System.out.println();
			
		}
		
	}

}
