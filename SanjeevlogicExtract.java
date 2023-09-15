package com.Forloop;

public class SanjeevlogicExtract {

	public static void main(String[] args) 
	{
		int num=15000,rem,rev=0,count1=0,count2=0;
		System.out.println(num);
		for(;num>0;num/=10)
		{
		
			count1++;
			rem=num%10;
			rev=rev*10+rem;
			if(rev==0)
				count2++;
		}
		rev=rev*(int)Math.pow(10,count2);
		System.out.println(rev);
		System.out.println(count1);
		
	}

}
