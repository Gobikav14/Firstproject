package Abstract;

public abstract class Vehicle {
	public int findNetprice(int amount,int taxpercentage) {
		return amount*taxpercentage/100;
	}
	public abstract void findMileage(int speed);

}
