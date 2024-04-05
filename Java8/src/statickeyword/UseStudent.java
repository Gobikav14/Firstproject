package statickeyword;

public class UseStudent {
	public static void main(String[] args) {
		Student.college="SRM";
		Student s1=new Student();
		s1.college="Hindustan";
		s1.name="xyz";
		s1.age=25;
		System.out.println(s1);
	}

}
