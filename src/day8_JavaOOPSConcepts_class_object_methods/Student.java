package day8_JavaOOPSConcepts_class_object_methods;

public class Student {

	int sid;
	String snm;
	char grade;
	
	void show()
	{
		System.out.println(sid+" "+snm+" "+grade);
	}
	
	void setData(int id, String name, char g)
	{
		sid=id;
		snm=name;
		grade=g;
	}

	public Student(int id, String name, char g) {
		super();
		sid=id;
		snm=name;
		grade=g;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
