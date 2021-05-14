package EmployeBuilderOops;

public class EmpBuilderOops {
	public static void main(String[] args) {
		
		EmpBuilderOops emp = new EmpBuilderOops();
		emp.Attendence();
		}
	void Attendence()
	{
		double attendance = Math.floor(Math.random() * 10) % 2; 
		if(attendance==1) {
		  System.out.println("Employee is present");
		}
		else {
			System.out.println("Employee is absent");
		}
	}

	
}
