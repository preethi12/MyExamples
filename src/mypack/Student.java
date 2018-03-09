package mypack;

public class Student {
int roll_no;
String name;
Student(int roll_no,String name)
{
	this.roll_no=roll_no;
	this.name=name;
}
public void display()
{
	System.out.println("roll numbers:"+roll_no+"student name:"+name);
}
	public static void main(String[] args) {
		Student s=new Student(841,"pintu");
		Student s1=new Student(203599,"tinku");
		s.display();
		s1.display();
	}

}
