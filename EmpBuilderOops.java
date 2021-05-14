package EmployeBuilderOops;


public class EmpBuilderOops 
{
	
	int isFullTime = 2;
	int isPartime = 1;
	int wagePerHours=20;
	int numWorkDays=20;

	public static void main(String[] args) 
	{
		
		EmpBuilderOops emp = new EmpBuilderOops();
		int ans = emp.Attendence();
		int workHours= 0;
		int wage= 0;
		switch(ans){
		case 1:
			 workHours=8;
			 wage=emp.Wages(workHours);
			System.out.println("Full time Wages of the employee is : " +wage);
			
		break;
		case 2:
			 workHours=4;
			 wage= emp.Wages(workHours);
			System.out.println("Part time Wages of the employee is : " +wage);
		break;
		default :
			System.out.println("Employee is absent");
		}
	}
	int Attendence()
	{
		for( int day=1; day<=numWorkDays; day++)
		{
			double attendance = Math.floor(Math.random() * 10) % 3; 
			if(attendance==1) {
			 return 1;
			}
			else if (attendance==2){
			return 2;
			}
			else{
			return 0;
			}
		}
		return 0;
	}
	int Wages(int workHours)
	{	
		int dailyWage = (wagePerHours * workHours);
		int totalSalary = (dailyWage * numWorkDays);
		System.out.println("Total salary of the employee is : " +totalSalary);
		return dailyWage;
		
	}
}