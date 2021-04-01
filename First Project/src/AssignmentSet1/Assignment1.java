package AssignmentSet1;

import java.util.Scanner;

class Assignment1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter door number.");
		String door = input.next();
		
		System.out.println("Please enter street address.");
		String street = input.next();
		
		System.out.println("Please enter name of city.");
		String city = input.next();
		
		System.out.println("Please enter zipcode.");
		String zipcode = input.next();
		
		System.out.println(
			"Door No: " + door + '\n' +
			"Street: " + street + '\n' +
			"City: " + city + '\n' + 
			"Zipcode: " + zipcode
		);
	}
}
