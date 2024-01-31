package com.MultiThreading;
public class DepositWithdraw
{
	public static void main(String[] args) 
	{
		Hdfc h=new Hdfc();
		Thread t1=new Thread()
		{
			public void run()
			{
				h.credit(50000);
			}
		};
		Thread t2=new Thread()
		{
			public void run()
			{
				h.debit(15);
			}
		};
		t1.start();
		t2.start();
	}
}
class Hdfc
{
	int available=50000;
	public synchronized void credit(int add)
	{
		System.out.println("AMOUNT CREDITED");
		available=available+add;
		System.out.println("AVAILABLE BALANCE IS "+available);
		notify();
	}
	public synchronized void debit(int minus)
	{
		System.out.println("AMOUNT GOT WITHDRAWN");
		if(minus>available)
		{
			System.out.println("WAITING FOR MONEY DUE TO INSUFFICIENT BALANCE ");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		available=available-minus;
		System.out.println("WITHDRAWL COMPLETED");
		System.out.println("AVAILABLE AMOUNT "+available);
	}
}
