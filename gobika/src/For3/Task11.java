package For3;

public class Task11 {
	public static void main(String[] args) {
		String a= "this is my home this is area";
		String[] b=a.split(" ");
		int countr=0;
		int countn=0;
		for(int i=0;i<b.length;i++) {
		int count=0;
		
		for(int j=i+1;j<b.length;j++) {
			if(b[i].equals(b[j])) {
				count=count+1;
				b[j]="$";
		}
	    }
		if
		(count==0 &&b[i]!="$") {
		countn=countn+1;
		//System.out.println(b[i]);
			
		}
       else {	
    	   countr=countr+1;
       }
		}
		System.out.println("repeat count"+countr);
		System.out.println("non repeat countn"+countn);
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	