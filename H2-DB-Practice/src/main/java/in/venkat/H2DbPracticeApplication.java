package in.venkat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.venkat.service.ContactService;

@SpringBootApplication
public class H2DbPracticeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(H2DbPracticeApplication.class, args);
		ContactService bean = context.getBean(ContactService.class);
		bean.saveContact();
	}

}
