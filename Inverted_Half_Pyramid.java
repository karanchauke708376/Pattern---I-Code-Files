package Pattern;
import java.util.Scanner;

public class Inverted_Half_Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Pyramid Pattern Print : ");
		int n = sc.nextInt();
		
		// Outer Loop
		for(int i = n; i >= 1; i--) {
			
			// Inner Loop 
			for(int j = 1; j <= i; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
	}

}
