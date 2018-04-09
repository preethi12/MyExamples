package democlass;

//import mypack.Calculator;

public class Largenumarray {
	public static void main(String[] args) {
		//Calculator cal=new Calculator();
		//cal.sub();
		int a[] = { 10, 15, 35, 20, 81, 65 };
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("The largest number is:" + max);
	}
	

}
