package org.gowtham.strategypattern.strategies;

import org.gowtham.strategypattern.interfaces.IDisplayable;

public class SimpleDisplayStrategy implements IDisplayable {

	@Override
	public void Display() {
		System.out.println("Simple display");

	}

}
