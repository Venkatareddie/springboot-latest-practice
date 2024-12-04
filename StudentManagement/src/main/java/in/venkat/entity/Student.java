package in.venkat.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Student {
	@Id
	private int studentId;
	private String studentName;
	private int  studentAge;

}
