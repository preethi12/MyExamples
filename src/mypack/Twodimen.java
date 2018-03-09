package mypack;

public class Twodimen {
	int a[][]={{1,2,3},{4,5,6}};
	public void sum()
	{
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
	Twodimen  td=new Twodimen();
	td.sum();
	}

}
