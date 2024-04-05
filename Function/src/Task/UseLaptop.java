package Task;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop lap1=new Laptop();
		lap1.brand="Dell";
		lap1.colour="black";
		lap1.price=1000;
		lap1.isQuality=true;
		
		Laptop lap2=new Laptop();
		lap2.brand="Samsung";
		lap2.colour="White";
		lap2.price=2000;
		lap2.isQuality=false;
		
		Laptop[] laps= {lap1,lap2};
		
		lap1.getname(laps);
		
		
		
		
	}

}
