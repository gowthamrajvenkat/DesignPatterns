package org.gowtham.abstractffactorypattern;

public class IOSAlertBox implements IAlertBox {

	@Override
	public void display() {
		System.out.println("iOS alert box");
	}

}
