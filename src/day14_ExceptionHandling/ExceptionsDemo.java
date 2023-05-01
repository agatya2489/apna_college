package day14_ExceptionHandling;

import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Program is started...");
		System.out.println("Program is in progress...");
		
		//Example 1
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Enter a Number: ");
//		int num=sc.nextInt();
//		
//		System.out.println(100/num); //Arithmetic Exception
//		
//		System.out.println("Program is Completed...");
//		System.out.println("Program is Exited...");
		
		
		//Example 2
//		int a[] = new int[5]; //0....4
//		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a number: ");
//		int num=sc.nextInt();
//		
//		System.out.println("Enter position(0-4): ");
//		int pos=sc.nextInt();
//		
//		a[pos]=num; //ArrayIndexOutOfBoundsException
//		
//		System.out.println(a[pos]);
//		
//		System.out.println("Program is Completed...");
//		System.out.println("Program is Exited...");
		
		
		//Example 3
		String s="Welcome";
		
		//Wrapper class
		int num=Integer.parseInt(s); //NumberFormatException
		
		System.out.println(num);
	
		System.out.println("Program is Completed...");
		System.out.println("Program is Exited...");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
