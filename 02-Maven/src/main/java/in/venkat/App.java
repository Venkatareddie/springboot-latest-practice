package in.venkat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctn=new ClassPathXmlApplicationContext("Bean.xml");
		Car car=ctn.getBean(Car.class);
		car.drive();

	}

}
