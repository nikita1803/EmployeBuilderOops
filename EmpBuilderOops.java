package EmployeBuilderOops;

import java.util.Scanner;

public class EmpBuilderOops 
{
	public String CompanyName;
	public int MaxHours;
	public int WagePerHour;
	public int FullWorkHour;
	public int HalfWorkHour;
	public int TotalWorkDays=0;
	
public EmpBuilderOops()
	{
		this.CompanyName="";
		this.MaxHours= 0;
		this.WagePerHour= 0;
		this.FullWorkHour= 0;
		this.HalfWorkHour= 0;
		this.TotalWorkDays= 0;
	}
public int Attendance(int MaxHours , int TotalWorkDays,int FullWorkHour,int HalfWaorkHour) 
{
		int workDays=0;
		int workHours=0;
		while(workHours <= MaxHours && workDays <= TotalWorkDays)
		{
			workDays++ ;
			
			int attendance = (int) Math.floor(Math.random() * 10) % 3; 
			switch (attendance)
			{
			case 1: 
				workHours=workHours+FullWorkHour;
			break;
			case 2: 
				workHours=workHours+HalfWorkHour;
				break;
			case 3: 
				workHours = workHours+0;
			}
			System.out.println("Total Working hours :");
			System.out.println (workHours);
		}
		
		return workHours;
	
}
public void CalculateWages (int WagePerHour, int workHours) 
{
	int totalSalary = ( WagePerHour * workHours);
	System.out.println("Total Wages of the employee :");
	System.out.println (totalSalary);
}

public static void main(String[] args) {
	EmpBuilderOops emp = new EmpBuilderOops();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the company Name :");
	emp.CompanyName=sc.nextLine();
	sc.nextLine();
	
	System.out.println("Enter the Full Work hour :");
	emp.FullWorkHour=sc.nextInt();
	System.out.println("Enter the half Work hour :");
	emp.HalfWorkHour=sc.nextInt();
	System.out.println("Enter the Maximum working hour :");
	emp.MaxHours=sc.nextInt();
	System.out.println("Enter the Wage per hour :");
	emp.WagePerHour=sc.nextInt();
	System.out.println("Enter the total work days :");
	emp.TotalWorkDays=sc.nextInt();
	
	int totalworkhours=emp.Attendance(emp.MaxHours,emp.TotalWorkDays,emp.FullWorkHour,emp.HalfWorkHour);
	emp.CalculateWages(emp.WagePerHour,totalworkhours);
}
}


