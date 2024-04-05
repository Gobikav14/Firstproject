package Overloading;

public class Adder {
	public int add(int a,int b) {
		return a+b;
	}
	public String add(int a,float b) {
		return "Ans="+(a+b);
	}
	public double add(float a,long b) {
		return a+b;
	}
	public void add(long a,float b,int c) {
		System.out.println(a+b+c);
	}
	public void add(long a,int b,int c) {
		System.out.println("Ans="+(a+b+c));
		
	}

}
