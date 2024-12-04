package in.venkat.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.venkat.entity.Student;
import in.venkat.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Save student details
    @PostMapping("/saveStudentDetails")
    public ResponseEntity<String> saveStudentDetails(@RequestBody Student student) {
        studentService.saveData(student);
        return ResponseEntity.ok("Inserted Successfully");
    }

    // Get student by ID
    @GetMapping("/getStudent/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable int id) {
        Optional<Student> studentOptional = studentService.studentDataById(id);

        if (studentOptional.isPresent()) {
            return ResponseEntity.ok(studentOptional.get());
        } else {
            return ResponseEntity.status(404).body(null);  // 404 Not Found if student is not found
        }
    }
}
