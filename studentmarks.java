class Main
{
     public static void main(String[] args)
     {
     double sub=100;
     String name="SAI CHARAN";
     String hno="1727100921";
     int s1=99,s2=95,s3=90,s4=85,s5=80,s6=75;
     double total=s1+s2+s3+s4+s5+s6;
     double totalper=(total/600.0)*100;
     double s1per=s1/sub*100;
     double s2per=s2/sub*100;
     double s3per=s3/sub*100;
     double s4per=s4/sub*100;
     double s5per=s5/sub*100;
     double s6per=s6/sub*100;
     double avgper=(s1per+s2per+s3per+s4per+s5per+s6per)/6;
     double t=(totalper-avgper);
     System.out.println(total);
     System.out.println(totalper);
     System.out.println(s1per);
     System.out.println(s2per);
     System.out.println(s3per);
     System.out.println(s4per);
     System.out.println(s5per);
     System.out.println(s6per);
     System.out.println(avgper);
     System.out.println(t);
	  
     }
}
