package org.gowtham.factorymethodpattern;

public class RandomAnimalFactory implements AnimalFactory {

	public static int dogCount = 0;
	public static int catCount = 0;
	@Override
	public Animal createAnimal() {
		
		if (Math.round(Math.random()) == 1)
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
