package democlass;

public class Duplicatearray {

	public static void main(String[] args) {
		String str="preethithara";
		int a=0;
		char[] inp=str.toCharArray();
		for (int i = 0; i < str.length(); i++) 
		{	
			for (int j = i + 1; j < str.length(); j++) 
			{	
				if (inp[i] == inp[j])
						{
					System.out.println("duplicate numbers:" + inp[j]);
					a++;
					
				}

			}
		}
	}

}
