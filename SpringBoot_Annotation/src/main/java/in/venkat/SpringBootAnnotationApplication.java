package in.venkat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"in.ram", "in.venkat"})
public class SpringBootAnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAnnotationApplication.class, args);
	}

}
