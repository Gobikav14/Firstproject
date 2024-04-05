package exercises;

public class FindGreatestElseIf {
	public static void main(String[] args) {
		int a = 24; 
		int b = 6;
		int c = 89;
		
		if(a > b && a > c) {
			System.out.println(a + " is the greatest");
		}
		else if(b > a && b > c) {
			System.out.println(b + " is the gretaest");
		}
		else {
			System.out.println(c + " is the greatest");
		}
	}

}
