package org.gowtham.observerpattern;

public class WindowDisplay implements IObserver {

	private int temperature;
	
	
	public void display() {
		System.out.println("Temperature is " + this.temperature);
	}

	@Override
	public <T> void update(T val) {
		this.temperature = Integer.parseInt(val.toString());
	}
}
