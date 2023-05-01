package Practice;
//Write a Java program count the number of digits of the number

public class CountOfNumberDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=123;
		int count=0;
		
		while(a>0) {
			
			a=a/10;
			count++;
		}
		System.out.println("Count of the number:"+count);
	}

}
