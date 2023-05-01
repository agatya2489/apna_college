package day14_ExceptionHandling;

import java.util.Scanner;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Program is started...");
		System.out.println("Program is in progress...");
		
		//Example 1
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		int num=sc.nextInt();
		
		String s=null;
		
//		try 
//		{
//			//System.out.println(100 / num); // Arithmetic Exception
//		    System.out.println(s.length());
//		
//		} 
//		catch (ArithmeticException e) 
//		{	
//			//e.printStackTrace();
//			System.out.println(e.getMessage());
//			System.out.println("ArithmeticException thrown-You have enter Invalid input");
//		}
//		catch(NumberFormatException e)
//		{
//			System.out.println("NumberFormatException thrown-You have enter Invalid input");
//		}
//		catch(NullPointerException e)
//		{
//			System.out.println("NullPointerException thorwn-You have enter Invalid input");
//		}
		
		try
		{
			//System.out.println(100 / num);
			System.out.println(s.length());
		}
		catch(Exception e)
		{
			System.out.println("Exception thrown");
		}
		
		
		
		System.out.println("Program is Completed...");
		System.out.println("Program is Exited...");
		
	}

}
