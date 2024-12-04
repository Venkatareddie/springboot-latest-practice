package in.venkat;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StringFilter {
	public static void main(String[] args) {

		User u1 = new User("Venkat", 26);
		User u2 = new User("Swathi", 22);
		User u3 = new User("Virat", 29);
		User u4 = new User("Jadeja", 15);
		
		Stream<User>stream=Stream.of(u1,u2,u3,u4);
		stream.filter(u->u.age>18 && u.name.startsWith("S")).forEach(u->System.out.println(u));
		
	}
}

class User {
	String name;
	int age;

	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}

}
