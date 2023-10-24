package in.sachin.test;

public class Program_2 {
	/*
  		WAP to reverse a sentence while preserving the position.
			Input : “Think Twice”
			Output : “knihT eciwT”
	*/

	public static void main(String[] args) {
	
		String name = "Think Twice";
		String reverseName = "";
		
		for (String eachWord : name.split(" ")) {
			for (int i=eachWord.length()-1;  i>=0; i--) {
				reverseName = reverseName + eachWord.charAt(i);
			}
			reverseName = reverseName + " ";
		}
		
		System.out.println(reverseName);
	}
}

