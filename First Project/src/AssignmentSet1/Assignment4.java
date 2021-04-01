package AssignmentSet1;

import java.util.Scanner;

public class Assignment4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter value for a.");
		int a = input.nextInt();
		
		System.out.println("Please enter value for b.");
		int b = input.nextInt();
		
		if (a == b) {
			System.out.println(a + b);
		} else {
			System.out.println((a + b) * 2);
		}
	}
}
