package SwiftFood;

import java.util.Scanner;

public class OrderRefractored {
	
	public int orderId;
	public String orderedFoods;
	public double totalPrice;
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderedFoods() {
		return orderedFoods;
	}

	public void setOrderedFoods(String orderedFoods) {
		this.orderedFoods = orderedFoods;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String status;

	
	public OrderRefractored (int oId, String oFoods, double tPrice, String s) {
		orderId = oId;
		orderedFoods = oFoods;
		totalPrice = tPrice;
		status = s;
	}
	
	public void askUser() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter desired food.");
		setOrderedFoods(input.next());
	}
	
	public void displayValues() {
		System.out.println();
		System.out.println("Order Details");
		System.out.println("Order Id: " + orderId);
		System.out.println("Ordered Food: " + orderedFoods);
		System.out.println("Status: " + status);
		System.out.println("Total Price: " + totalPrice);

	}
	
	public double calculateTotalPrice(double totalPrice2) {
		return totalPrice2 += totalPrice2*0.05;
	}
	
	public static void main (String args[]) {
		OrderRefractored order1 = new OrderRefractored(101, "Spinach Alfredo Pasta", 35.0, "ordered");
		order1.totalPrice = order1.calculateTotalPrice(order1.totalPrice);
		order1.askUser();
		order1.displayValues();
	}
}
