package Arraylist;
import java.util.ArrayList;
public class basic {
	public static void main(String[] args) {
ArrayList<Integer> nums=new ArrayList<>();
 nums.add(24);
 nums.add(6);
 nums.add(92);
 nums.add(87);
 nums.add(55);
 
 //System.out.println(nums);
 nums.set(2, 72);
 //System.out.println(nums);
 nums.remove(1);
 //System.out.println(nums);
 //System.out.println(nums.get(1));
 System.out.println(nums.size());
 }
}
