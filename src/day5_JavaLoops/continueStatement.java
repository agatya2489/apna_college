package day5_JavaLoops;

public class continueStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=10;i++)
		{
			if(i==3 || i==5)
			{
				continue;
			}
			System.out.println(i);
		}
	}

}
