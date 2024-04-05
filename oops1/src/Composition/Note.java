package Composition;

public class Note {
 private String brand;
 private String  colour;
 private int noofpages;
 private Paper paper;
 
 public Note(String brand,String colour,int noofpages,Paper paper) {
	 this.brand=brand;
	 this.colour=colour;
	 this.noofpages=noofpages;
	 this.paper=paper;
 }
 
 public void  setbrand(String brand) {
	 this.brand=brand;
	}
 public  String getbrand() {
	 return brand;
 }
 public void setcolour(String colour) {
	 this.colour=colour;
 }
 public String getcolour() {
	 return colour;
 }
 public void setnoofpages(int noofpages) {
	 this.noofpages=noofpages;
 }
 public int getnoofpages() {
	 return noofpages;
 }
public String toString() {
	return brand+" "+colour+" "+noofpages+" "+paper;
}
}