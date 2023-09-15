package com.Forloop;
public class Days 
{

	public static void main(String[] args)
	{
		for(int i=1;i<=6;i++)//i=1,2,3,4,5,6//
		{
			System.out.println("DAY "+i);//Day 1//Day 2,3,4,5,6
			for(int j=1;j<=9;j++)//1<9
				System.out.println("  "+(j+8)+"--"+(j+9));//1+8=9//1+9=10==>9 to 10
			//10 to 11//11 to 12//12 to 13//13 to 14//14 to 15//15 to 16//16 to 17//
			//17 to 18//
		}
	}

}
