class Leapyearsuper
{
	public static void main(String args[])
	{
		int startyear =1947,endyear=2024,temp=0,temp1=0;
		int superleapyear=12;
		while(startyear<=endyear)	//1947
		{	
			if (startyear%4==0  && startyear%100!=0 || startyear%400==0)//1947is false
			{
				temp++;//
				if(temp%3==0)//skip//
				{
					System.out.println("superleapyear"+startyear);
					temp1++;
				}
				
			}	
			startyear++;
		       
		}
		 System.out.println("super leap years =  "+temp1);
		
	}
}