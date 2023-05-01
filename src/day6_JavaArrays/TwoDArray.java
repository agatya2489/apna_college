package day6_JavaArrays;
//1)Declare an array
//2)insert values into an array
//3)find size of an array
//4)read single value from an array
//5)read multiple values from an array

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaration
		
		//approach 1
//		int a[][]=new int[3][2];
//		
//		a[0][0]=100;
//		a[1][1]=200;
//		
//		a[1][0]=300;
//		a[1][1]=400;
//		
//		a[2][0]=500;
//		a[2][1]=600;
		
		//approach 2
		int a[][]= {{100,200},{300,400},{500,600}};
		
		//length of array
		//System.out.println(a.length);
		//System.out.println(a[0].length);
		
		//read specific value from an array
		//System.out.println(a[2][0]);
		
		//reading data from array using classic for loop
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//reading data from 2d array using for each loop
		
		for (int x[] : a) {
			for(int v : x)
			{
				System.out.print(v+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
