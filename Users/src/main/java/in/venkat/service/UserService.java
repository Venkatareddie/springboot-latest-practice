package in.venkat.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import in.venkat.entity.User;
import in.venkat.repo.UserRepository;

@Service
public class UserService {

	private UserRepository userRepository;

	public UserService(UserRepository userRepository) {

		this.userRepository = userRepository;
	}
	public void getAllUsersByCountry(String country)
	{
		List<User> all=userRepository.findByCountry(country);
		all.forEach(System.out::println);
	}
	
	public void getAllUsersByCountryAndAge(String country,int age)
	{
		List<User> allUsers=userRepository.findByCountryAndAge(country,age);
		allUsers.forEach(System.out::println);
	}
	
	public void getAllUserAgeGreaterThan(int age)
	{
		List<User>ageList=userRepository.findByAgeGreaterThan(age);
		ageList.forEach(System.out::println);
	}
	public void getUsers()
	{
		List<User>u=userRepository.getUsersSql();
		u.forEach(System.out::println);
	}
	public void getUserDetais()
	{
		List<User>userDetails=userRepository.userDeatisHql();
		userDetails.forEach(System.out::println);
	}
	public void deleteUserByAgeHql(int age)
	{
		userRepository.deleteUserByAgeHql(age);
	}
	// Delete all the users from the database 
	
	public void deleteAllUsers()
	{
		userRepository.deleteAll();
	}
	
	public void userUpdate(int age,String country)
	{
		userRepository.updateCountry(age, country);
	}
	
	public void inserUser(int id, String name, int age, String country)
	{
		userRepository.insertUser(id, name, age, country);
	}
	
	// Save the user into database
	public void saveUser()
	{
		User u=new User();
		u.setId(100);
		u.setName("Venkat");
		u.setAge(28);
		u.setCountry("India");
		userRepository.save(u);
	}
	// Save the multiple users into database
	public void saveUsers()
	{
		User u1=new User();
		u1.setId(101);
		u1.setName("Swathi");
		u1.setAge(23);
		u1.setCountry("Australia");
		userRepository.save(u1);
		
		User u2=new User();
		u2.setId(102);
		u2.setName("Rami Reddy");
		u2.setAge(47);
		u2.setCountry("Japan");
		userRepository.save(u2);
		
		User u3=new User();
		u3.setId(103);
		u3.setName("Sujatha");
		u3.setAge(38);
		u3.setCountry("Uk");
		userRepository.save(u3);
		
		List<User>users=Arrays.asList(u1,u2,u3);
		userRepository.saveAll(users);
	}
	
	// Get the user record, whose id is 101
	public void getUserById(int userId)
	{
		Optional<User> u=userRepository.findById(userId);
		if(u.isPresent())
		{
			System.out.println(u.get());
		}
		else {
			System.out.println("No Record Found");
		}
	}
	
	//Get all the users
	
	public void getAllUsers()
	{
		Iterable<User>u=userRepository.findAll();
		u.forEach(System.out::println);
	}
	
	// No of users presents in the database
	
	public void getAllUsersByIds(Iterable<Integer> usersid)
	{
		Iterable<User>u=userRepository.findAllById(usersid);
		u.forEach(System.out::println);
	}
	public void isUserPresent(Integer userid)
	{
		boolean e=userRepository.existsById(userid);
		System.out.println("User is presented in the database table:" +e);
	}
	// No of Users Present in database
	
	public void noOfUsers()
	{
		long cont=userRepository.count();
		System.out.println("Number of users presents in the table :"+cont);
	}
	
	// Delete User By Id
	
	public void deleteUserById(int userid)
	{
		userRepository.deleteById(userid);
	}
	
	public void deleteAllUsersById(Iterable<Integer> usersids)
	{
		userRepository.deleteAllById(usersids);
	}

}
