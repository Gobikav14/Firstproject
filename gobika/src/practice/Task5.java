package practice;

public class Task5 {
	public static void main(String[] args) {
		String val = "Gopika14@Onesoft";
		for (int i = 0; i < val.length(); i++) {
			if (val.charAt(i) >= 'A' && val.charAt(i) <= 'Z') {
				System.out.println(val.charAt(i) + " Uppercase");
			} else if (val.charAt(i) >= 'a' && val.charAt(i) <= 'z') {
				System.out.println(val.charAt(i) + " smallcase");
			} else if (val.charAt(i) >= '0' && val.charAt(i) <= '9') {
				System.out.println(val.charAt(i) + " number");
			} else {
				System.out.println(val.charAt(i) + " specialcharacter");
			}
		}
	}