package For3;
import java.util.Arrays;

public class Task7 {
	public static void main(String[] args) {
		
		String a="keep";
		String b="peek";
		char[] x=a.toCharArray();
	    char[] y=b.toCharArray();
		Arrays.sort(x);
		Arrays.sort(y);
		if(Arrays.equals(x,y)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not anagram");
		}
	}

}
