package mypack;

public class VariablesEx {
	 int a=10;
	int b=20,c;
	public void add()
	{
		
		c=a+b;
		System.out.println(c);
	}
	public void sub()
	{
		c=a-b;
		System.out.println(c);
		a=90;
	}
	public static void main(String[] args) {
		VariablesEx  v=new VariablesEx();
		v.add();
		v.sub();
		System.out.println("part 1...");
		VariablesEx  v1=new VariablesEx();
		v1.add();
		v1.sub();
		
	}

}
