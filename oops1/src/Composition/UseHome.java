package Composition;

public class UseHome {
	public static void main(String[] args) {
		Wall w=new Wall();
		w.setwidth(3.5f);
		w.setColour("White");
		Home  h=new Home();
		h.setName("Gobika Home");
		h.setColour("Pink");
		h.setdoors(5);
		h.setWall(w);
		System.out.println(h.getName()+" "+h.getColour()+" "+h.getnoofRooms()+" "+h.getdoors()+" "+h.getWall().getWidth()+h.getWall().getColour());
		
	}

}
