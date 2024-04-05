package practice;

public class UseEarphone {
	public static void main(String[]args) {
		String a=args[0];
		String[] b=a.split(",");
		String c=b[0];
		String d=b[1];
		String e=b[2];
		int f=Integer.parseInt(c);
		int g=Integer.parseInt(e);
		int h=f-g;
		Earphone ear=new Earphone();
		ear.price=f;
		ear.color=d;
		ear.discountAmount=g;
		ear.netPrice=h;
		System.out.println("colour:"+ear.color+",Net price:"+ear.netPrice);
	}

		
	}


