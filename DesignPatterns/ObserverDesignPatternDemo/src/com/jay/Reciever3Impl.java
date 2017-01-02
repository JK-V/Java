package com.jay;

public class Reciever3Impl implements Reciever{

	@Override
	public void updateReceiver(String msg) {
		
		System.out.println("Inside Reciever 3." + " " + msg);
	}

}