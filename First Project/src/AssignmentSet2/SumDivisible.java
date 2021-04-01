package AssignmentSet2;

import java.util.Scanner;

public class SumDivisible {
	public static void main(String args[]) {
		int sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number to add together and divide by.");
		int num = input.nextInt();
		
		String numStr = Integer.toString(num);
		
		for (int i = 0; i < numStr.length(); i++) {
			char ch = numStr.charAt(i);
			
			if (Character.isDigit(ch)) {
				sum += Character.getNumericValue(numStr.charAt(i));
			}
		}
		
		System.out.println(num / sum);
		input.close();
	}
}
