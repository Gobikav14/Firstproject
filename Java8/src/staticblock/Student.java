package staticblock;

public class Student {
	String name;
	static String college;
	static {
		System.out.println("static exceuted");
	}
	public String toString() {
		return name+" "+college;
	}

}
