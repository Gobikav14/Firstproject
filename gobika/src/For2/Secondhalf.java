package For2;

public class Secondhalf {
public static void main(String[] args) {
	int []a= {1,2,3,4,5,6,7};
//	for(int i=a.length/2;i<=a.length-1;i++) {
//		System.out.println(a[i]);
//	}
	
	for(int i=a.length-1;i>=a.length/2;i--) {
		System.out.println(a[i]);
	}
}
}
