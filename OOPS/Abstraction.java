package com.OOPS;
public class Abstraction 
{
	public static void main(String[] args) 
	{
		Child c=new Child();
		c.hello();c.hi();
	}
}
abstract class Parent
{
	public void hello()
	{
		System.out.println("Hello everyone");
	}
	public abstract void hi();
}
class Child extends Parent
{
	@Override
	public void hi()
	{
		System.out.println("Hi everyone");
	}
	
}