package day8_JavaOOPSConcepts_class_object_methods;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1=new Employee();
		emp1.EId=101;
		emp1.EmpNm="John";
		emp1.JobNm="Software Engineer";
		emp1.ESal=70000;
		
		emp1.display();
		
		System.out.println();
		
		Employee emp2=new Employee();
		emp2.EId=102;
		emp2.EmpNm="Smith";
		emp2.JobNm="Manager";
		emp2.ESal=100000;
		
		emp2.display();
	}
}
