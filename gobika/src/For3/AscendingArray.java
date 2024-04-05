package For3;

import java.util.Arrays;
public class AscendingArray {
	public static void main(String[] args) {
		int []x= {21,12,14,18,24,10};
		Arrays.sort(x);
		
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
		}
	}

}
