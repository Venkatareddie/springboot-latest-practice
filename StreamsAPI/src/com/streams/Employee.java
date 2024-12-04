package com.streams;

import java.util.Arrays;
import java.util.List;

public class Employee {
	public int empId;
	public String empName;
	public int empSal;
	
	public Employee(int empId, String empName, int empSal) {
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		
		
	}
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}


	public static void main(String[] args) {
		Employee e1=new Employee(1, "Venkat", 2000);
		Employee e2=new Employee(2, "Swathi", 4000);
		Employee e3=new Employee(3, "Ram", 6000);
		Employee e4=new Employee(4, "Sujatha", 5000);
		
		List<Employee> employee=Arrays.asList(e1,e2,e3,e4);
		
		employee.stream().filter(emp->emp.empSal >5000).forEach(e->System.out.println( e.empId+"-"+e.empName));
		
	}
	

}
