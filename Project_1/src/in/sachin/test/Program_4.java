package in.sachin.test;

public class Program_4 {
	/* 	Write a program to print
	 
	  	*                         * 
		* *                     * * 
		* * *                 * * * 
		* * * *             * * * * 
		* * * * *         * * * * * 
		* * * * * *     * * * * * * 
		* * * * * * * * * * * * * * 
		* * * * * * * * * * * * * * 
	
	 */
	public static void main(String[] args) {
		int rows = 7;
		for (int i=1; i<=rows; i++) {
			for (int j=0; j<i; j++) {
				System.out.print("* ");
			}
			
			for (int j=rows*2; j>i*2; j--) {
				System.out.print("  ");
			}
			
			for (int j=0; j<i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i=1; i<=rows*2; i++) {
			System.out.print("* ");
		}
	}
}


