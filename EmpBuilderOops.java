package EmployeBuilderOops;

public class EmpBuilderOops {
	int workHours=8;
	int wagePerHours=20;

	public static void main(String[] args) {
		
		EmpBuilderOops emp = new EmpBuilderOops();
		int ans = emp.Attendence();
		if(ans==1)
		{
			int wadge=emp.Wadges();
			System.out.println("Daily Wages of the employee is : " +wadge);
		}
		else
		{
			System.out.println("Employee is absent");
		}
		}
	int Attendence()
	{
		double attendance = Math.floor(Math.random() * 10) % 2; 
		if(attendance==1) {
		  return 1;
		}
		else {
			return 0;
		}
	}
	int Wadges()
	{	
		int dailyWage = (wagePerHours * workHours);
		return dailyWage;
	}
}
