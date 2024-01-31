package com.MultiThreading;
public class RaceCondition
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		A11 a=new A11();
		Thread thread1=new Thread(a,"Thread1");
		thread1.start();
		Thread thread2=new Thread(a,"Thread2");
		thread2.start();
		//RACE CONDITION OCCURS DUE TO CONCURRENT EXECUTION(TWO THREADS ARE EXECUTING AT A TIME) ,DATA WILL BE CORRUPTED 
	}
}
class A11 implements Runnable
{
	int temp=1;
	public synchronized void run()//If we not use the Synchronized keyword the output will not be predicted.
	{
		for (int x=0;x<10;x++)
		{
			temp++;
			System.out.println(Thread.currentThread().getName()+"==>"+temp);
		}
	}
}