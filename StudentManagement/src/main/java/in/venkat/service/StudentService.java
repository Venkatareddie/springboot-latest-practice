package in.venkat.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import in.venkat.entity.Student;
@Service
public interface StudentService {
	
	public void saveData(Student student);
	public Optional<Student> studentDataById(int studentId);

}
