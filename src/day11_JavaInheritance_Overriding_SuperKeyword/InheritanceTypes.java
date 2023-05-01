package day11_JavaInheritance_Overriding_SuperKeyword;

class A {
	int a;

	void display() {
		System.out.println(a);
	}
}

class B extends A {
	int b;

	void show() {
		System.out.println(b);
	}
}

class C extends B {
	int c;

	void print() {
		System.out.println(c);
	}
}

public class InheritanceTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b = new B();  //Single Inheritance

		b.a = 100;
		b.b = 200;

		b.display();
		b.show();
		
		C c=new C(); //Multilevel Inheritance
		c.a=10;
		c.b=20;
		c.c=30;
		
		c.display();
		c.show();
		c.print();
	}

}
