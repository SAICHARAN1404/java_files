class Gradeofsteel
{
	public static void main(String args[])
	{
		double hardness=200,carbon_content=0.6,tensile_strength=5601;
		if ( hardness>50 && carbon_content<0.7 && tensile_strength>5600)
		{
		System.out.println("GRADE==10");
		}
		else if ( hardness>50 && carbon_content<0.7 )
		{
			System.out.println("GRADE==9");
		}
		else if ( carbon_content<0.7 &&  tensile_strength>5600)
		{
			System.out.println("GRADE ==8");
		}
		else if ( hardness>50 &&  tensile_strength>5600)
		{
			System.out.println("GRADE == 7");
		}
		else if ( hardness>50 || carbon_content<0.7 || tensile_strength>5600)
		{
			System.out.println("GRADE== 6");
		}
		else
		{
			System.out.println("GRADE == 5");
		}
	}
}