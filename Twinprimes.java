package com.Forloop;

public class Twinprimes {

	public static void main(String[] args)
	{
		int n1=3,n2=5,start1=2,start2=2,n3=0,count1=0,count2=0;
		for( ;n1/2>=start1;start1++)//
		{
			if(n1%start1==0)
			{
				count1++;
			}
		}
		
		for(;n2/2>=start2;start2++)	
		{
			if(n2%start2==0)
			{
				count2++;
			}
		}
		n3=n2-n1;
		if(count1==0 && count2==0)
		{
				
				
				System.out.println((n3==2||n3==-2)?"twin prime":"not a twin prime");			
		}
		else
			System.out.println("not prime");
		
	}
}
