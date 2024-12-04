package in.venkat;

import java.util.Arrays;
import java.util.List;

public class EmployeeStream {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(120000, 30000, 400000, 650000, 2000);
		list.stream().filter(i -> i > 100000).forEach(i -> System.out.println(i));
	}

}
