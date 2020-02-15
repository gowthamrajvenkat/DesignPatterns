package org.gowtham.strategypattern;

import org.gowtham.strategypattern.interfaces.IDisplayable;
import org.gowtham.strategypattern.interfaces.IQuackable;

public class Duck {
	
	private IDisplayable disp;
	private IQuackable quack;
	
	public Duck(IDisplayable disp, IQuackable quack) {
		this.disp = disp;
		this.quack = quack;
	}
	
	public void Display() {
		this.disp.Display();
	}
	
	public void quack() {
		this.quack.quack();
	}
}
