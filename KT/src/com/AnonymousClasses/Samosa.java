package com.AnonymousClasses;

public class Samosa 
{
	public static void main(String[] args)
	{
		Popcorn p=new Popcorn()
		{
			public void taste()
			{
				System.out.println("hot");
			}
		};
		p.taste();
		System.out.println(p.getClass().getName());
		Popcorn p1=new Popcorn();
		p1.taste();
		System.out.println(p1.getClass().getName());
	}
}
class Popcorn
{
	public void taste()
	{
		System.out.println("sweet");
	}	
}