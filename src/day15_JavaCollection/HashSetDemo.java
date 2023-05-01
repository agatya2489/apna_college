package day15_JavaCollection;

import java.util.HashSet;
import java.util.Set;

//1) Heterogenios data ---> allowed
//2) Insertion order  --> Not preserved (Index not supported)
//3) Duplicate elements --> Not Allowed
//4) Multiple nulls Not allowed/ only single null is allowed

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaration
		HashSet myset=new HashSet();
		//Set myset=new HashSet();
		//HashSet<String> myset=new HashSet<String>(); //only allow String
		
		myset.add(100);
		myset.add(10.15);
		myset.add("Welcome");
		myset.add('A');
		myset.add(null);
		myset.add(100);
		myset.add(null);
		
		System.out.println(myset);//[null, A, 100, 10.15, Welcome] insertion order is not preserved
		
		//size of hashset
		System.out.println(myset.size()); //5

		//remove value from hashset
		myset.remove(10.15);//we have to pass value but not index - index wont support here
		System.out.println(myset);//[null, A, 100, Welcome]
		
		
		//insertion is not possible in hashset
		
		//get specific value from hashset is not possible

		//get all the data from hashset
		for (Object x : myset) {
			System.out.println(x);
		}
		
		
		
		
		
	}

}
