package mypack;

public class Twodimen2 {
	//ans not coming with breakk pls ask quest
	int a[][]={{1,2,3},{4,5,6}};
	int b[][]={{7,8,9},{1,2,3}};
	int c[][]=new int [2][3];
	public void sum()
	{
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
							}
			
			System.out.println();
	
		}
	
	}
	
	public static void main(String[] args) {
	Twodimen2  td=new Twodimen2();
	td.sum();
	}

}
