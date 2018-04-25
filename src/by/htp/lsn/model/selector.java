package by.htp.lsn.model;

import by.htp.lsn.console.input;

public class selector {

	public static void selectType() {

		int type = input.readType();

		switch (type) {
		case 1:
			calculator.intOperation();
			break;
		case 2:
			calculator.doubleOperation();
			break;
		case 3:
			calculator.charOperation();
			break;
		}

	}

}