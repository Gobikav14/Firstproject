package For3;

public class Task9 {
	public static void main(String[] args) {
		
	
	int [] a= {21,12,14,61,71,82,100};
	int max=a[0];
	int secmax=0;
	for(int i=0;i<=a.length-1;i++) {
		if(a[i]>max) {
		secmax=max;
		max=a[i];
		}
		if(a[i]>secmax&&a[i]!=max) {
			secmax=a[i];
		}
	}
	System.out.println(secmax);
		}
	}    


