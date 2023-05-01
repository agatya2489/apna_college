package day4_JavaConditionalStatements;

public class CheckPositiveNegativeZero {

	public static void main(String args[])
	{
		int num=10;
		
		if(num>0)
		{
			System.out.println("Positive Number");
		}
		else if(num<0)
		{
			System.out.println("Negeavtive Number");
		}
		else
		{
			System.out.println("Number is Zero");
		}
	}
}
