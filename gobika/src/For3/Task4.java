package For3;

public class Task4 {
	public static void main(String[] args) {
		String a="banana";
		char[] b=a.toCharArray();
		for(int i=0;i<b.length;i++) {
	  int count=0;
	  for(int j=i+1;j<b.length;j++) {
		  if(b[i]==b[j]) {
			  count=count+1;
			  b[j]='$';
		  }
	  }
	 System.out.println(count);
		  }
	  }
		

		}


