package com.MultiThreading;
public class PRIORITY 
{
	public static void main(String[] args)
	{
		Hello hello=new Hello ();
		Thread thread=new Thread(hello,"Thread");
		thread.start();
		for(int x=0;x<10;x++)
		{
			try {
				Thread.currentThread().sleep(500);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Charan");
		}
	}
}
class Hello implements Runnable
{
	int count=1;
	public void run()
	{
		m1();
	}
	public void m1() 
	{
		for(int x=0;x<10;x++)
		{
			count++;
			System.out.println(x+Thread.currentThread().getName());
		}
	}
}
