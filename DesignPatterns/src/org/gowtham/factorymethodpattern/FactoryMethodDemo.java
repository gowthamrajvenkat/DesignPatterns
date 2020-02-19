package org.gowtham.factorymethodpattern;

public class FactoryMethodDemo {

	public static void main(String[] args) {
		Animal animal = null;
		//client class has Factory interface and the factory object will be injected
		AnimalFactory animalFactory = new BalancedAnimalFactory();
		int i = 0;
		while(i < 50)
		{
			animal = animalFactory.createAnimal();
			animal.makeSound();
			i++;
		}
		System.out.println("dog count: " + BalancedAnimalFactory.dogCount );
		System.out.println("cat count: " + BalancedAnimalFactory.catCount );
		i = 0;
		animalFactory = new RandomAnimalFactory();
		while(i < 50)
		{
			animal = animalFactory.createAnimal();
			animal.makeSound();
			i++;
		}
		System.out.println("dog count: " + RandomAnimalFactory.dogCount );
		System.out.println("cat count: " + RandomAnimalFactory.catCount );
	}

}
