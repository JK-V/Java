package com.jay;

public class ConcurrentThreadsDemo {

	public static void main(String args[])
	{
//		running concurrently to decide what will be your vacation destination 
		SampleThread thread1 = new SampleThread("Himalaya");
		
		SampleThread thread2 = new SampleThread("Manipur");
		
		//Start both the threads, will stop once execution complete
		thread1.start();
		thread2.start();
	}
	
	
}
