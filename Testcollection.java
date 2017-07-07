import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
public class Testcollection{

	private static Object p;

	public static void main(String args[])
	{
	HashMap<Persons,Car> mapp=new HashMap<Persons,Car>();
	Persons p= new Persons("jitendra", "male");
	Car c =new Car("A1","white","Audi");
	//arraylist.add(new Car("A1","white","Audi"));
	//arraylist.add(new Car("A2","red","Hyundai"));
	//arraylist.add(new Car("A3","Blue","Ford"));
	//arraylist.add(c);
	//arraylist.add(c);
	mapp.put(new Persons("Kunal","male"),new Car("A1","white","Audi") );
	mapp.put(new Persons("Parshant","male"),new Car("A4","blue","Audi") );
	mapp.put(new Persons("Atul","male"),new Car("A6","green","Chevrolet") );
	mapp.put(new Persons("Jay","male"),new Car("A2","sky","Hyundai") );
	mapp.put(null,new Car("A7","gray","ferrari") );
	mapp.put(p, c);
	mapp.put(p, c);
	//arraylist.put(new Persons(),new Car("A3","red","hyundai") );
	//arraylist.put(new Persons(),new Car("A1","white","maruti") );
	//arraylist.put(new Persons(),new Car("A1","white","chevrolet") );
	//Collections.sort( arraylist,new Comparator<Car>() {

	//	@Override
	//	public int compare(Car o1, Car o2) {
			// TODO Auto-generated method stub
	//		return o1.getColor().compareTo(o2.getColor());
	//	}
		
	//});
	/*for(Car car:arraylist) {
		System.out.println(car.hashCode());
		System.out.println("MOdel"+car.getModel()+"Color"+car.getColor()+"Company"+car.getCompany());
	}*/
	//System.out.println(arraylist);
	for(Map.Entry<Persons,Car> car:mapp.entrySet()) {
		System.out.println("Key:"+car.getKey()+"value" + car.getValue());
	}
	System.out.println("value for 1, Kunal is" + mapp.get(p));
	}
}
