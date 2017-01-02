package com.jay;

public interface Broadcast {

	
	void register(Reciever receiver);
	void unRegister(Reciever receiver);
	void notifyRecievers();
	
}
