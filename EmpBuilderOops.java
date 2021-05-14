package EmployeBuilderOops;

public class EmpBuilderOops {
	int isFullTime = 2;
	int isPartime = 1;
	int wagePerHours=20;
//	int workHours=0;

	public static void main(String[] args) {
		
		EmpBuilderOops emp = new EmpBuilderOops();
		int ans = emp.Attendence();
		if(ans==1)
		{
			int workHours=8;
			int wadge=emp.Wadges(workHours);
			System.out.println("Full time Wages of the employee is : " +wadge);
		}
		else if(ans==2)
		{
			int workHours=4;
			int wadge=emp.Wadges(workHours);
			System.out.println("Part time Wages of the employee is : " +wadge);
		}
		else {
			System.out.println("Employee is absent");
		}
	}
	int Attendence()
	{
		double attendance = Math.floor(Math.random() * 10) % 3; 
		if(attendance==1) {
		  return 1;
		}
		else if (attendance==2){
			return 2;
		}
		else
		{
			return 0;
		}
	}
	int Wadges(int workHours)
	{	
		int dailyWage = (wagePerHours * workHours);
		return dailyWage;
	}
}

