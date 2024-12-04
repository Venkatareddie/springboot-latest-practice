package in.venkat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	public static void main(String[] args) {
		ApplicationContext ctn=new ClassPathXmlApplicationContext("beans.xml");
		UserService userService=ctn.getBean(UserService.class);
		userService.registraction();
	}

}
