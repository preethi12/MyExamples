package mypack;

public class codingamstrong 
{
	public static void main(String[] arg)
	{
		int c=153,a,temp=0;
int d=c;
while(c!=0)
{
	a=c%10;
	temp=(a*a*a)+temp;
	c=c/10;
}
if(d==temp)
{
System.out.println("this is amstrong nuber");	
}
else{
	System.out.println("this is not amstrong nuber");
}
}
}