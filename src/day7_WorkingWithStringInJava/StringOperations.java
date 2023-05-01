package day7_WorkingWithStringInJava;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Welcome";
		
		//String st=new String("Welcome");
		
		System.out.println(s);
		//System.out.println(st);
		
		//length() - length of a string
		System.out.println(s.length());
		
		//concat() - joining strings
		String s1="Welcome";
		String s2=" to Java";
		String s3="Automation";
		
		System.out.println(s1 + s2);
		System.out.println(s1.concat(s2));
		
		System.out.println(s1+s2+s3);
		System.out.println(s1.concat(s2).concat(s3));
		
		//trim() - remove right and left side spaces
		s="    automation     ";
		
		System.out.println(s.trim());
		
		System.out.println(s.length());
		System.out.println(s.trim().length());
		
		//charAt() - returns a single character based on index we passed
		//index count is starts from 0
		s="Welcome";
		
		System.out.println(s.charAt(0)); //w
		System.out.println(s.charAt(3)); //c
		
		
		//contains() - returns boolean value true/false
		
		System.out.println(s.contains("Wel")); //true
		System.out.println(s.contains("com")); //true
		System.out.println(s.contains("wel")); //false
		
		
		//equals(), equalsIgnoreCase() - compare two strings
		s1="WELCOME";
		s2="welcome";
		
		System.out.println(s1.equals(s2)); //false
		System.out.println(s1.equalsIgnoreCase(s2)); //true
		
		
		//replace() - replace single or multiple characters in a string
		s="Welcome to Selenium Automation testing training";
		
		System.out.println(s.replace('e', 'x')); //Wxlcomx to Sxlxnium Automation txsting training
		System.out.println(s.replace("Selenium", "Java")); //Welcome to Java Automation testing training
		
		
		//subString() - to extract subString to main String
		s="Welcome";
		
		System.out.println(s.substring(2, 5)); //lco
		System.out.println(s.substring(0, 6)); //Welcom
		
		
		//split() - divide the string into multiple parts using delimiter
		//should not use * $ ^ . + - ? as a delimiter
		s="abc@gmail.com";
		String a[]=s.split("@");
		
		System.out.println(a[0]); //abc
		System.out.println(a[1]); //gmail.com
		
		
		//toUpperCase(), toLowerCase 
		s="WeLComE";
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
	
	}

}
