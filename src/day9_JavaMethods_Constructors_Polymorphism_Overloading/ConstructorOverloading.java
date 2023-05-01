package day9_JavaMethods_Constructors_Polymorphism_Overloading;

public class ConstructorOverloading {

	int x,y,z;
	double d;
	
	ConstructorOverloading()
	{
		x=10;
		y=20;
	}
	
	ConstructorOverloading(int a, int b)
	{
		x=a;
		y=b;
	}
	
	ConstructorOverloading(int a, double b)
	{
		x=a;
		d=b;
		
	}
	
	void display() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorOverloading co=new ConstructorOverloading(100,58);
		
		co.display();
	}

}
