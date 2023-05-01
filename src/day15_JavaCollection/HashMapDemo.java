package day15_JavaCollection;

import java.util.HashMap;
import java.util.Map;

//Data can be stored in the form of key, value pairs.
//Key is unique. But we can have duplicate values.
//Insertion order not preserved(Index not followed)

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declarartion
		//HashMap hm=new HashMap();
		//Map hm=new HashMap();
		
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		
		//adding data pairs to hashmap
		hm.put(101, "John");
		hm.put(102, "Scott");
		hm.put(103, "David");
		hm.put(104, "John");
		hm.put(101, "Mary");
		
		System.out.println(hm); //{101=Mary, 102=Scott, 103=David, 104=John}

		//size of hashmap
		System.out.println(hm.size()); //4
		
		//remove pair
		hm.remove(103);
		System.out.println("After removing pair:"+hm);//{101=Mary, 102=Scott, 104=John}
		
		//get specific value from hashmap
		
		System.out.println(hm.get(102));//Scott //here 102 is key
		
		//print only keys from hashmap
		System.out.println(hm.keySet());//[101, 102, 104]
		
		//print values from hashmap
		for (Object k:hm.keySet()) {
			System.out.println(k +" "+ hm.get(k));
		}
		
		//clear data from hashmap
		hm.clear();
		System.out.println(hm); //{}
	
	}

}
