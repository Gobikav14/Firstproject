package For2;

public class stringmaximum {
	public static void main(String[] args) {
		String []a= {"apple","orange","mango","pinapple"};
		String max=a[0];
		for(int i=0;i<=a.length-1;i++) {
			if(a[i].length()>max.length()) {
		        max=a[i];
	}
		}
	System.out.println(max);
		
	}

}
