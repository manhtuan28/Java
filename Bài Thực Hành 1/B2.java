package thuhanhbuoi2;

import java.util.Scanner;

public class calculateEquationString {

	public static int calculateEquationString(String inputString) {
		if (inputString == null || inputString.isEmpty()) {
			return (int) Double.NaN;
		}

		int operatorIndex = -1;
		char operator = ' ';

		if (inputString.contains("+")) {
			operatorIndex = inputString.indexOf("+");
			operator = '+';
		} else if (inputString.contains("-")) {
			operatorIndex = inputString.indexOf("-");
			operator = '-';
		}

		if (operatorIndex == -1) {
			return (int) Double.NaN;
		}

		String s1 = inputString.substring(0, operatorIndex);
		String s2 = inputString.substring(operatorIndex + 1);

		try {
			int num1 = Integer.parseInt(s1);
			int num2 = Integer.parseInt(s2);

			switch (operator) {
			case '+':
				return num1 + num2;
			case '-':
				return num1 - num2;
			default:
				return (int) Double.NaN;
			}
		} catch (NumberFormatException e) {
			return (int) Double.NaN;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào một chuỗi phép toán (vd: 5+3 hoặc 10-4): ");
		String inputString = scanner.nextLine();
		int result = calculateEquationString(inputString);

		if (Double.isNaN(result)) {
			System.out.println("Kết quả: NaN");
		} else {
			System.out.println("Kết quả: " + result);
		}
		scanner.close();
	}
}
