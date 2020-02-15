package org.gowtham.decoratorpattern;

public class DecoratorDemo {

	public static void main(String[] args) {
		
		Bevarage beverage = new CaramelDecorator(new Decaf());
		System.out.println("Caramel decorated decaf costs " + beverage.cost());
		beverage = new ChocolateDecorator(beverage);
		System.out.println("Chocolate decorated caramel decorated decaf costs " + beverage.cost());
	}

}
