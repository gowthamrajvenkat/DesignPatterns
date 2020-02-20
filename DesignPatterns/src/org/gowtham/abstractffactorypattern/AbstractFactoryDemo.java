package org.gowtham.abstractffactorypattern;

import java.util.Scanner;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		System.out.println("Enter OS Name (windows/ios): ");
		Scanner in = new Scanner(System.in);
		String os = in.nextLine();
		in.close();
		if (os.toUpperCase().equals("WINDOWS"))
			alertBoxGenerator(new WindowsAlertBoxFactory());
		else if(os.toUpperCase().equals("IOS"))
			alertBoxGenerator(new IOSAlertBoxFactory());
	}
	
	public static void alertBoxGenerator(AbstractAlertBoxFactory alertBoxFactory)
	{
		IAlertBox alertbox = alertBoxFactory.getAlertBox();
		IButton button = alertBoxFactory.getButton();
		alertbox.display();
		button.display();
	}

}
