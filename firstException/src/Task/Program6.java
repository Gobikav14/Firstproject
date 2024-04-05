package Task;

public class Program6 {
	public static void main(String[] args) {
		System.out.println("Start");
		try {
			String[] a= {"Nisha","Kumar","Karthick"};
			System.out.println(a[2].charAt(8));
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			ae.printStackTrace();
		}
		catch(IndexOutOfBoundsException ie) {
			ie.printStackTrace();
		}
		catch(RuntimeException re) {
			re.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("End");
	}

}
