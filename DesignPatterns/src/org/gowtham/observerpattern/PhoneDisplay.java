package org.gowtham.observerpattern;

public class PhoneDisplay implements IObserver {

	private int temperature;
	
	
	public void display() {
		System.out.println("Temperature is " + this.temperature);
	}

	@Override
	public <T> void update(T val) {
		this.temperature = Integer.parseInt(val.toString());
	}

}
