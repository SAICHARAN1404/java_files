package com.Forloop;

public class Primeornot {

	public static void main(String[] args)
	{
		int a,start,temp;
		for( a=20,start=2,temp=0;start<a/2;start++)//2,3,4,5,6,7,8,9<10//
		{
			if(a%start==0)//20%2==0//20%3!=0//20%4==0//20%5==0//20%6,7,8,9!=0//
			{	
				temp++;//1//2//3
				break;//if we use break ,if the condition becomes true 1 time it will come out of the loop
			}
		}
		System.out.println(temp);//1 
		if(temp==0)
		{
			System.out.println(a+" prime");
		}
		else
		{
			System.out.println(a+" not prime");
		}

	}

}
