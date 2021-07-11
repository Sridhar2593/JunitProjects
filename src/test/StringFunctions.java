package test;

public class StringFunctions {
	
	public static boolean isPalindrome(String str) {
		
		//Pointers pointing to the beginning
		//and the end of the string
		int i =0, j = str.length() - 1;
		
		
		while(i<j) {
			
			//If there is a mismatch
			if(str.charAt(i) != str.charAt(j)) 
			
				return false;
			
			//Increment the first pointer and
			//Decrement the other
			i++;
			j--;
		}
		
		//Given String is Palindrome
		return true;
		
	}

}
