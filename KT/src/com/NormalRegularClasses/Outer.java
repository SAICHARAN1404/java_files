package com.NormalRegularClasses;

public class Outer {
	public static void main(String []args)
	{
		Outer o=new Outer();
		Outer.Inner I=o.new Inner();
		I.meth();
	}
	class Inner
	{
		public void meth()
		{
			System.out.println("CHARAN");
		}
	}
}
