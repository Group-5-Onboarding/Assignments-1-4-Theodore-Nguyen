package AssignmentSet1;

import java.util.Scanner;
import java.util.*;

public class Assignment6 {
	public static void main(String args[]) {
		int product = 1;
		int [] numbers = new int[3];
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Please enter number");
			int num = input.nextInt();
			if (num == 7) {
				product = 1;
			} else {
				product *= num;
			}
		}
		
		if (product == 1) {
			System.out.println(-1);
		} else {
			System.out.println(product);
		}
	}
}
