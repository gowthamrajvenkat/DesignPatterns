package org.gowtham.decoratorpattern;

public class ChocolateDecorator extends AddOnDecorator {
	
	private Bevarage beverage;
	
	public ChocolateDecorator(Bevarage b) {
		this.beverage = b;
	}
	
	public int cost() {
		return this.beverage.cost() + 2;
	}
}
