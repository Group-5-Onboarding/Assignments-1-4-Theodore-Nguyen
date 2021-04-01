package AssignmentSet2;

import java.util.Scanner;

public class OrderRefractored {
	public int orderId;
	public String orderedFoods;
	public double totalPrice;
	public String status;

	
	public OrderRefractored (int oId, String oFoods, double tPrice, String s) {
		orderId = oId;
		orderedFoods = oFoods;
		totalPrice = tPrice;
		status = s;
	}
	
	public OrderRefractored() {
		status = "Ordered";
	}
	
	public OrderRefractored(int orId, String orFoods) {
		orderId = orId;
		orderedFoods = orFoods;
	}
	
	public void displayValues() {
		System.out.println("Status of order 1: " + this.status);
		System.out.println("Status of order 2: " + this.status);
		System.out.println("Id of order 2: " + this.orderId);
		System.out.println("Items ordered in order 2: " + this.orderedFoods);

	}
	
	public void askUser() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter Order ID.");
		orderId = input.nextInt();
		
		System.out.println("Please enter name of food item.");
		orderedFoods = input.next();
		
		System.out.println("Please enter total price of food.");
		totalPrice = input.nextFloat();
		
		System.out.println("Please enter order status");
		status = input.next();
		
		input.close();
	}
	
	public double calculateTotalPrice(double totalPrice2) {
		return totalPrice2 += totalPrice2*0.05;
	}
	
	public static void main (String args[]) {
		
		OrderRefractored order1 = new OrderRefractored();
		order1.askUser();
		order1.displayValues();
	}
}
