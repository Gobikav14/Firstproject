package Composition;

public class Paper {
private int length;
private  String colour;

public  Paper(int length,String colour) {
	this.length=length;
	this.colour=colour;
}

public void setlength(int length) {
	this.length=length;
}
public int getlength() {
	return length;
}
public void setcolour(String colour) {
	this.colour=colour;
}
public String getcolour() {
	return colour;
}
public String toString() {
	return length+" "+colour;
}
}
