package com.Forloop;

public class Contin {

	public static void main(String[] args)
	{
		int i;
		for(i=1;i<11;i++)//1<11
		{
			if(i==7)//1!=7 so loop will not be entered//2!=7....//7=7true//
			{
			
				//break;//exited/terminated//loop will stop at 6 ,7 will be terminated//
				continue;//continue=skipped//7 will be skipped
			}
			System.out.println(i);//1//1+1=2//3//4//5//6//8//9//10
		}
		
	}

}
