package com.MultiThreading;
public class ProducerConsumer
{
	public static void main(String[] args) 
	{
		Trends t1=new Trends();
		Thread t2=new Thread()
		{
			public void run()
			{
				t1.consumer(31);
			}
		};
		Thread t3=new Thread()
	    {
			public void run()
			{
				t1.producer(25);
			}
	    };
	    t2.start();
	    t3.start();
	}
}
class Trends
{
	int available =5;
	public synchronized void consumer(int required)
	{
		System.out.println("consumer started consuming the data");
		if(required>available)
		{
			System.out.println("Insufficient data consumer wants "+required+" but available items are "+available);
			System.out.println("consumer is waiting for the data");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		available=available-required;
		System.out.println("consumer has consumed the data");
	}
	public synchronized void producer(int stock)
	{
		System.out.println("Producer started producing the data");
		System.out.println("producing "+stock+" extra items");
		available=available+stock; 
		System.out.println("Producer produced the data");
		System.out.println("Available items are "+available);
		notify();
	}
}
