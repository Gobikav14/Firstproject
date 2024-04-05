package MethodReference;

public class Sample {
	public int findMax(int[] a) {
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max;
	}
	public String findmin(String[]a) {
		String min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i].length()<min.length()) {
				min=a[i];
			}
		}
		return min;
	}

}
