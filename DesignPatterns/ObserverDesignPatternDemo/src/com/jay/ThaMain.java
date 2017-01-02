package com.jay;

public class ThaMain {

	
	public static void main (String[] args)
	{
		BroadcastImp broadcastObj = new BroadcastImp();
		Reciever1Impl reciver1 = new Reciever1Impl();
		Reciever2Impl reciver2 = new Reciever2Impl();
		Reciever3Impl reciver3 = new Reciever3Impl();
		Reciever4Impl reciver4 = new Reciever4Impl();
		
		broadcastObj.register(reciver1);
		broadcastObj.register(reciver2);
		broadcastObj.register(reciver3);
		broadcastObj.register(reciver4);
		
		broadcastObj.notifyRecievers();
	
		
	}
}
