package HashMap;

import java.util.HashMap;

public class Task1 {
public static void main(String[] args) {
	HashMap<Integer,String>var=new HashMap<>();
	var.put(1,"Sandhiya");
	var.put(2,"abi");
	var.put(3,"deepika");
	var.put(4,"nandhs");
	var.put(5,"aruna");
	//for(Integer x:var.keySet()) {
	//System.out.println(x);
	//for(Integer x:var.keySet()) {
	//	System.out.println(x+"="+var.get(x));
	//for(Integer x:var.keySet()) {
		//if(x<5) {
		//	System.out.println(x+"="+var.get(x));
	//	for(String x:var.values()) {
			//if(x.endsWith("a")) {
			//	System.out.println(x);
	/*for(String x:var.values()) {
		if(x.endsWith("a")) {
			continue;
		}
		else {
			System.out.println(x);
			}  */ 
	/*for(Integer x:var.keySet()) {
		if(x%2==0) {
			System.out.println(var.get(x));
		}*/
	var.keySet().forEach(x-> {
	if(x%2==0) {
	
		System.out.println(var.get(x).charAt(var.get(x).length()-2));
	}
	
	}
}

 
    }
  }	



