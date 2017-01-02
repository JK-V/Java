package com.jay;

public class Animal {
	
	private String name;
	private int weight;
	private String sound;
	Flys flyingType;
	
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		this.name = newName;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int newWeight) {
		this.weight = newWeight;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String newSound) {
		this.sound = newSound;
	}
	
	public String tryToFly()
	{
		return flyingType.fly();
	}
	
	public void setFlyingAbility(Flys newFlyingType){
		flyingType = newFlyingType;
	}
	

}
