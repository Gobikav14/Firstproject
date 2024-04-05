package Arraylist;
import java.util.ArrayList;

public class Usedemo {
	public static void main(String[] args) {
		demo d=new demo("dell",2300,"black",4.5f,2002);
		demo d1=new demo("samsung",4000,"white",3.5f,400);
		demo d2=new demo("bpple",500,"dark",6.7f,60000);
		demo d3=new demo("hp",2000,"white",7.8f,250000);
		demo d4=new demo("asus",6000,"green",7.8f,5000);
		
		ArrayList<demo>demos =new ArrayList<>();
		demos.add(d);
		demos.add(d1);
		demos.add(d2);
		demos.add(d3);
		demos.add(d4);
		//for(int i=0;i<demos.size();i++) {
		//	System.out.println(demos.get(i));
		//for(demo a: demos) {
			//System.out.println(a);
		//demos.forEach(x-> System.out.println(x));
		//if(a.getcolour()=="white") {
			//System.out.println(a);
		//demos.forEach(x-> {
			//if(x.getprice()>25000&&x.getprice()<200);
			//System.out.println(x);
		ArrayList<demo>newdemo=new ArrayList<>();
		//demos.forEach(x-> {
		//if(x.getbrand().startsWith("b")) {
		//	newdemo.add(x);
		//}
		//});
	//System.out.println(newdemo);

	//	}
		
	
		demos.forEach(x->  {
			if(x.getrating()>=8.5f){
				x.setprice(x.getprice()+(x.getprice()*25/100));
			System.out.println(demos);
		});
	
		
		
		
		
		
		
	


