package in.venkat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.venkat.entity.Employee;
import in.venkat.repo.EmployeeRepository;

@SpringBootApplication
public class EmployeeJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cxt=SpringApplication.run(EmployeeJpaApplication.class, args);
		EmployeeRepository employeeRepository=cxt.getBean(EmployeeRepository.class);
		
//		Employee e=new Employee();
//		e.setEmpId(101);;
//		e.setEmpName("Venkat");
//		e.setEmpSal(20000);
//		
//		employeeRepository.save(e);
		System.out.println(employeeRepository.findAll());
		employeeRepository.deleteById(101);
		
	}

}
