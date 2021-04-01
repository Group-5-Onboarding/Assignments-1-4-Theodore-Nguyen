package SwiftFood;

import java.util.Scanner;

public class Restaurant {
	public String name;
	public float rating;
	public String restaurantContact;
	public String restaurantAddress;
	
	public void displayValues() {
		System.out.println();
		System.out.println("Restaurant Details");
		System.out.println("**************");
		System.out.println("Restaurant Name: " + name);
		System.out.println("Restaurant Rating: " + rating);
		System.out.println("Restaurant Contact: " + restaurantContact);
		System.out.println("Restaurant Address: " + restaurantAddress);
	}
	
	public void askUser() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter Restaurant name.");
		name = input.next();
		
		System.out.println("Please enter Restaurant rating.");
		rating = input.nextFloat();
		
		System.out.println("Please enter Restaurant Contact number.");
		restaurantContact = input.next();
		
		System.out.println("Please enter Restaurant Address");
		restaurantAddress = input.next();
	}
	
	public static void main (String args[]) {
		Restaurant r = new Restaurant();
		r.askUser();
		r.displayValues();
	}
}
