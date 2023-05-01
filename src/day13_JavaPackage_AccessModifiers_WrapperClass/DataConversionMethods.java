package day13_JavaPackage_AccessModifiers_WrapperClass;

public class DataConversionMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String---int
		//String s="Welcome.."; //not possible to convert number
//		String s1="10";
//		String s2="20";
//		
//		System.out.println(s1+s2);
//		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		
		//String----double
//		String s1="150.15";
//		String s2="130.25";
//		
//		System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));

		//String---boolean
//		String s="true";
//		
//		System.out.println(Boolean.parseBoolean(s));
		
		
		//int,double,char,boolean---String
		
		int a=10;
		double d=15.15;
		char c='A';
		boolean b=false;
		
		System.out.println(String.valueOf(a));
		System.out.println(String.valueOf(d));
		System.out.println(String.valueOf(c));
		System.out.println(String.valueOf(b));
		
		
	}

}
