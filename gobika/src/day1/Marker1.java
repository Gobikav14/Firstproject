package day1;

public class Marker1 {
//	String brand;
//	String colour;
//	int  price;
//	float size;
	public static void main(String[] args) {
		Marker m = new Marker();
		m.brand="camelin";
		m.colour="red";
		m.price=26;
		m.size=2.5f;
		m.taxAmount=10;
		m.netPrice=m.price+m.taxAmount;
		System.out.println("m Object--->" +m.netPrice);
		
		Marker m1=new Marker();
		m1.brand="Brile";
		m1.colour="black";
		m1.price=35;
		m1.size=6.7f;
		m1.taxPercentage=14;
		//m1.taxAmount=m1.price*m1.taxPercentage/100;
		m1.netPrice=m1.price+(m1.price*m1.taxPercentage/100);
		System.out.println("m1 Object----> "+m1.netPrice);
		
		
		
		System.out.println(m.brand+m.colour+m.price+m.size);
		System.out.println(m1.brand+m1.colour+m1.price+m1.size);

	}
}