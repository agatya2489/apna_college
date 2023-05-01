package day4_JavaConditionalStatements;

public class SmallestOf3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=16, b=34, c=67;
		
		if(a<b && a<c)
		{
			System.out.println("a is smallest number:"+a);
		}
		else if(b<a && b<c)
		{
			System.out.println("b is smallest number:"+b);
		}
		else
		{
			System.out.println("c is smallest number:"+c);
		}
	}

}
