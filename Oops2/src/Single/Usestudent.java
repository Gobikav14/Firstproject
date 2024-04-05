package Single;

public class Usestudent {
	public static void main(String[] args) {
		Student s=new Student();
		s.name="Gobika";
		s.age=21;
		s.gender="Female";
		s.department="Computer science";
		s.year=4;
		System.out.println(s.name+" "+s.age+" "+s.gender+" "+s.department+" "+s.year+" "+s.findEatHours(6, 7, 8)+" "+s.findpercentage(500,425));
		
		
		
	}

}
