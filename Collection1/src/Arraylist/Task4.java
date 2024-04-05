package Arraylist;

import java.util.ArrayList;

public class Task4 {
	public static void main(String[] args) {
		ArrayList<Integer> nums=new ArrayList<>();
		nums.add(24);
		nums.add(6);
		nums.add(92);
		nums.add(87);
		nums.add(55);
		nums.forEach(x->{
			if(x%2==0) {
				System.out.println(x);
			}
		});
	}

}
