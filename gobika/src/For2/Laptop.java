package For2;

public class Laptop {
	String brand;
	String colour;
	int price;
	boolean isQuality;
	
public void display(Laptop[] a) {
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i].brand+" "+a[i].colour+" "+a[i].price+" "+a[i].isQuality);
	}
}
}
