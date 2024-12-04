package in.venkat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctn=new ClassPathXmlApplicationContext("beans.xml");
		Motor motor=ctn.getBean(Motor.class);
		motor.move();
		
		ConfigurableApplicationContext cfApplicationContext=(ConfigurableApplicationContext)ctn;
		cfApplicationContext.close();
	}

}
