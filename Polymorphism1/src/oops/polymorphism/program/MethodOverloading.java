package oops.polymorphism.program;

class Adder
{
	static int add(int a,int b)
	{
		return a+b;
	}
	static float add(float a,float b)
	{
		return a+b;
	}
	static int add(int a,int b,int c)
	{
		return a+b+c;
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Adder.add(15, 15));
		System.out.println(Adder.add(13,13));
		System.out.println(Adder.add(1, 2, 3));
		
		
		
		

	}

}
