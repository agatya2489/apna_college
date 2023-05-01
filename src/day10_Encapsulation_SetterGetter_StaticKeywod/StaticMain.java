package day10_Encapsulation_SetterGetter_StaticKeywod;

public class StaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticExample se=new StaticExample();
		 
		System.out.println(StaticExample.a);
		//System.out.println(b); //Incorrect because b is a non static variable
	
		StaticExample.m1();
	//	m2(); //Incorrect because m2() is a non static method
	
		//Non static method is call by using object
		se.m2();
		
		se.m3();
	}
}
