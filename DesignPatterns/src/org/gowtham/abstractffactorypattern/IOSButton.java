package org.gowtham.abstractffactorypattern;

public class IOSButton implements IButton {

	@Override
	public void display() {
		System.out.println("iOS button");
	}

}
