package AssignmentSet2;

import java.util.Scanner;

public class ArmstrongNum {
	public static void main (String args[]) {
		int sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number to check if Armstrong.");
		int userInput = input.nextInt();
		
		String numStr = Integer.toString(userInput);
		
		for (int i = 0; i < numStr.length(); i++) {
			sum += Math.pow(Character.getNumericValue(numStr.charAt(i)), numStr.length());
		}
		
		if (sum == userInput) {
			System.out.println("Is a Armstrong number.");
		} else {
			System.out.println("Isn't a Armstrong number.");
		}
		
		input.close();
	}
}
