package com.jay;

public class TheMain {

	public static void main (String[] args)
	{
		Animal pomarian = new Dog();
		Animal parrot = new Bird();
		
		System.out.println("Dog : " + pomarian.tryToFly());
		System.out.println("Bird : " + parrot.tryToFly());
		
		//Giving flying ability to Dog
		pomarian.setFlyingAbility(new DoesFlysImpl());
		System.out.println("Dog : "+pomarian.tryToFly());
	}
}
