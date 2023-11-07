class Hollow
{
	public static void main(String args[]) 
{ 
   int n=9,px=n/2+1,p=1; //n=9//px=4+1//
  for(int i=1;i<=n;i++) //1//
  { 
   for(int j=1;j<=n;j++) //1
   { 
    if(j==px|| j==n-px+1) 
      System.out.print(p); 
    else 
      System.out.print(" "); 
         } 
   if(i<=n/2) 
   { 
    px--; 
    p++; 
   } 
   else 
   { 
    px++; 
    p--; 
   } 
   System.out.println(); 
  } 
} 
}