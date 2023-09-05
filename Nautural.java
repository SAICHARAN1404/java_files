class Natural
{
	public static void main(String args[])
	{
		int a=1,start=10,temp=0;
		while(start>=a)
		{
			temp=temp+start;
			
			System.out.println(start);
			start--;
		}
		System.out.println(temp);
	}
}