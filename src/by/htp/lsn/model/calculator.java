package by.htp.lsn.model;

import by.htp.lsn.console.input;

public class calculator {

	private static String first = "first";
	private static String second = "second";

	public static void intOperation() {
		int a = input.readInteger(first);
		int b = input.readInteger(second);
		String operation = input.readSymbol();
		System.out.print("Result: ");

		switch (operation) {
		case "+":
			System.out.println(a + b);
			break;
		case "-":
			System.out.println(a - b);
			break;
		case "*":
			System.out.println(a * b);
			break;
		case "/":
			try {
				System.out.println(a / b);
				break;
			} catch (ArithmeticException e) {
				System.out.println("Please do not devide by zero");
				intOperation();
			}
		}

	}

	public static void doubleOperation() {
		double a = input.readDouble(first);
		double b = input.readDouble(second);
		String operation = input.readSymbol();
		System.out.print("Result: ");

		switch (operation) {
		case "+":
			System.out.println(a + b);
			break;
		case "-":
			System.out.println(a - b);
			break;
		case "*":
			System.out.println(a * b);
			break;
		case "/":
			try {
				System.out.println(a / b);
				break;
			} catch (ArithmeticException e) {
				System.out.println("Please do not devide by zero");
				doubleOperation();
			}
		}

	}

	public static void charOperation() {
		char a = input.readChar(first);
		char b = input.readChar(second);
		String operation = input.readSymbol();
		System.out.print("Result: ");

		switch (operation) {
		case "+":
			System.out.println(a + b);
			break;
		case "-":
			System.out.println(a - b);
			break;
		case "*":
			System.out.println(a * b);
			break;
		case "/":
			try {
				System.out.println(a / b);
				break;
			} catch (ArithmeticException e) {
				System.out.println("Please do not devide by zero");
				doubleOperation();
			}
		}

	}

}