package HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class UseLaptop {
	public static void main(String[] args) {
		laptop l=new laptop("samsung",2000,"black",2.5f);
		laptop l1=new laptop("dell",5000,"brown",4.5f);
		laptop l2=new laptop("apple",40000,"white",5.5f);
		laptop l3=new laptop("hp",3000,"orange",3.4f);
		laptop l4=new laptop("realme",4000,"green",6.5f);
		laptop l5=new laptop("redmi",6000,"grey",5.5f);
		laptop l6=new laptop("vivo",3000,"brown",3.4f);
		laptop l7=new laptop("oppo",400000,"green",7.5f);
		laptop l8=new laptop("asus",600000,"grey",5.5f);
		laptop l9=new laptop("mi",3000,"brown",3.4f);
		
		HashMap<String,laptop>x=new HashMap<>();
		x.put(l.getBrand(),l);
		x.put(l1.getBrand(),l1);
		x.put(l2.getBrand(),l2);
		x.put(l3.getBrand(),l3);
		x.put(l4.getBrand(),l4);
		x.put(l5.getBrand(),l5);
		x.put(l6.getBrand(),l6);
		x.put(l7.getBrand(),l7);
		x.put(l8.getBrand(),l8);
		x.put(l9.getBrand(),l9);
		
		/*x.keySet().forEach (z-> {
			System.out.println(z);
		});
		*/
		/*x.keySet().forEach(z-> {
			if(x.get(z).getColor().startsWith("g")) {
				x.get(z).setPrice(x.get(z).getPrice()+200);
				System.out.println(x.get(z));
			}
			});	*/
		Iterator<String>y=x.keySet().iterator();
		while(y.hasNext()) {
			System.out.println(y.next());
		}
		}
				
			}
		
		
		
	


