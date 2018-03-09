package mypack;

public class Twodimen3 {	
	public static void main(String[] args) {
	int a[]={10,20,30,40,50,60,7,80,35,25};
	int lnum=a[0];
	int slnum=a[0];
	for(int i=0;i<a.length;i++)
	{
	if(a[i]>lnum)
	{
		slnum=lnum;
		lnum=a[i];
	}
	else if(a[i]>slnum)
	{
		slnum=a[i];
	}
	}
	System.out.println("second largest number:"+slnum);
	}
}
