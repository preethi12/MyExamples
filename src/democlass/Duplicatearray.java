package democlass;

public class Duplicatearray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 1, 5, 3, 4, 2, 6, 5, 1 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if ((a[i] == a[j]) && (i != j)) {
					System.out.println("duplicate numbers:" + a[j]);
					
				}

			}
		}
	}

}
