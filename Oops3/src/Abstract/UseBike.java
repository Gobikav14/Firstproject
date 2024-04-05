package Abstract;

public class UseBike {
	public static void main(String[] args) {
		Bike b=new Bike();
		System.out.println(b.findNetprice(350000, 20));
		b.findMileage(20);
	}

}
