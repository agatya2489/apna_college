package day14_ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		

		System.out.println("Program is started...");
		System.out.println("Program is in progress...");

		String s=null;
		
		try
		{
			System.out.println(s.length());
		}
		catch(Exception e)
		{
			System.out.println("Exception occured and also handled");
		}
		finally
		{
			System.out.println("Enterd to finally block...");
		}
		
		
		System.out.println("Program is Completed...");
		System.out.println("Program is Exited...");
		
		
	}

}
