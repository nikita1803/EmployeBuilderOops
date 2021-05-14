package EmployeBuilderOops;


public class EmpBuilderOops 
{
	
	int isFullTime = 2;
	int isPartime = 1;
	int wagePerHours=20;
	int numWorkDays=20;
	int totalEmpHours=0;
	int workHours=0;


	public static void main(String[] args) 
	{
		
		EmpBuilderOops emp = new EmpBuilderOops();
		int ans = emp.Attendence();
		int workHours= 0;
		int wage= 0;
	
		emp.Wages(ans);
		
	}
	int Attendence()
	{
		int hrsInMonth=100;
		int workDays=0;
		int totalEmpHours=0;
		

		while(workHours <= hrsInMonth && workDays <= numWorkDays)
		{
			workDays++ ;
			
			int attendance = (int) Math.floor(Math.random() * 10) % 3; 
			switch (attendance){
			case 1: 
				workHours=workHours+8;
			break;
			case 2: 
				workHours=workHours+4;
				break;
			case 3: 
				workHours = workHours+0;
			}
			//totalEmpHours = (workHours + totalEmpHours);
			System.out.println("Total Working hours :");
			System.out.println (workHours);
		}
		return workHours;

	}
	void Wages(int workHours)
	{
		
		int totalSalary = ( wagePerHours * workHours);
		System.out.println("Total Wages for a working hours and days :");
		System.out.println (totalSalary);
	}
}