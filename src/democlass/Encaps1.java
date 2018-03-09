package democlass;

public class Encaps1 extends Encaps {

	public static void main(String[] args) {
		Encaps1 e1=new Encaps1();
		e1.setFnum(10);
		e1.setSnum(40);
	e1.setResult(e1.getFnum()+e1.getSnum());
	System.out.println(e1.getResult());
	}
	

}
