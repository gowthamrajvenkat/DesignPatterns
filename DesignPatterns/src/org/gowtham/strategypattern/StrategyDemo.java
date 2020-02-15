package org.gowtham.strategypattern;

import org.gowtham.strategypattern.strategies.GraphicDisplayStrategy;
import org.gowtham.strategypattern.strategies.SimpleQuackStrategy;

public class StrategyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck duck = new Duck(new GraphicDisplayStrategy(), new SimpleQuackStrategy());
		duck.Display();
		duck.quack();
	}

}
