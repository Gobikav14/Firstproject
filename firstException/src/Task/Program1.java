package Task;

public class Program1 {
	public static void main(String[] args) {
		System.out.println("start");
		try {
			int num1=10;
			int num2=0;
			int result =num1/num2;
		}
		//catch(ArithmeticException z) {
		//	System.err.println("Error is occur change the input");
			//System.out.println(z);
		//	z.printStackTrace();
			//System.err.println("End");
	//	}
		finally {
			System.out.println("DB is closed");
		}
		System.out.println("End");
	}
}
