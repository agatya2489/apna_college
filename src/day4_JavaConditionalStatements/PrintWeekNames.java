package day4_JavaConditionalStatements;

public class PrintWeekNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int weekno=5;
		
		if(weekno==1)
		{
			System.out.println("Sunday");
		}
		else if(weekno==2)
		{
			System.out.println("Monday");
		}
		else if(weekno==3)
		{
			System.out.println("Tuesday");
		}
		else if(weekno==4)
		{
			System.out.println("Wednesday");
		}
		else if(weekno==5)
		{
			System.out.println("Thursday");
		}
		else if(weekno==6)
		{
			System.out.println("Friday");
		}
		else if(weekno==7)
		{
			System.out.println("Saturday");
		}
		else
		{
			System.out.println("Invalid week no.");
		}
	}

}
