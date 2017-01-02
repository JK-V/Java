package com.jay;

public class Dog extends Animal{

	public Dog()
	{
		super();
		setSound("bow-wow");
		flyingType = new DoesntFlyImp(); // Going to set fly interface polymorphically 
	}
	
	public void digHole()
	{
		System.out.println("Dog dugs a hole");
	}
	
}
