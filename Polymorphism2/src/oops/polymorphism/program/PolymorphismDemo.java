package oops.polymorphism.program;

class Bank
{
	float getRateOfInterest()
	{
		return 8.4f;
	}
}
class SBI extends Bank
{
	float getRateOfInterest()
	{
		return 9.5f;
	}
}
class AXIS extends Bank
{
	float getRateOfInterest()
	{
		return 13.4f;
	}
}
public class PolymorphismDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b;
		b= new SBI();
		System.out.println("SBI rate of interset is = "+b.getRateOfInterest());
		
		b= new AXIS();
		System.out.println("AXIS rate of interset is = "+b.getRateOfInterest());
		
		b= new Bank();
		System.out.println("Bank rate of interset is = "+b.getRateOfInterest());



	}

}
