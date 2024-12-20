package in.venkat;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.venkat.entity.User;
import in.venkat.service.UserService;

@SpringBootApplication
public class UserApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctn = SpringApplication.run(UserApplication.class, args);
		UserService userService = ctn.getBean(UserService.class);

		// userService.deleteAllUsers();
		// userService.saveUser();
		// userService.saveUsers();
		// userService.getUserById(101);
		// userService.getAllUsers();
		// List<Integer> list=Arrays.asList(100,102,103);
		// userService.getAllUsersByIds(list);
		// userService.isUserPresent(109);
		// userService.noOfUsers();
		// userService.deleteUserById(103);

//		List<Integer>ll=Arrays.asList(101,102);
//		userService.deleteAllUsersById(ll);

//		userService.getAllUsersByCountry("Japan");
//		userService.getAllUsersByCountryAndAge("Uk", 38);
		// userService.getAllUserAgeGreaterThan(25);
		//userService.getUsers();
		//userService.getUserDetais();
		//userService.deleteUserByAgeHql(23);
		//userService.userUpdate(38, "Korea");
		userService.inserUser(109, "Prem",  37, "Iran");
	}

}
