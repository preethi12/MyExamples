package mypack;

public class Calculator {
	public void add() {
		System.out.println("adding.....");
	}

	public void sub() {
		System.out.println("subtacting.... ");
	}

	public static void main(String[] args) {
		
		Calculator cal=new Calculator();
		cal.sub();
		cal.add();
		cal.sub();

	}

}
