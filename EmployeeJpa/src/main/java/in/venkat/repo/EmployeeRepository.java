package in.venkat.repo;

import org.springframework.data.repository.CrudRepository;

import in.venkat.entity.Employee;

public interface EmployeeRepository extends CrudRepository <Employee,Integer>{

}
