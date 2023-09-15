package com.Forloop;

public class Primeinnums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  num=7597,rem,count=0;
		int i,start=2;
		for(;num>0;num/=10)
		{
			rem=num%10;
			i=rem;
			start=2;
			count=0;
			for(;i/2>=start;start++)
			{
				if(i%start==0)
					count++;
			}
			if(count==0)
				System.out.println(i);
		}
	}

}
