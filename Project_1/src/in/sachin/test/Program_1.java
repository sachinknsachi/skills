package in.sachin.test;

/*
 * Write a program (WAP) to print INEURON using pattern programming logic.
 * 
 */
public class Program_1 {

	public static void main(String[] args) {
		
		PatternPrinting vlaue = new PatternPrinting();
		System.out.println();
		vlaue.printWithPattern("INEURON");
		
	}
}

class PatternPrinting {
	
	int n = 7;
	int i, j;
	boolean alpha;
	
	public void updatePattern(char letter) {
		switch (letter) {
		case 'I' : alpha = (i==1 || i==n || j==n/2+1);
			break;
		case 'N' : alpha = (j==1 || j==n || i==j);
			break;
		case 'E' : alpha = (((i == 1 || j == 1 || i == n || j == n  || i == n / 2 + 1) && !((j==n && i!=1) && (j==n && i!=n) && (j==n && i!=n/2+1))));
			break;
		case 'U' : alpha = (j==1 || j==n || i==n);
			break;
		case 'R' : alpha = (i==1 || j==1 || i==n/2+1) || (j==n && i<=n/2+1) || (i>n/2+1 && j==i);
			break;
		case 'O' : alpha = (i==1 || j==1 || i==n || j==n);
			break;
		}
	}
	

	public void printWithPattern(String string) {
        for (i = 1; i <= n; i++) {
            char[] lettersArr = string.toUpperCase().toCharArray();
            for (char letter : lettersArr) {
                for (j = 1; j <= n; j++) {
                    updatePattern(letter);
                    if (alpha) {
                        System.out.print("# ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
