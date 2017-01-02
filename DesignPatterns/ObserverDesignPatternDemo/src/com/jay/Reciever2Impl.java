package com.jay;

public class Reciever2Impl implements Reciever{

	@Override
	public void updateReceiver(String msg) {
		
		System.out.println("Inside Reciever 2." + " " + msg);
	}

}