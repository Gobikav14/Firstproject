package staticmethod;

public class UseStudent {
	public static void main(String[] args) {
		
		Student.college="xyz";
		System.out.println(Student.getAge());
		System.out.println(Student.college);
	}

}
