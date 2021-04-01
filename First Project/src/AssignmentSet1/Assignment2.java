package AssignmentSet1;

import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		double pi = 3.14;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter radius length.");
		int radius = input.nextInt();
		
		System.out.println(pi * radius * radius);
	}
}
