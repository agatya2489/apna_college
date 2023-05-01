package day14_ExceptionHandling;

import java.util.Scanner;

public class HandleExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Program is started...");
		System.out.println("Program is in progress...");
		
		//Example 1
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		int num=sc.nextInt();
		
		try 
		{
			System.out.println(100 / num); // Arithmetic Exception
		} 
		catch (Exception e) 
		{	
			//e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("You have enter Invalid input");
		}
		
		System.out.println("Program is Completed...");
		System.out.println("Program is Exited...");
		
		
		
		
	}

}
