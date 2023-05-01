package Practice;
//Write a program in Java to display the multiplication table of 5. 
//▪ Expected Output :
//▪ 5 X 0 = 0
//▪ 5 X 1 = 5
//▪ 5 X 2 = 10 
//▪ ----------
//▪ ----------
//▪ 5 X 10 = 5

public class tableOf5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=5;
		
		for(int i=0; i<=10; i++)
		{
			System.out.println(a+ " X "+i+" = "+(a*i));
		}
	}

}
