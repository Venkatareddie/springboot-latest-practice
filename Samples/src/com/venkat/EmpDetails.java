package com.venkat;

import java.util.Arrays;
import java.util.List;

public class EmpDetails {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Venkat", "IT", 20000);
		Employee e2 = new Employee(2, "Swathi", "Mechanic", 40000);
		Employee e3 = new Employee(3, "Ram", "IT", 50000);
		Employee e4 = new Employee(4, "Sujatha", "Support", 60000);

		List<Employee> l = Arrays.asList(e1, e2, e3, e4);
		l.stream().filter(e -> e.empdept.equals("IT") && e.empsal > 15000).forEach(System.out::println);

	}
}

class Employee {
	int empid;
	String empname;
	String empdept;
	int empsal;

	public Employee(int empid, String empname, String empdept, int empsal) {
		this.empid = empid;
		this.empname = empname;
		this.empdept = empdept;
		this.empsal = empsal;

	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empdept=" + empdept + ", empsal=" + empsal
				+ "]";
	}

}
