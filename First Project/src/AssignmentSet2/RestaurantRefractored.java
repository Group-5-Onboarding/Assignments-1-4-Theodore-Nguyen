package AssignmentSet2;

import java.util.Scanner;

public class RestaurantRefractored {
	public String name;
	public float rating;
	public long restaurantContact;
	public String restaurantAddress;
	
	public RestaurantRefractored(String n, long rContact, String rAddress, float r) {
		name = n;
		restaurantContact = rContact;
		restaurantAddress = rAddress;
		rating = r;
	}
	
	public RestaurantRefractored() {
		this.askUser();
	}
	
	
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
		restaurantContact = input.nextLong();
		
		System.out.println("Please enter Restaurant Address");
		restaurantAddress = input.next();
		
		input.close();
	}
	
	public static void main (String args[]) {
		RestaurantRefractored r = new RestaurantRefractored();
		r.askUser();
		r.displayValues();
	}
}
