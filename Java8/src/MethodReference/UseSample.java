package MethodReference;

public class UseSample {
	public static void main(String[] args) {
		int[] nums= {24,6,35,93,53};
		Sample s=new Sample();
		Demo d=s::findMax;
		System.out.println(d.find(nums));
	}

}
