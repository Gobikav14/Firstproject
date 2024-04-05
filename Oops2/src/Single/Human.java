package Single;

public class Human {
	String name;
	int age;
	String gender;
	public String findEatHours(int sleepingHours,int idealHours,int workHours) {
		return "Eating Hours="+(24-(sleepingHours+idealHours+workHours));
	}
	
	}


