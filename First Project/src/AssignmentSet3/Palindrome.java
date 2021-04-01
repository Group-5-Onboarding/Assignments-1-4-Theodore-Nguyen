package AssignmentSet3;

public class Palindrome {
	public static boolean checkPalindrome(String str){
	    
		int start = 0;
		int end = 0;
		
		while (start <= end) {
			if (str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		
        return true;
	}
	
	public static void main(String args[]){
		String str = "radar";
		if(checkPalindrome(str))
			System.out.println("The string is a palindrome!");
		else
			System.out.println("The string is not a palindrome!");
	}
}
