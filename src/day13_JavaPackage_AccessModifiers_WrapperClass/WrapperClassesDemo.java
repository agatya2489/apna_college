package day13_JavaPackage_AccessModifiers_WrapperClass;

public class WrapperClassesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int a=100;  //a is a primitive type variable
//		System.out.println(a);
		
//		Integer a=100; //a is a object type variable
//		System.out.println(a);
		
		//Primitive Variables
		byte b = 10;
		short s = 20;
		int i = 30;
		long l = 40;
		float f = 50f;
		double d = 60.00;
		char c = 'a';
		boolean b1 = true;
		
		//converting primitives into object : Autoboxing
		
		Byte byteobj = b;
		Short shortobj = s;
		Integer integerobj = i;
		Long long1obj = l;
		Float floatobj = f;
		Double doubleobj = d;
		Character charobj = c;
		Boolean boolean1obj = b1;
		
		System.out.println("Byte Object: "+ byteobj);
		System.out.println("Short Object: "+ shortobj);
		System.out.println("Integer Object: "+ integerobj);
		System.out.println("Long Object: "+ long1obj);
		System.out.println("Float Object: "+ floatobj);
		System.out.println("Double Object: "+ doubleobj);
		System.out.println("Character Object: "+ charobj);
		System.out.println("Boolean Object: "+ boolean1obj);
		
		//converting objects into primitives : unboxing
		
		byte bytevalue = byteobj;
		short shortvalue = shortobj;
		int intvalue = integerobj;
		long longvalue = long1obj;
		float floatvalue = floatobj;
		double doublevalue = doubleobj;
		char charvalue = charobj;
		boolean booleanvalue = boolean1obj;
		
		System.out.println("byte value: "+ bytevalue);
		System.out.println("short value: "+ shortvalue);
		System.out.println("int value: "+ intvalue);
		System.out.println("long value: "+ longvalue);
		System.out.println("float value: "+ floatvalue);
		System.out.println("double value: "+ doublevalue);
		System.out.println("char value: "+ charvalue);
		System.out.println("boolean value: "+ booleanvalue);
	}

}
