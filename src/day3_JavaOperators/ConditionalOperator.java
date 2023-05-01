package day3_JavaOperators;

public class ConditionalOperator {
	
	public static void main(String args[])
	{
		//Conditional/Ternary Operator  ? :
		//Syntax
		//var= exp ? result1 : result2;
		
		//Example 1
		int a=200, b=100;
		
		int x=a>b ? a : b;
		int y=a<b ? a : b;
		
		System.out.println(x);
		System.out.println(y);
	
		//Example 2
		a=1000;
		b=2000;
		
		x=a<b ? a : b;
		
		System.out.println(x);
		
		//Example 3
		x=(1==1)?100:200;
		
		System.out.println(x);
		
		//Example 4
		int age=15;
		
		String res=age>=18 ? "Eligible for Vote" : "Not Eligible for Vote";
		
		System.out.println(res);
		
		
		
		
	}
}
