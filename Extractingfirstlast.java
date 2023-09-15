package com.Forloop;

public class Extractingfirstlast {

	public static void main(String[] args) 
	{
		int num=4372,rem,count=0,n1=0,n2=0,n3=0,n4=0;
		for(;num!=0;num/=10)
		{
			count++;
			rem=num%10;
			if(count==1)
				n1=rem;//n1=2
			else if(count==2)
				n2=rem;//n2=4
			else if(count==3)
				n3=rem;
			else 
				n4=rem;
			
		}
		
		System.out.println(n1 +" "+n2+" "+n3+" "+n4);
	}

}
