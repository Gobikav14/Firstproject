package conditions;

public class Grade {
	public static void main(String[]args) {
		int a=56;
		if(a>90 && a<=100) {
		System.out.println("o grade");
	}
	 else if (a>=80&& a<=90) {
	System.out.println("is a grade");
    }
	 else if(a>=70&&a<80) {
		 System.out.println("B grade");
		
	 }
	 else if (a>=60&&a<70) {
		 System.out.println("B+ grade");
	 }
	 else if (a>=50&&a<60) {
		 System.out.println("average");
	 }
	 else if ( a>=30&&a<50) {
		 System.out.println("below average");
	 }
	 else if(a>=0&&a<30) {
		 System.out.println("fail");
	 }
	 
 else{
	System.out.println("invalid input");
 }

}
}