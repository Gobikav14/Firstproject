package Defaultkeyword;

public interface Demo {
	public static String findName() {
		return "Raja";
	}
	public default void findAge() {
		System.out.println(20);
	}

}
