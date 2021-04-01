package AssignmentSet1;

import java.util.Scanner;

public class Assignment8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter account number.");
		String accNum = input.next();
		
		System.out.println("Please enter account balance.");
		int balance = input.nextInt();
		
		System.out.println("Please enter your annual salary.");
		int salary = input.nextInt();
		
		System.out.println("Please enter loan type.");
		String loanType = input.next();
		
		System.out.println("Please enter your expected loan amount.");
		int expLoan = input.nextInt();
		
		System.out.println("Please enter expected no. of EMIs.");
		int expEMI = input.nextInt();
		
		
		if (accNum.length() == 4 && accNum.startsWith("1")) {
			if (loanType.equals("car") && salary > 25000 && expLoan <= 500000 && expEMI <= 36) {
				System.out.println("eligibleLoanAmount = 500000" + "\n" + "eligibleEmis = 36");
			} else if (loanType.equals("house") && salary > 50000 && expLoan <= 6000000 && expEMI <= 60){
				System.out.println("eligibleLoanAmount = 6000000" + "\n" + "eligibleEmis = 60");
			} else if (loanType.equals("business") && salary > 75000 && expLoan <= 7500000 && expEMI <= 84) {
				System.out.println("eligibleLoanAmount = 7500000" + "\n" + "eligibleEmis = 84");
			}
		} else {
			System.out.println("You don't qualify, sorry.");
		}
	}
}
