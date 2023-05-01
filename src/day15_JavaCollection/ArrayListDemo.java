package day15_JavaCollection;

import java.util.ArrayList;
import java.util.List;

//1) Heterogenious data - allowed
//2) Insertion order- preserved(Index)
//3) Duplicate elements -- allowed
//4) multiple nulls -- allowed

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaration
		ArrayList mylist=new ArrayList();
		
		//ArrayList<Integer> mylist=new ArrayList<Integer>(); //only Integers Stores
		//List mylist=new ArrayList<>();
		
		//adding data elements into arraylist
		mylist.add(100);
		mylist.add(100.5);
		mylist.add("Welcome");
		mylist.add(true);
		mylist.add('A');
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		
		System.out.println(mylist); //[100, 100.5, Welcome, true, A, 100, null, null]
		
		//Size of arraylist
		System.out.println(mylist.size()); //8
		
		//remove value from arraylist
		mylist.remove(3);
		System.out.println("After removing elements: "+mylist); //[100, 100.5, Welcome, A, 100, null, null]
		
		//inserting the element in the middle of the list
		mylist.add(2,"Java"); //2 is the index position
		System.out.println("After inserting elements:"+mylist); //[100, 100.5, Java, Welcome, A, 100, null, null]
		
		//read specific data
		System.out.println(mylist.get(3)); //Welcome
		
		//read all the data from arraylist
		for(Object x:mylist)
		{
			System.out.println(x);
		}
		
		//CLearing all the data from arraylist
		mylist.clear();
		System.out.println("After Clearing: "+mylist);
		
	}

}
