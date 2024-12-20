package in.venkat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.venkat.service.SaveToDBService;

@SpringBootApplication
public class TransactionalManagement01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(TransactionalManagement01Application.class, args);
		SaveToDBService bean = context.getBean(SaveToDBService.class);
		bean.SaveDataToDB();
		
	}

}
