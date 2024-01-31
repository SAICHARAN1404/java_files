package com.Basics;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class Returntype
{
	public static void main(String args[])
	{
		/*System.out.println(Test.m1()+" "+Test.m2()+" "+Test.m3());*/
		int x=Test.m1();
		String y=Test.m2();
		int []z=Test.m3();
		for(int temp:z)
		{
			System.out.print(temp+" ");
		}
		System.out.println();
		System.out.println(x+" "+y);
		
		
		ArrayList <Integer>a=Test.m4();
		System.out.println(a);
		
		Set <Integer>set=Test.m5();
		System.out.println(set);
	}
}
class Test
{
	public static int m1()
	{
		int a=10,b=4;
		return a+b;
	}
	public static String m2()
	{
		String s1="sai ";
		String s2="charan teja";
		return s1+s2;
	}
	public static int[] m3()
	{
		int []a=new int[] {1,2,3};
		return a;
	}
	public static ArrayList <Integer>m4()
	{
		ArrayList <Integer>al=new ArrayList<>();
		al.add(100);
		al.add(200);
		al.add(300);
		return al;	
	}
	public static Set<Integer> m5()
	{
		Set<Integer> set=new HashSet<Integer>();
		set.add(1);
		set.add(10);
		return set;
	}
}
