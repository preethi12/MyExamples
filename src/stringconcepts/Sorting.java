package stringconcepts;

public class Sorting {

	// doubt
	static String name = "This is my first program";
	static String arr[] = name.split(" ");

	public static void main(String[] args) {
		int i = 0;
		for (i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j].compareToIgnoreCase(arr[i]) <0) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i]);
		}
	}
}
