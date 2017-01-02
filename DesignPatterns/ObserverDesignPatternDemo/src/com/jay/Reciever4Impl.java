package com.jay;

public class Reciever4Impl implements Reciever{

	@Override
	public void updateReceiver(String msg) {
		
		System.out.println("Inside Reciever 4." + " " + msg);
	}

}