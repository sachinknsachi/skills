package in.sachin.test;

public class Program_3 {
	/* Write a program to print 
	 
	 	* * * * * * * * * * * * * * 
		* * * * * *     * * * * * * 
		* * * * *         * * * * * 
		* * * *             * * * * 
		* * *                 * * * 
		* *                     * * 
		*                         * 
		*                         *   
		*                         *   
		*                         *   
		*                         *   
		*                         *   
		*                         *  
		* * * * * * * * * * * * * * 
	
	*/
	public static void main(String[] args) {
		int rows = 7;
		for (int i=0; i<rows; i++) {
			
			for (int j=1; j<=rows-i; j++) {
				System.out.print("* ");
			}
			for (int j=1; j<=i*2; j++) {
				System.out.print("  ");
			}
			for (int j=1; j<=rows-i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i=0; i<rows-1; i++) {
			for (int j=0; j<=rows*2; j++) {
				if (j == 0 || j == rows*2-1)
					System.out.print("* ");
				else System.out.print("  ");
			}
			System.out.println();
		}
		for (int i=0; i<rows*2; i++) {
			System.out.print("* ");
		}
		
	}
}


