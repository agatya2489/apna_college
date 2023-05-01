package day4_JavaConditionalStatements;

//a>b and a>c a is largest number
//b>a and a>c b is largest number
//c>a and a>b c is largest number

public class LargestOf3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=83;
		int b=93;
		int c=63;
		
		if(a>b && a>c)
		{
			System.out.println("a is largest number:"+a);
		}else if(b>a && b>c)
		{
			System.out.println("b is largest number:"+b);
		}
		else
		{
			System.out.println("c is largest number:"+c);
		}
	}

}
