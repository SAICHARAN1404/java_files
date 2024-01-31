package com.NormalRegularClasses;

class Out
{
	int a=888;
	class Inner
	{
		int a=88;
		public void m1()
		{
			int a=8;
			System.out.println(a);
			System.out.println(this.a);
			System.out.println(Out.this.a);
		}
	}
	public static void main(String[] args) 
	{
		Out o=new Out();
		Out.Inner I=o.new Inner();
		I.m1();
	}
}

