package day11_JavaInheritance_Overriding_SuperKeyword;

class Bank
{
	double roi()
	{
		return 0.0;
	}
}

class ICICI extends Bank
{
	double roi()
	{
		return 10.5;
	}
}

class Axis extends Bank
{
	double roi()
	{
		return 11.5;
	}
}


public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ICICI ic=new ICICI();
		System.out.println(ic.roi());
		
		Axis ax=new Axis();
		System.out.println(ax.roi());
		
		Bank b=new Bank();
		System.out.println(b.roi());
		
	}

}
