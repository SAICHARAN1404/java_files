class Technologynumber
{
	public static void main(String args[])
	{
		int num=2025,digits=0,var2=0,var1=0,sum=0;
		double d;
		for(int i=num;i!=0;i/=10)
		{
			digits++;
		}
		System.out.println(digits);
		if(digits==4)
		{
			var2=num%100;
			var1=num/100;
		}
		sum=var1+var2;
		d=Math.pow(sum,2);
		System.out.println(num==sum?"Technologynumber":"Not");
	}
}