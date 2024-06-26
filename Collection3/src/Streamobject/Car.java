package Streamobject;

public class Car {
	private String brand;
	private int price;
	private String color;
	private boolean isPetrol;
	private int noOfseats;
	public Car(String brand, int price, String color, boolean isPetrol, int noOfseats) {
		
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.isPetrol = isPetrol;
		this.noOfseats = noOfseats;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean getisPetrol() { 
		return isPetrol;
	}
	public void setisPetrol(boolean isPetrol) {
		this.isPetrol =isPetrol;
	}
	
	public int getNoOfseats() {
		return noOfseats;
	}
	public void setNoOfseats(int noOfseats) {
		this.noOfseats = noOfseats;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", color=" + color + ", isPetrol=" + isPetrol;
				
	}
	

}
