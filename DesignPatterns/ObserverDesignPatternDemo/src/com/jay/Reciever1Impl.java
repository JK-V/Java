package com.jay;

public class Reciever1Impl implements Reciever{

	
	
	@Override
	public void updateReceiver(String msg) {
		
		System.out.println("Inside Reciever 1." + " " + msg);
	}

}
