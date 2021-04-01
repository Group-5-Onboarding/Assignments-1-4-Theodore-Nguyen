package AssignmentSet1;

import java.util.Scanner;

public class Assignment5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter value for a.");
		int a = input.nextInt();
		
		System.out.println("Please enter value for b.");
		int b = input.nextInt();
		
		System.out.println("Please enter distance from store for delivery.");
		int c = input.nextInt();
		
		double discriminant = Math.pow(b,  2) - (4 * a * c);
		double posRoot = (-b + discriminant) / (2 * a);
		double negRoot = (-b - discriminant) / (2 * a);
		
		if (discriminant == 0) {
			System.out.println(posRoot);
		}
		else if (discriminant > 0) {
			System.out.println("Pos Root: " + posRoot + "\n" + "Neg Root: " + negRoot);
		} else if (discriminant < 0) {
			System.out.println("The equation has no real root");
		}
	}
}
