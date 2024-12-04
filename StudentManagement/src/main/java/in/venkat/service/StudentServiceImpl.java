package in.venkat.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.venkat.entity.Student;
import in.venkat.repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
    
    @Autowired
    private StudentRepository studentRepository;

    // Save student data
    @Override
    public void saveData(Student student) {
        studentRepository.save(student);
    }

    // Fetch student data by ID
    @Override
    public Optional<Student>  studentDataById(int studentId) {
        return studentRepository.findById(studentId);  // Returns an Optional<Student>
    }
}
