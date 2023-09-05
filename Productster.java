class Productster
{
	public static void main(String args[])
	{
		int p1=1000,p2=2000,p3=999;
		int total=p1+p2+p3;
		double d=0;
		System.out.println("total  "+ total);
		System.out.println(total>3000?(total>400?total-300:p1-100):total);
	}
}