package day10_Encapsulation_SetterGetter_StaticKeywod;

public class StaticExample {

	static int a=10; //static variable
	int b=20; //non static variable
	
	static void m1()
	{
		System.out.println("This is m1 static method");
	}
	
	void m2()
	{
		System.out.println("This is m2 non static method");
	}
	
	void m3() //non static 
	{
		System.out.println(a);
		System.out.println(b);
		
		m1();
		m2();
	}
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		StaticExample se=new StaticExample();
//		 
//		System.out.println(a);
//		//System.out.println(b); //Incorrect because b is a non static variable
//	
//		m1();
//	//	m2(); //Incorrect because m2() is a non static method
//	
//		//Non static method is call by using object
//		se.m2();
//		
//		se.m3();
//	}

}
