package oops.polymorphism.program;
// to represent method overriding in java:
class Vehical
{
	void print()
	{
		System.out.println("old type of vehical ");
	}
}
class Car extends Vehical
{
	void print()
	{
		System.out.println("new typr of vehicals in market");
	}
}
class Megha extends Vehical
{
	void print()
	{
		System.out.println("Advance type of car");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Megha m = new Megha();
		m.print();
		Car c = new Car();
		c.print();
		Vehical v = new Vehical();
		v.print();
		
	}

}
