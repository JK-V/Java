package com.jay;

public class Bird extends Animal{

	public Bird()
	{
		super();
		setSound("kuu-kuu");
		flyingType = new DoesFlysImpl(); // Going to set fly interface polymorphically
	}
	
}
