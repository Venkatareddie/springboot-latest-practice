package in.venkat.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Employee {
	@Id
	private int empId;
	private String empName;
	private double empSal;
	

}
