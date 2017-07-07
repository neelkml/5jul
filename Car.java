
public class Car {
String model;
String color;
String company;
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
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
//public int hashCode() {
	//return 7;
//}

}
