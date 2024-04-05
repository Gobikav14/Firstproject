package staticblock;

public class UseStudent {
	public static void main(String[] args) {
		Student.college="xyz";
		Student s1=new Student();
		
		s1.name="ABC";
		System.out.println(s1);
		
	}

}
