package HashMap;

public class laptop {
	private String brand;
	private int price;
	private String color;
	private float rating;
	public laptop(String brand, int price, String color, float rating) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.rating = rating;
		
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
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;

}
    public String toString() {
		return "laptop [brand=" + brand + ", price=" + price + ", color=" + color + ", rating=" + rating + "]";
	}
	
}
	
		
	


