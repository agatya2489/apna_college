package day6_JavaArrays;

import java.util.Arrays;

//1)Declare an array
//2)insert values into an array
//3)find size of an array
//4)read single value from an array
//5)read multiple values from an array

public class SingleDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaration
		//approach 1
		
//		int a[]=new int [5]; //declaration
//		
//		a[0]=100;
//		a[1]=200;
//		a[2]=300;
//		a[3]=400;
//		a[4]=500;
//		
		//approach 2
		int a[]= {100,200,300,400,500};
		
		//size of an array
		System.out.println(a.length);
		
		//get a single value from array
		System.out.println(a[3]);
		
		//get all values from array
		System.out.println(Arrays.toString(a));
		
		//get all the values by using loops
//		for(int i=0; i<a.length; i++)
//		{
//			System.out.println(a[i]);
//		}
//		
		//read data from array using for each loop
		for (int i : a) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
