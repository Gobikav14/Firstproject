package For2;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop lap1=new Laptop();
		lap1.brand ="Dell";
		lap1.colour ="black";
		lap1.price =10000;
		lap1.isQuality=true;
		
		Laptop lap2=new Laptop();
		lap2.brand="Hp";
		lap2.colour ="white";
		lap2.price=20000;
		lap2.isQuality=true;
		
		Laptop lap3=new Laptop();
		lap3.brand="Asus";
		lap3.colour="brown";
		lap3.price=30000;
		lap3.isQuality=false;
		
		Laptop lap4=new Laptop();
		lap4.brand="microsoft";
		lap4.colour="red";
		lap4.price=40000;
		lap4.isQuality=true;
		
		Laptop lap5=new Laptop();
		lap5.brand="Acer";
		lap5.colour="green";
		lap5.price=50000;
		lap5.isQuality=true;
		
	   Laptop []laps= {lap1,lap2,lap3,lap4,lap5};
//	   Laptop max=laps[0];
//	   for(int i=0;i<=laps.length-1;i++) {
		   //System.out.println(laps[i].brand+laps[i].colour+laps[i].price+laps[i].isQuality);
//		   if(laps[i].colour.equals("brown")) {
//		   System.out.println(laps[i].brand+laps[i].price);
//		   }
			   
//			   if(laps[i].isQuality==true) {
//		System.out.println(laps[i].price);
//		   }
			   
//			 if(laps[i].price>30000) {
//				 System.out.println(laps[i].brand);
//			 }
//			    
	
		   
//		   if(laps[i].price<max.price) {
//		   max= laps[i];
//		   }
//	   }
	   
//		System.out.println(max.brand+" "+max.colour+" "+max.price+" "+max.isQuality);
		lap1.display(laps);
		   
	   
	}
	}


