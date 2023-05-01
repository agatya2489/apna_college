package day5_JavaLoops;
//Reverse a number (  %   / =   operators   )
//
//input 1234
//output 4321
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=1234;
		int digit;
		
		while(a>0)
		{
			digit=a%10;
			System.out.print(digit);
			a=a/10;
		}
	}

}
