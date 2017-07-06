
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
public class Testcollection{

	public static void main(String args[])
	{
	Set<Car> arraylist=new HashSet<Car>();
	Car c =new Car("A1","white","Audi");
	arraylist.add(new Car("A1","white","Audi"));
	arraylist.add(new Car("A2","red","Hyundai"));
	arraylist.add(new Car("A3","Blue","Ford"));
	arraylist.add(c);
	arraylist.add(c);
	//Collections.sort( arraylist,new Comparator<Car>() {

	//	@Override
	//	public int compare(Car o1, Car o2) {
			// TODO Auto-generated method stub
	//		return o1.getColor().compareTo(o2.getColor());
	//	}
		
	//});
	for(Car car:arraylist) {
		System.out.println(car.hashCode());
		System.out.println("MOdel"+car.getModel()+"Color"+car.getColor()+"Company"+car.getCompany());
	}
	//System.out.println(arraylist);
	}
}
