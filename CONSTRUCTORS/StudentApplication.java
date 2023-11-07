package com.CONSTRUCTORS;

import java.util.Scanner;

public class StudentApplication {

	public static void main(String[] args) 
	{
		Employee e=new Employee();
		System.out.println(e);
		Employee e1=new Employee("sai","205","hyd","accenture","a",50000);
		System.out.println(e1);
	}
}
class Employee
{
	String emp_name,id,department,location,company;
	int salary;
	Scanner sc=new Scanner(System.in);
	Employee()
	{
		System.out.println("Enter Employee Details");
		emp_name=sc.next();
		id=sc.next();
		department=sc.next();
		salary=sc.nextInt();
		location=sc.next();
		company=sc.next();
	}
	Employee(String name,String id,String location,String company,String department,int salary)
	{
		this.emp_name=name;
		this.id=id;
		this.company=company;
		this.department=department;
		this.location=location;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "Employee [emp_name=" + emp_name + ", id=" + id + ", department=" + department + ", location=" + location
				+ ", company=" + company + ", salary=" + salary + "]";
	}
	
}