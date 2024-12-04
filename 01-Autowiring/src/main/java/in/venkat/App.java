package in.venkat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		ApplicationContext ct = new ClassPathXmlApplicationContext("beans.xml");
		ATM atm=ct.getBean(ATM.class);
		atm.withdraw();
	}

}
