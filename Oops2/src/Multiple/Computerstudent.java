package Multiple;

public class Computerstudent extends Student{
	private int noofstudent;

	public String findlabhours(int computerclass, int othersubject) {
		return "Lab hours=" + (24 - (computerclass + othersubject));
	}

	public Computerstudent(String name, int age, String gender, String department, int year, int noofstudent) {
		super(name,age,gender,department,year);
		this.noofstudent = noofstudent;
	}

	public void setnoofstudent(int noofstudent) {
		this.noofstudent = noofstudent;
	}

	public int getnoofstudent() {
		return noofstudent;
	}

	public String toString() {
		return super.toString() + ", Noofstudent=" + noofstudent;
	}

}
