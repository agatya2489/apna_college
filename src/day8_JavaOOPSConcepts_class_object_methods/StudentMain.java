package day8_JavaOOPSConcepts_class_object_methods;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Student stu=new Student();
		
		//Approach 1 - using reference variable
//		stu.sid=1;
//		stu.snm="Daniel";
//		stu.grade='A';
//		stu.show();
		
		//Approach 2 - using method
		
//		stu.setData(2, "Martin", 'A');
//		stu.show();
		
		//Approach 3- using constructor
		Student stu=new Student(3, "Marry", 'B');
		stu.show();
		
		
		
	}

}
