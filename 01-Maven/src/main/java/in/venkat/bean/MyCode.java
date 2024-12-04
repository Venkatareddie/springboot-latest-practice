package in.venkat.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyCode {
	public static void main(String[] args) {
		ApplicationContext ctn=new ClassPathXmlApplicationContext("Beans.xml");
		UserService usr=ctn.getBean(UserService.class);
		usr.saveData("Venkat", "Venkat@123");
	}

}
