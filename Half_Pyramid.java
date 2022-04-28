package Pattern;
import java.util.Scanner;


public class Half_Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("Enter Pyramid Number Print : ");
		
		// Outer Loop
		for(int i = 1; i <= n; i++) {
			
			// Inner Loops
			for(int j = 1; j <= i; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}

}
