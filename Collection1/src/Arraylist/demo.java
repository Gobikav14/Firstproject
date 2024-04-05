package Arraylist;

public class demo {
 private String brand;
private int price;
private String colour;
private float rating;
private int editionyear;
public demo(String brand,int price,String colour,float rating,int editionyear) {
this.brand=brand;
this.price=price;
this.colour=colour;
this.rating=rating;
}

public void setbrand(String brand) {
	this.brand=brand;
}
public String getbrand() {
	return brand;
}
public void setprice(int price) {
	this.price=price;
}
public int getprice() {
	return price;
}
public void setcolour(String colour) {
	this.colour=colour;
}
public String getcolour() {
	return colour;
}
public void setrating(float rating) {
	this.rating=rating;
}
public float getrating() {
	return rating;
}
public String toString() {
return "BRAND= "+brand+", PRICE="+price+", COLOUR="+colour+", RATING="+rating+", EDITION YEAR="+editionyear;


}
}


