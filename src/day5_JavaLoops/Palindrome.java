package day5_JavaLoops;
//Palindrome number
//input 121
//after reversing 121
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r;
		int sum=0;
		int temp;
		int n=121;
		temp=n;
		
		while(n>0)
		{
			r=n%10;
			
			sum=(sum*10)+r;
			
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println("not an Palindrome Number");
		}
	}

}
