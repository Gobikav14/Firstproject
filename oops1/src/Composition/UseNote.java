package Composition;

public class UseNote {
	public static void main(String[] args) {
//		Paper p=new Paper();
//		p.setlength(2);
//		p.setcolour("Black");
//		
//		Note n=new  Note();
//		n.setbrand("orange");
//		n.setcolour("white");
//		n.setnoofpages(10);
		//n.setpaper(p);
//		System.out.println(n);
		
		Paper p=new Paper(2,"Black");
		Note n=new Note("orange","white",10,p);
		System.out.println(n);
		
		
		
	}

}
