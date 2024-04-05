package Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//import java.util.list;
public class Task1 {
	public static void main(String[] args) {
		ArrayList<Integer>nums=new ArrayList<>();
		nums.add(24);
		nums.add(6);
		nums.add(92);
		nums.add(77);
		nums.add(53);
		//nums.stream().forEach(x->System.out.println(x));
		//nums.stream().filter(x->x%2==0).forEach(x->System.out.println(x));
		
		//long a=nums.stream().count();
		//2System.out.println(a);
		
		//List<Integer>coll=nums.stream().collect(Collectors.toList());
		//coll.forEach(x->System.out.println(x));
		
	//long a=nums.stream().filter(x->x%2!=0).count();
	//System.out.println(a);
		
		List<Integer>even=nums.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(even);
	}
}
