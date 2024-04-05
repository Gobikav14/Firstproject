package Superkeyword;

public class Human {
	String name;
	int age;
	String gender;
	public String findEatHours(int sleepingHours,int idealHours,int worksHours) {
		return "Eating Hours="+(24-(sleepingHours+idealHours+worksHours));
	}
		public Human(String name,int age,String gender) {
			this.name=name;
			this.age=age;
			this.gender=gender;
		}
		public void setname(String name) {
			this.name=name;
		}
		public String getname() {
			return name;
		}
		public void setage(int age) {
			this.age=age;
		}
		public int getage() {
			return age;
		}
		public void setgender(String gender) {
			this.gender=gender;
		}
		public String getgender() {
			return gender;
		}
		public String toString() {
			return "Name="+name+", age="+age+", gender="+gender;
		}
	

}
