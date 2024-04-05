package Basics;

public class UseCalculator {
	public static void main(String[] args) {
		Calculator c=new Calculator();
		System.out.println(c.add());
		System.out.println(c.subtract(10,5));
		c.multiple();
		c.divide(100,20);
	}

}
