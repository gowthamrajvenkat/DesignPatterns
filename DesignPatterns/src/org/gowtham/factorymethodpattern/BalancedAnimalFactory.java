package org.gowtham.factorymethodpattern;

public class BalancedAnimalFactory implements AnimalFactory {
	
	public static int dogCount = 0;
	public static int catCount = 0;
	@Override
	public Animal createAnimal() {
		
		if (dogCount <= catCount)
		{
			dogCount++;
			return new Dog();
		}
		else
		{
			catCount++;
			return new Cat();
		}
		
	}

}
