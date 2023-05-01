package day9_JavaMethods_Constructors_Polymorphism_Overloading;

public class thisKeyword {

	int x,y;
	
//	void setData(int a, int b)
//	{
//		x=a;
//		y=b;
//	}
	void setData(int x, int y)
	{
		this.x=x;
		this.
		y=y;
	}
	
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		thisKeyword tk=new thisKeyword();
		
		tk.setData(10, 20);
		tk.display();
	}

}
