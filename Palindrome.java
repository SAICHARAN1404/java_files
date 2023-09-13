class Palindrome
{
	public static void main(String args[])
	{
		int num=121,rem,rev=0;
		for(int i =num;i!=0;i/=10)
		{
			rem=i%10;
			rev=rev*10+rem;	
		}
		System.out.println(rev==num?"Palindrome":"Not a palindrome");
	}
}