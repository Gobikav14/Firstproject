package Arraylist;

import java.util.ArrayList;

public class Task1 {
	public static void main(String[] args) {
		ArrayList<Integer> nums=new ArrayList<>();
		nums.add(24);
		nums.add(6);
		nums.add(92);
		nums.add(87);
		nums.add(55);
		//for(int i=0;i<nums.size();i++) {
		//	System.out.println(nums.get(i));
		//for(Integer a: nums) {
		//	System.out.println(a);
		nums.forEach(x->System.out.println(x));
		}
	}


