package day11_JavaInheritance_Overriding_SuperKeyword;

class Parent
{
	void display(int a)
	{
		System.out.println(a);
	}
}

class child1 extends Parent
{
	void show(int b)
	{
		System.out.println(b);
	}
}

class child2 extends Parent
{
	void print(int c)
	{
		System.out.println(c);
	}
}

public class HierarchyInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		child1 c1=new child1();
		c1.display(100);
		c1.show(200);
		
		child2 c2=new child2();
		c2.display(10);
		c2.print(20);
		
	}

}
