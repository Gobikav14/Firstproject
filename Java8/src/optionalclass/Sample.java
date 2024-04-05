package optionalclass;

import java.util.Optional;

public class Sample {
	public static void main(String[] args) {
		String a=null;
		String b="Java";
		Optional<String>check=Optional.ofNullable(a);
		Optional<String>check1=Optional.ofNullable(b);
		System.out.println(check.isPresent());
		System.out.println(check.isEmpty());
		System.out.println(check.orElse(a));
		
		System.out.println(check.orElseThrow());
		System.out.println(check.orElseThrow(()->new NullPointerException()));
		System.out.println(check.get());
	}

}
