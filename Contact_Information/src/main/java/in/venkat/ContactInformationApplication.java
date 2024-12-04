package in.venkat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.venkat.service.ContactService;

@SpringBootApplication
public class ContactInformationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctn=SpringApplication.run(ContactInformationApplication.class, args);
		ContactService bean = ctn.getBean(ContactService.class);
		bean.saveContact();
	}

}
