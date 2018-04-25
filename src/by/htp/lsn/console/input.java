package by.htp.lsn.console;

import java.util.InputMismatchException;
import java.util.Scanner;

public class input {
	
	static Scanner reader = new Scanner(System.in);

	public static int readInteger(String number) {
		int intValue = 0;
		boolean loop = true;

		while (loop) {
			try {
				System.out.println("Please input " + number + " integer value");
				intValue = reader.nextInt();
				loop = false;
			} catch (InputMismatchException e) {
				System.out.println("Invalid value!");
				reader.next(); // this consumes the invalid token
			}

		}
		return intValue;
	}

	public static double readDouble(String number) {
		double doubleValue = 0;
		boolean loop = true;

		while (loop) {
			try {
				System.out.println("Please input " + number + " double value");
				doubleValue = reader.nextDouble();
				loop = false;
			} catch (InputMismatchException e) {
				System.out.println("Invalid value!");
				reader.next(); // this consumes the invalid token
			}

		}
		return doubleValue;
	}

	public static char readChar(String number) {
		char c = '\0';
		boolean loop = true;
		
		while (loop) {
			try {
				System.out.println("Please input " + number + " char value");
				char temp = reader.next().charAt(0);
				c = temp;
				loop = false;
			} catch (InputMismatchException e) {
				System.out.println("Invalid value!");
				reader.next(); // this consumes the invalid token
			}

		}
		return c;
	}

	public static String readSymbol() {

		System.out.println("Please input calc operation + - * /");
		String operation = reader.next();
		while (!((operation.equals("+")) || (operation.equals("-")) || (operation.equals("*")) || (operation.equals("/")))) {
		    System.err.println("Invalid value! Please input calc operation + - * /");
		    operation = reader.next();
		}
		return operation;
	}
	
	public static int readType() {
		
		System.out.println("Please input number of type which you wonna work with:");
		System.out.println("1. Integer\n2. Double \n3. Char");
		System.out.print("Your select ---> ");
		
		int type = reader.nextInt();
		
		return type;
	}

}


