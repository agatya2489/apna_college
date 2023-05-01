package day5_JavaLoops;
//Count Number of Digits in a Number
//
//Input : 423424
//output : 6
public class CountNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=423424;
		int count=0;
		
while(a>0)
		{
			a=a/10;
			count++;
		}
		System.out.println("Number of Digits:"+count);
	}

}
