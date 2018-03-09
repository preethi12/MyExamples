package mypack;

public class Calci1 implements Calc {
public void add()
{
	System.out.println("adding");
}
	public static void main(String[] args) {
		Calci1 c1=new Calci1();
		c1.add();
	}
	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}

}
