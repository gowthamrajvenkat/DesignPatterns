package org.gowtham.strategypattern.strategies;

import org.gowtham.strategypattern.interfaces.IQuackable;

public class SimpleQuackStrategy implements IQuackable {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("simple quack");
	}

}
