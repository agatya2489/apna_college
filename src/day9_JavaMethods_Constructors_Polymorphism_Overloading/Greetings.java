package day9_JavaMethods_Constructors_Polymorphism_Overloading;

public class Greetings {

	//no params - no return value
	void greeting1()
	{
		System.out.println("Hello...");
	}
	
	//no params - Returns value
	String greetings2()
	{
		return "Hello... How are you?";
	}

	//takes params - no return value
	void greeting3(String name)
	{
		System.out.println("Hello..."+name);
	}
	
	
	//takes params - returns value
	String greeting4(String name)
	{
		return ("Hello.."+name);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
