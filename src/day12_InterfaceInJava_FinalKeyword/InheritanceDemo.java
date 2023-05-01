package day12_InterfaceInJava_FinalKeyword;

interface Shape
{
	int length=10;  //final and also static 
	int width=20;   //final and also static
	
	void Circle(); //Abstract method - un-implemented method
	
	default void Square()  //default method
	{
		System.out.println("This is Square...Default Method");
	}
	
	static void Rectangle() //Static Method
	{
		System.out.println("This is Rectangle...Static Method");
	}
}

public class InheritanceDemo implements Shape{

	
	public void Circle() {
		System.out.println("This is Circle");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InheritanceDemo id=new InheritanceDemo();
		
		id.Circle();
		id.Square();
		
		Shape.Rectangle(); //static method directly can access
		
		//Shape sh=new Shape(); //not allowed
	    Shape sh=new InheritanceDemo();
	    
	    sh.Circle();
	    sh.Square();
	    
	    Shape.Rectangle();
	}

}
