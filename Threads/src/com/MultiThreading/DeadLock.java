package com.MultiThreading;
public class DeadLock 
{
	public static void main(String[] args) 
	{
		Main m=new Main();
		m.t1.start();
		m.t2.start();
	}
}
class Main
{
	String s1="one",s2="two";
	Thread t1=new Thread()
	{
		public void run()
		{
			synchronized(s1)
			{
				System.out.println(Thread.currentThread().getName());
				synchronized (s2)
				{
					System.out.println(Thread.currentThread().getName());
				}
			}
		}
	};
	Thread t2=new Thread()
	{
		public void run()
		{
			synchronized(s2)
			{
				System.out.println(Thread.currentThread().getName());
				synchronized (s1)
				{
					System.out.println(Thread.currentThread().getName());
				}
			}
		}
	};
}