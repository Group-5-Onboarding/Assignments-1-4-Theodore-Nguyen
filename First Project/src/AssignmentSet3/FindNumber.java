package AssignmentSet3;

public class FindNumber {
	public static int[] findNumbers(int num1, int num2) {
		int[] numbers = new int[6];
		int digitSum = 0;
		int count = 0;

		if (num1 < num2) {
			for (int i = num1 + 1; i < num2 && count < numbers.length; i++) {
				String numStr = Integer.toString(i);
				
				for (int j = 0; j < numStr.length(); j++) {
					digitSum += Character.getNumericValue(numStr.charAt(j));
				}
				
				if (i % 5 == 0 || digitSum % 3 == 0) {
					numbers[count] = i;
					count++;
				}
				digitSum = 0;
			}
		}

		return numbers;
	}

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 30;

		int[] numbers = findNumbers(num1, num2);
		if (numbers[0] == 0) {
			System.out.println("There is no such number!");
		} else {
			for (int index = 0; index <= numbers.length - 1; index++) {
				if (numbers[index] == 0) {
					break;
				}
				System.out.println(numbers[index]);
			}
		}

	}
}
