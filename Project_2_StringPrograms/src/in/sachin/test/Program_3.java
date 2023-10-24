package in.sachin.test;

import java.util.Arrays;

public class Program_3 {
	/*
  		WAP to reverse a sentence while preserving the position.
			Input : “Think Twice”
			Output : “knihT eciwT”
	*/

	public static void main(String[] args) {
	
		String firstString = "listen";
		String secondString = "silent";
		
		boolean isAnagram = false;
		
		if (firstString.length() == secondString.length()) {
			
			char[] firstCharArray = firstString.toCharArray();
		    char[] secondCharArray = secondString.toCharArray();
		
		    Arrays.sort(firstCharArray);
		    Arrays.sort(secondCharArray);
		
		    isAnagram = Arrays.equals(firstCharArray, secondCharArray);
		}
		
		if (isAnagram) {
			System.out.println("The strings are anagrams.");
		} else {
			System.out.println("The strings are not anagrams.");
		}
	}
}

