package SwiftFood;

public class Order {
	
	public int orderId;
	public String orderedFoods;
	public double totalPrice;
	public String status;

	
	public Order (int oId, String oFoods, double tPrice, String s) {
		orderId = oId;
		orderedFoods = oFoods;
		totalPrice = tPrice;
		status = s;
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
		Order order1 = new Order(101, "Spinach Alfredo Pasta", 35.0, "ordered");
		order1.totalPrice = order1.calculateTotalPrice(order1.totalPrice);
		order1.displayValues();
	}
}
