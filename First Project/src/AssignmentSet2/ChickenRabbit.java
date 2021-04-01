package AssignmentSet2;

import java.util.Scanner;

public class ChickenRabbit {
	public static void main(String args[]) {
		int heads,legs;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter number of heads");
		heads = input.nextInt();
		
		System.out.println("Please enter number of legs");
		legs = input.nextInt();
		
		int leftoverFeet = legs - (heads * 2);
		int rabbit = leftoverFeet / 2;
		int chicken = heads - rabbit;
		
		System.out.println("Chicken = " + chicken + "\nRabitts = " + rabbit);
		
		input.close();
	}
}
