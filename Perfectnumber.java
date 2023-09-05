class Perfectnumber
{
	public static void main(String args[])
	{
		int num=6,start=1,sum=0;
		int var=num-1;
		while(var>=start)//5>=1//4>=1//3//2//1//0=false//
		{
			if(num%var==0)//6%5!=0//6%4!=0//6%3==0//6%2==0//6%1==0//
				sum=sum+var;//3//3+2//3+2+1=6//
		        var--;//4//3//2//1//
		}
		if(sum==num)//6==6
			System.out.println(num+"  Perfect");//it will execute//	
		else
		{
			System.out.println(num+" Not perfect number");
		}
	}
}