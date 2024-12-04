package in.venkat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext ct=new ClassPathXmlApplicationContext("beans.xml");
		Car car=ct.getBean(Car.class);
		car.drive();

	}

}
