
public class Car {
String model;
String color;
String company;
Car(String model, String color, String company)
{
	this.color=color;
	this.company=company;
	this.model=model;
}
public static void main(String args[]) {
Car c1=new Car("A6","red","Audi");
Car c2=new Car("A7","black","hyundai");
System.out.println(c1.equals(c2));
}
public boolean equals(Car c)
{
	return this.model.equals(c.model) && this.color.equals(c.color) && this.company.equals(c.company);
}
}
