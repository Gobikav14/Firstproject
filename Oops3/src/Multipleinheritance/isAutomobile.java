package Multipleinheritance;

public class isAutomobile implements Bike,Car {
	
	public void cc(String a,String b) {
	 System.out.println(a.concat(b));
	}
	public int noofitems(int c) {
		return c;
	}
	public void ck(String d,String w) {
		System.out.println(d.concat(w));
	}
    public int noofitems(int f,int e) {
    return f+e;
    }
}


