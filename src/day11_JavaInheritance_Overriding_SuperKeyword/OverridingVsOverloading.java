package day11_JavaInheritance_Overriding_SuperKeyword;

class PQR
{
	void m1(int a) {
		System.out.println(a);
	}
	
	void m2(int b)
	{
		System.out.println(b);
	}
}

class MNO extends PQR
{
	void m1(int a) //Override method
	{
		System.out.println(a*a);
	}
	
	void m2(int a,int b) //overloading method
	{
		System.out.println(a+b);
	}
}

public class OverridingVsOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MNO o=new MNO();
		o.m1(100);
		o.m2(200);
		o.m2(10, 20);
	}

}
