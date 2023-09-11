class Insurance
{
	public static void main(String args[])
	{
		String health="excellent",location="city",gender="male";
		int age=29;
		double policy_amount=1000000,premium_amount=0,max_amount=0;
		if (health=="excellent" && location=="city" && (age>=25 && age<=35 ))
		{
			if (gender=="male" && policy_amount<=200000)
			{
				premium_amount=(4.0*policy_amount)/1000;
				max_amount=4.0*200000/1000;
			}
			else if (gender=="female"  && policy_amount<=100000 )
			{
				premium_amount=(3.0*policy_amount)/1000;
				max_amount=3.0*100000/1000;
			}
			else 
			{
				System.out.println("PERSON IS NOT INSURED");
			}				
		}
		else if (health=="poor" && location=="village" && age>=25 && age<=35 &&  premium_amount<=10000 )
		{
			premium_amount=(6.0*policy_amount)/1000;
			max_amount=6.0*10000/1000;
		}
		else
		{
			System.out.println("THE PERSON IS NOT INSURED");
		}
		double loss=max_amount-premium_amount;
		System.out.println("premium_amount-------------"+premium_amount+"    "+"max_amount---------------"+max_amount+"     "+"loss----------------"+loss );
	}
}