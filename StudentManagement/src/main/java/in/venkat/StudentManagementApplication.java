package in.venkat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StudentManagementApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctn=SpringApplication.run(StudentManagementApplication.class, args);
		
	}

}
