package com.MultiThreading;
public class ThreadState
{
	public static void main(String[] args)
	{
		//Without synchronized 
//		Demo demo=new Demo();
//		Thread thread1=new Thread(demo,"Thread1");
//		thread1.start();//READY STATE
//		Thread thread2=new Thread(demo,"Thread2");
//		thread2.start();
		
		//With synchronized
		Demo2 demo2=new Demo2();
		Thread thread1=new Thread(demo2,"Thread1");
		thread1.start();//READY STATE
		Thread thread2=new Thread(demo2,"Thread2");
		thread2.start();
		
		
	}
}
class Demo implements Runnable
{
	int count=1;
	public  void run()//RUN STATE
	{
		for(int x=0;x<10;x++)
			count++;
		System.out.println(count);
	}//DEAD STATE
}
class Demo2 implements Runnable
{
	int temp=1;
	public void run()
	{
		m1();
	}
	public void m1()
	{
		for(int x=0;x<10;x++)
			temp++;
		System.out.println(temp);
	}
}
