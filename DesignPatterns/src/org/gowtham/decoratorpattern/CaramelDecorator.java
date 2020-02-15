package org.gowtham.decoratorpattern;

public class CaramelDecorator extends AddOnDecorator {
	
	private Bevarage beverage;
	
	public CaramelDecorator(Bevarage b) {
		this.beverage = b;
	}

	public int cost() {
		return this.beverage.cost() + 1;
	}
}
