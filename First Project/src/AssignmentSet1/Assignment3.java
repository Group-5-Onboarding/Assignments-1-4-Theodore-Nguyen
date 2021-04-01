package AssignmentSet1;

import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter temperature in Farenheit.");
		int farenheit = input.nextInt();
		double celsius = ((farenheit - 32) / 9) * 5;
	
		System.out.println(celsius);
	}
}
