package mypack;

public class Abstract1 extends Abstraction {
	public void move()
	{
		System.out.println("moving");
        super.call();
	}
	

	public static void main(String[] args) {
		Abstract1 al=new Abstract1();
		al.move();
	}

}
