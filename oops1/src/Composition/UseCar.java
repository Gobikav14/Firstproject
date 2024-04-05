package Composition;

public class UseCar {
public static void main(String[] args) {
	Engine e=new  Engine();
	e.brand="xyz";
	e.cc=2000;
	Car c=new Car();
	c.brand="BMW";
	c.price=200000;
	c.colour="White";
	c.ispetrol=true;
	c.engine=e;
	System.out.println(c.brand+" "+c.price+" "+c.colour+" "+c.engine.brand+" "+c.engine.cc);
	
}
}
