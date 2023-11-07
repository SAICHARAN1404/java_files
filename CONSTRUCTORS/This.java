package com.CONSTRUCTORS;

public class This {

	public static void main(String[] args) {
		Add a=new Add(100);
	}
}
class Add
{
	int a;
	Add()
	{
		System.out.println("I am default Constructor");
	}
	Add(int a)
	{
		this();
		System.out.println("I am parameterized Constructor");
		this.a=a;
	}
}