package Task;

public class Program8 {
	public static void main(String[] args) throws AgeException {
		System.out.println("Start");
		try {
			int age = 17;
			if (age >= 18) {
				System.out.println("Eligible");
			} else {
				throw new AgeException("NotEligible");
			}
		} catch (AgeException ae) {
			ae.printStackTrace();
		} 
		finally {
			System.out.println("The election is end");
		}
		System.out.println("End");
	}
}
