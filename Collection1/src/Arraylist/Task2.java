package Arraylist;

import java.util.ArrayList;

public class Task2 {
public static void main(String[] args) {
	ArrayList<Integer> nums=new ArrayList<>();
	nums.add(24);
	nums.add(6);
	nums.add(92);
	nums.add(87);
	nums.add(55);
	for(int i=0;i<nums.size();i++) {
		if(nums.get(i)%2==0) {
			System.out.println("even");
		}
			else {
				System.out.println("odd");
			}
	}
	
}
}
