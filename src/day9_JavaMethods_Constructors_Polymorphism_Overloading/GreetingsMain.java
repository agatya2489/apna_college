package day9_JavaMethods_Constructors_Polymorphism_Overloading;

public class GreetingsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Greetings gr = new Greetings();

		gr.greeting1(); // no params no return value

//		String str = gr.greetings2(); // no params - Returns value
//		System.out.println(str);
		System.out.println(gr.greetings2());
		
		gr.greeting3("Agatya"); ////takes params - no return value
		
//		System.out.println(gr.greeting4("John")); //takes params - returns value
		String str=gr.greeting4("John");
		System.out.println(str);
		
		
		
		
	}

}
