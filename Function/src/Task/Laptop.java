package Task;

public class Laptop {
	String brand;
	String colour;
	int price;
	boolean isQuality;

public void getname(Laptop[] a) {
	for(int i=0;i<a.length;i++) {
		if(a[i].brand.startsWith("S")) {
			System.out.println(a[i].brand+a[i].price+a[i].colour+a[i].isQuality);
		}
	}
}
}
