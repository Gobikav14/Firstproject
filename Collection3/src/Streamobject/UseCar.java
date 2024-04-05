package Streamobject;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseCar {
	public static void main(String[] args) {
		Car c1=new Car("audi",20000,"white",true,4);
		Car c2=new Car("himalayan",50000,"black",false,5);
		Car c3=new Car("suzuki",4000000,"green",true,6);
		Car c4=new Car("toyoto",800000,"brown",false,8);
		Car c5=new Car("Audi",700000,"yellow",true,10);
		ArrayList<Car>nums=new ArrayList<>();
		nums.add(c1);
		nums.add(c2);
		nums.add(c3);
		nums.add(c4);
		nums.add(c5);
	//nums.stream().forEach(x->System.out.println(x));
		
		//List<Car>price1=nums.stream().filter(x->x.getPrice()>1000000).collect(Collectors.toList());
       // price1.forEach(x->System.out.println(x));
		
		//nums.stream().filter(x->x.getisPetrol()==true).forEach(x->System.out.println(x));
         
		//List<String>brands=nums.stream().map(x->x.getBrand()).collect(Collectors.toList());
		//brands.forEach(x->System.out.println(x));
		
		/*List<Car>prices=nums.stream().filter(x->x.getNoOfseats()>4).map(x-> {
			x.setPrice(x.getPrice()+x.getPrice()*10/100);
			return x;
		}). collect(Collectors.toList());
		prices.forEach(x->System.out.println(x));
		}
	}*/
		
	/*	List<Car>sort=nums.stream().sorted(Comparator.comparing(Car::getPrice)).collect(Collectors.toList());
		sort.forEach(x->System.out.println(x));
	}
}*/
		//1.max
		//Car max=nums.stream().max(Comparator.comparing(Car::getNoOfseats)).get();
		//System.out.println(max);
	//}
//}
	//2.min()
		/*Car min =nums.stream().min(Comparator.comparing(Car::getNoOfseats)).get();
		System.out.println(min);
	}
}*/
		//3.limit
		/*List<Car>limit=nums.stream().limit(2).collect(Collectors.toList());
		limit.forEach(x->System.out.println(x));
	}
}*/
		//4.distinct();
	/*	List<String>distinct=nums.stream().map(x->x.getBrand()).distinct().collect(Collectors.toList());
		distinct.forEach(x->System.out.println(x));
	}
}*/
		//5.map;
		Map<String,Car>mapping=nums.stream().filter(x->x.getBrand().startsWith("A")).collect(Collectors.toMap(x->x.getBrand(),y->y));
		mapping.forEach((x,y)->System.out.println(x+" "+y));
	}
}

