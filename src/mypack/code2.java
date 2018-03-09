package mypack;

public class code2 {

	public static void main(String[] args) {
		int a=152,b,temp=0;
		int c=a;
		while(a!=0)
		{
			b=a%10;
			temp=(b*b*b)+temp;
			a=a/10;
		}
if(c==temp)
{
	System.out.println("this is amstrong number");
}
else{
	System.out.println("this is not amstrong number");
}
	}

}
