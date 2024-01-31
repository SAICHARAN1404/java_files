package com.MultiThreading;

public class THREADS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		Thread thread1=new Thread(a,"Thread1");
		thread1.start();
		Thread thread2=new Thread(a,"Thread2");
		thread2.start();
	}
}
class A implements Runnable
{
	public void run()
	{
		m1();
	}
	public synchronized void m1()
	{
		for (int x=0;x<5;x++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}
