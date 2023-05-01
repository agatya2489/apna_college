package day3_JavaOperators;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=23;
		int b=43;
		
		System.out.println("Before Swapping:");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println();
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swapping:");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
	}

}
