wpackage For2;

public class Maximumnumber {
	public static void main(String[] args) {
		int [] x= {14,115,89,788,355,999};
		int max=x[0];
		for(int i=0;i<=x.length-1;i++) {
			if(x[i]<max) {
				max=x[i];
			}
		}
		System.out.println(max);
	}
	}


