package day3_JavaOperators;

public class OperatorsDemo {

	public static void main(String[] args) {
		
		//Arithmetic Operators + - * / %
		int a=20, b=10;
		//int result=a+b;
		System.out.println("Arithmetic Operators");
		System.out.println("Sum of a and b is:"+(a+b));
		System.out.println("Difference of a and b is:"+(a-b));
		System.out.println("Multiplication of a and b is:"+(a*b));
		System.out.println("Division of a and b is:"+(a/b));
		System.out.println("Modulo Division of a and b is:"+(a%b));
	    System.out.println();
	    
	    //Relational/ Comparison operator > >= < <= != ==
	    //returns true/false (boolean)
	    System.out.println("Relational/ Comparison operator");
	    System.out.println(a>b);  //true
	    System.out.println(a<b);  //false
	    System.out.println(a>=b); //true
	    System.out.println(a<=b); //false
	    System.out.println(a!=b); //true
	    System.out.println(a==b); //false
	    System.out.println();
	    
	    //Logical operator && || !
	    //works between 2 or more boolean values
	    //returns true/false
	    System.out.println("Logical operator");
	    boolean x=true;
	    boolean y=false;
	    System.out.println(x && y); //false
	    System.out.println(x || y); //true
	    System.out.println(!x);     //false
	    System.out.println(!y);     //true
	    System.out.println();
	    
	    boolean b1=10>20;   //false
	    boolean b2=20>10;   //true
	    System.out.println(b1 && b2);  //false
	    System.out.println(b1 || b2);  //true
	    System.out.println(!x);        //false
	    System.out.println(!y);        //true
	    System.out.println();
	    
	}

}
