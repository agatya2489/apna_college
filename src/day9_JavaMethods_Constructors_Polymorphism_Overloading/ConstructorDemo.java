package day9_JavaMethods_Constructors_Polymorphism_Overloading;

public class ConstructorDemo {

	int x,y;
	String s;
	
//	public ConstructorDemo() { //default constructor
//		super();
//		// TODO Auto-generated constructor stub
//		x=100;
//		y=200;
//		s="Welcome";
//	}
	
	public ConstructorDemo(int a, int b, String str) { //Parameterized constructor
		x=a;
		y=b;
		s=str;
	}
	
	void displayData() //method
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(s);

	}
	
	public static void main(String args[])
	{
	//	ConstructorDemo cd=new ConstructorDemo; //we are invoking default constructor
		ConstructorDemo cd=new ConstructorDemo(10, 20, "Welcome");
		cd.displayData();
		
	}

	
}
