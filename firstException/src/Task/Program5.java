package Task;

public class Program5 {
	public static void main(String[] args) {
		System.out.println("Start");
		try {
		String a= {"gobika","sandhiya","dinesh"};
		String a1=a.charAt(5);
		}
		catch (StringIndexOutOfBoundsException z) {
			System.out.println("Error is occured change the input");
		}
		System.out.println("End");
	}

}
