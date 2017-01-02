package com.jay;

import java.util.ArrayList;

public class BroadcastImp implements Broadcast{

	ArrayList<Reciever> observers = new ArrayList<Reciever>();
	String message = "";
	
	@Override
	public void register(Reciever newReciever) {
		
		observers.add(newReciever);
	}

	@Override
	public void unRegister(Reciever recieverToDelete) {
		
		int indexToDelete = observers.indexOf(recieverToDelete);
		observers.remove(indexToDelete);
		System.out.println("Reciever " + indexToDelete + " is successfully unregistered.");
	}

	@Override
	public void notifyRecievers() {
		
		for (Reciever reciever :observers)
		{
			reciever.updateReceiver("From Boradcast.");
		}
	}

	
	
}
