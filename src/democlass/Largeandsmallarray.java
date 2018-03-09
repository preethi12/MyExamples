package democlass;

public class Largeandsmallarray {

	public static void main(String[] args) {
int a[]={1,5,8,6,48,52,63};
int min=a[0];
int max=0;
for(int i=0;i<a.length;i++)
{
	if(a[i]>max)
	{
		max=a[i];
	}
	if(a[i]<min)
	{
		min=a[i];
	}
}
System.out.println("The maximum value"+max);
System.out.println("The maximum value"+min);
	}

}
