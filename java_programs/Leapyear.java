class Leapyear
{
	public static void main(String args[])
	{
		int startyear =1947,endyear=2024,temp=0,temp1=0;
		while(startyear<=endyear)	
		{	
			if (startyear%4==0  && startyear%100!=0 || startyear%400==0)
			{
				System.out.println("leap year");
				temp++;	
				System.out.println(startyear);
			}
		
		
			
			startyear++;
		       
		}
		 System.out.println("leap years =  "+temp);
		
	}
}
