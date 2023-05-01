package day4_JavaConditionalStatements;

public class Nestedif_elseCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(true) 
		{
			if(false)
			{
				System.out.println("123");
			}
			else
			{
				System.out.println("abc");
			}
		}
		else if(true)
		{
			if(true)
			{
				System.out.println("xyz");
			}
		}
	}

}
