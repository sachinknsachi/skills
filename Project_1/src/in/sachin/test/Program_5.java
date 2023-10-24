package in.sachin.test;

public class Program_5 {
	/* 	Write a program to print
	 
	  	* * * * * * * * * * * * * * 
		* * * * * * * 
		* * * * * * 
		* * * * * 
		* * * * 
		* * * 
		* * 
		* 
		* * 
		* * * 
		* * * * 
		* * * * * 
		* * * * * * 
		* * * * * * * 
		* * * * * * * * * * * * * * 
	
	 */
	public static void main(String[] args) {
		int rows = 14;
		for (int i=1; i<=rows; i++) {
			System.out.print("* ");
		}
		System.out.println();
		
		for (int i=0; i<=rows/2 -1; i++) {
			for (int j=1; j <= (rows/2) - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int i=3; i<=rows/2 +1; i++) {
			for (int j=1; j<i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int i=1; i<=rows; i++) {
			System.out.print("* ");
		}
	}
}


