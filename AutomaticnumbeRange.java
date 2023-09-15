package com.Forloop;

public class AutomaticnumbeRange {

	public static void main(String[] args) 
	{
		int x,i;
		for(x=1;x<=1000000;x++)
		{
			
			int z=(int)Math.pow(x,2);
			i=z%100;
			if(x==i)
				System.out.println(x+"  "+z);
		}
	}

}
