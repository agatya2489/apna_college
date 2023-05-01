package day12_InterfaceInJava_FinalKeyword;

class Test
{
	final int x=100; //Constant value-- we cannot change
}

public class FinalKeywordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t=new Test();
		
		//t.x=200;  //incorrect bcoz x is final variable
		
		System.out.println(t.x);
	}

}
