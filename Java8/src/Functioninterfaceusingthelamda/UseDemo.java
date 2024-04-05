package Functioninterfaceusingthelamda;

public class UseDemo {
	
	public static void main(String[] args) {
		Demo d1=(x,y)->(x+y);
	System.out.println(d1.find(24, 6));
	
		Demo d2=(x,y)-> {
			if(x>y) {
				return(x);
			}
			else {
				return(y);
			}
		};
		System.out.println(d2.find(24, 6));
	}

}
