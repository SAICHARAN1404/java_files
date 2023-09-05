class Student
{
	public static void main(String args[])
	{
		String name="CHARAN";
		char section='A';
		double s1=74,s2=80,s3=85,s4=90,s5=75,s6=80;
		double maxmarks=600;
		double total=s1+s2+s3+s4+s5+s6;
		double percentage=(total/maxmarks)*100;
		double scholorship=0;
		double  donation=0;
		String grade=" ";
		if(percentage>80)
		{
			section='A';
			scholorship=10000;
			donation=0;
			grade="	DISTINCTION";
		}
		else if(percentage>70)
		{
			section='B';
			scholorship=0;
			donation=15000;
			grade="	FAIL";
		}
		else
		{
			System.out.println("SKIPPED EXAM");
		}	
		
		System.out.println(percentage+"   "+scholorship+"  "+donation +"  "+grade);

	}
}
