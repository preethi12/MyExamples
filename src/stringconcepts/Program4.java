package stringconcepts;

public class Program4 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("pintu");
		sb.append("tinku");
		System.out.println(sb);
//
		StringBuffer sb1=new StringBuffer("pintu");
		sb1.reverse();
		System.out.println(sb1);
		
		//please check delete option the output shd be "pnu"
		StringBuffer sb2=new StringBuffer("abcdef");
		sb2.delete(1, 3);
		System.out.println(sb2);
		
		//
		StringBuffer sb3=new StringBuffer("pintu");
		sb3.insert(2, "xyz");
		System.out.println(sb3);
		
		//
		StringBuffer sb4=new StringBuffer("pintu");
		sb4.insert(2, 'b');
		System.out.println(sb4);

		//
		StringBuffer sb5=new StringBuffer("pintu");
		sb5.replace(2, 4, "xyz");
		System.out.println(sb5);

	}

}
