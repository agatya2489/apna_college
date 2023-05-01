package day3_JavaOperators;

public class IncrementOperator {

	public static void main(String[] args) {
		
		// ++ is called increment operator ---> pre, post
		
		int a=10;
		
		//Scenario 1- there is no difference
//		a++;           //Post Increment
//		++a;           //Pre Increment
//		System.out.println(a);  
		
		//Scenario 2
		//int result=a++; //10
		int result=++a;   //11
		System.out.println(result);  
		System.out.println(a);
	}

}
