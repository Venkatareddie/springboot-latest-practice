package in.venkat.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.venkat.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
