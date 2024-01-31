package com.AnonymousClasses;

public class Main 
{
	public static void main(String[] args)
	{
		Cooldrink c=new Cooldrink()
		{		
			public void pulpy() 
			{
				System.out.println("Minute made");
			}
			public void coke() 
			{
				System.out.println("Diet coke");
			}
			
		};
		c.coke();
		c.pulpy();
		System.out.println(c.getClass().getName());
	}
	
}
interface Cooldrink
{
	public void pulpy();
	public void coke();
}
