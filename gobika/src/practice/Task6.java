package practice;

public class Task6 {
	public static void main(String[] args) {
		int num=7;
		boolean b=true;
		for (int i=2;i<num;i++) {
			if (num%i==0) {
				b=false;
			}
			if (b==true) {
		System.out.println("Prime");
			}
			else {
				System.out.println("Not a prime");
				
			}
		}
	}

}
