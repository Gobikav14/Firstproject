package Composition;

public class Home {
	private String name;
	private String colour;
	private int  noofRooms;
	private int doors;
	private  Wall wall;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setColour(String colour) {
		this.colour=colour;
	}
	public String getColour() {
		return colour;
	}
	public void setnoofRooms(int noofRooms) {
		this.noofRooms=noofRooms;
	}
	public int getnoofRooms() {
	 return noofRooms;
	}
	public void setdoors(int setdoors) {
		this.doors=doors;
	}
	public int getdoors() {
		return doors;
	}
	public void setWall(Wall wall) {
		this.wall=wall;
	}
	public Wall getWall() {
		return wall;
	}
		
	}


