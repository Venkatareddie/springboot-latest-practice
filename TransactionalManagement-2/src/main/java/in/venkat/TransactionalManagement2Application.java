package in.venkat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.venkat.service.SaveToDBService;

@SpringBootApplication
public class TransactionalManagement2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(TransactionalManagement2Application.class, args);
		SaveToDBService bean = run.getBean(SaveToDBService.class);
		bean.SaveDataToDB();
	}

}
