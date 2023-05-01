package day7_WorkingWithStringInJava;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// case 1
//		String s1="Welcome";
//		String s2="Welcome";
//		
//		System.out.println(s1==s2); //true
//		System.out.println(s1.equals(s2)); //ture
//		System.out.println(s1.equalsIgnoreCase(s2)); //true

		// case 2
//		String s1 = new String("welcome");
//		String s2 = new String("welcome");
//
//		System.out.println(s1 == s2); // false //compares object
//		System.out.println(s1.equals(s2)); // true //compares value of object

		
		//case 3
		String s1="abc";
		String s2=new String("abc");
		String s3=s2;
		
		System.out.println(s1); //true
		System.out.println(s2); //true
		System.out.println(s3); //true
		
		System.out.println(s1==s2); //false
		System.out.println(s1.equals(s2)); //true
		System.out.println(s2.equals(s3)); //true
		System.out.println(s2==s3); //true
		
		
		//case 4
		s1="abc";
		s2=new String("abc");
		s3=s2;
		
		System.out.println(s1==s3); //false
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
