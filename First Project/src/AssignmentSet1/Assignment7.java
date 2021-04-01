package AssignmentSet1;

import java.util.Scanner;

public class Assignment7 {
	public static void main(String args[]) {
		int total = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter V for vegetarian or N for non-vegetarian.");
		String base = input.next();
		
		System.out.println("Please enter number of orders.");
		int orders = input.nextInt();
		
		System.out.println("Please enter distance from store for delivery.");
		int distance = input.nextInt();
		
		if (base.equals("V")) {
			total += (12 * orders);
		} else if (base.equals("N")) {
			total += (15 * orders);
		} else {
			System.out.println("Please enter only N or V");
		}
		
		if (distance - 3 > 0) {
			for (int  i = 0; i < distance - 3 && i < 3; i++) {
				total += 1;
			}
		}
		
		if (distance - 6 > 0) {
			for (int  i = 0; i < distance - 6; i++) {
				total += 2;
			}
		}
		
		System.out.println(total);
	}
}
