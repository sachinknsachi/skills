package in.sachin.test;

public class Program_1 {
	/*
	  	WAP to reverse a String.
			Input: “iNeuron”
			Output: “norueNi”
	 */
	
	public static void main(String[] args) {
		
		String name = "iNeuron";
		String reverseName = "";
		
		
		for (int i=name.length()-1;  i>=0; i--) {
			reverseName = reverseName + name.charAt(i);
		}
		
		System.out.println(reverseName);
		
	}
}

