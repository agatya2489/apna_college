package Practice;
// Write a Java program to find greatest of 3 numbers.

public class LargestOf3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=19;
		int b=30;
		int c=12;
		
		if(a>b && a>c)
		{
			System.out.println("a is the largect no:"+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("b is the greater no:"+b);
		}
		else
		{
			System.out.println("c is the greater no:"+c);
		}
	}

}
