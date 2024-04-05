package For3;

public class Task6 {
	public static void main(String[] args) {
   String[] a={"I","am","a","developer"};
	    String b=" ";
		for(int i=0;i<a.length;i++) {
		char[] x=a[i].toCharArray();
		for(int j=x.length-1;j>=0;j--) {
			b=b+x[j];
		}
		}
		System.out.println(b);
		}
		}


