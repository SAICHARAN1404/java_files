package com.Forloop;

public class Twinprime1 {

	public static void main(String[] args) 
	{
		int n1=13,n2=3,count1=0,count2=0;
		for(int i=n1,start=2;i/2>=start;start++)
		{
			if(i%start==0)
				count1++;
		}
		for(int j=n2,start=2;j/2>start;start++)
		{
			if(j%start==0)
			count2++;
		}
		System.out.println(count1+" "+count2);
		n2=n2-n1;
		if(count1==0 && count2==0)
		{
			
			if(n2==2 || n2==-2)
				System.out.println("twin prime");
			else
				System.out.println("not a twin prime");
		}
		else
			System.out.println("not a prime");
	}

}
