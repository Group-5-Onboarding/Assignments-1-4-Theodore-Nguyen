package AssignmentSet2;

import java.util.Scanner;

public class Palindrome {
	public static void main (String args[]) {
		
		Boolean isPalindrome = true;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a series of number to check palindrome");
		String nums = input.next();
		
		for (int i = 0; i <= nums.length()/2; i++) {
            if (!nums.substring(i, i+1).equals(nums.substring(nums.length()-i-1, nums.length()-i))) {
                isPalindrome = false;
            }
		}
		
		System.out.println(isPalindrome);
		
		input.close();
	}
}
