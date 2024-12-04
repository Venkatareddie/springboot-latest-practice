package in.venkat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	@GetMapping("/welcome")
	public String welcomeMessage() {
		return "Hello Venkat, Welcome to united states!!";
	}

}
