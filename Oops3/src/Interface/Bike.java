package Interface;

public class Bike implements Vehicle {
	public int findNetprice (int amount,int taxpercentage) {
		return amount*taxpercentage/100;
	}
	public void findMileage (int speed) {
		if(speed>0&&speed<=20) {
			System.out.println(60);
		}
		else if(speed >20&&speed<=40) {
			System.out.println(40);
		}
		else {
			System.out.println(20);
		}
	}
   
   }
