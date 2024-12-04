package in.venkat.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.venkat.utils.SecurityUtils;

@Configuration
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig::Constructor");
	}
	@Bean
	public SecurityUtils utils()
	{
		return new SecurityUtils();
		
	}
	

}
