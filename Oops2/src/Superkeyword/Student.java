package Superkeyword;

public class Student extends Human {
	String department;
	int year;

	public int findpercentage(int totalmarks, int acquiredmarks) {
		return acquiredmarks / totalmarks * 100;
	}

	public Student(String name,int age,String gender, String department, int year) {
		super(name, age, gender);
		this.department = department;
		this.year = year;
	}

	public void setdepartment(String department) {
		this.department = department;
	}

	public String getdepartment() {                                                                                                
		return department;
	}

	public void setyear(int year) {
		this.year = year;
	}

	public int getyear() {
		return year;
	}

	public String toString() {
		return super.toString()+ ", Department=" + department + ", Year=" + year;
	}

}
