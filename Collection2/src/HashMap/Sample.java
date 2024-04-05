package HashMap;

import java.util.HashMap;

public class Sample {
	public static void main(String[] args) {
		HashMap<Integer,String>var=new HashMap<>();
		var.put(10,"Abi");
		var.put(20,"prem");
		var.put(30,"Nisha");
		var.put(40,"Abi");
	//	System.out.println(var.keySet());
		//`1System.out.println(var.values());
		//for(System.out.println(var);
		//for(Integer x:var.keySet()) {
		//	for(Integer y:var.keySet()) {
			//System.out.println(y+"="+var.get(y));
		//for(String y:var.values()) {
			//System.out.println(y);
		//var.keySet().forEach(x->System.out.println(x));
		//var.values().forEach(x->System.out.println(x));
		//var.keySet().forEach(x->System.out.println(x+"="+var.get(x)));
		var.forEach((x,y)->System.out.println(x+"="+y));
		}
		
	}


