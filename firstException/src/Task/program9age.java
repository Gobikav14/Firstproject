package Task;

public class program9age {
	public static void main(String[] args)throws PasswordException {
		System.out.println("Start");
		try {
		String a="Gobika144";
		int a1=a.length();
		if(a1>8) {
			System.out.println("Eligible to acesss");
		}
		else {
			throw new PasswordException ("Not eleigible to acess");
		}
		}
		catch(PasswordException z) {
			z.printStackTrace();
		}
		System.out.println("End");
	}

}
