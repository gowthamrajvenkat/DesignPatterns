package org.gowtham.abstractffactorypattern;

public class WinAlertBox implements IAlertBox {

	@Override
	public void display() {
		System.out.println("windows alert box");
	}

}
