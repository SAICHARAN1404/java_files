class Grosssalary
{
	public static void main(String args[])
	{
		int basic=10000;
		double ta=(15.0/100)*basic;
		double da=(12.0/100)*basic;
		double hra=(19.0/100)*basic;
		double pf;
		double tax,grosssalary,grosssalaryperyear;
		double totalsalary=basic+ta+da+hra;
		if(totalsalary>16000)
		{
			pf=(11.0/100)*basic;
			tax=(5.0/100)*basic;
		}
		else
		{
			pf=(7.0/100)*basic;
			tax=(2.5/100)*basic;
		}
		grosssalary=totalsalary-pf-tax;
		grosssalaryperyear=grosssalary*12;
		System.out.println("pf  "+pf);
		System.out.println("tax "+tax);
		System.out.println("gross salary "+grosssalary);
		System.out.println("grosssalaryperyear "+grosssalaryperyear);
		
	}
}