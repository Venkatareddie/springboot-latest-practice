package in.venkat;

import java.util.Arrays;
import java.util.List;

public class StreamsExample {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(23, 45, 12, 67, 19);
		list.stream().filter(i->i%2==0).forEach(i->System.out.println(i));

	}

}
