package in.venkat;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itextpdf.text.DocumentException;

public class App {
	public static void main(String[] args) throws IOException, DocumentException {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
		BookService bService=applicationContext.getBean(BookService.class);
		//bService.storeBook();
		bService.getData();
	}

}
