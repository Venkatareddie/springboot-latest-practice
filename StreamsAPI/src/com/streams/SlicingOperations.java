package com.streams;

import java.util.Arrays;
import java.util.List;

public class SlicingOperations {
	public static void main(String[] args) {
		List<Integer>num=Arrays.asList(1,2,3,4,5,2,4,6,2,6,7);
		num.stream().limit(5).forEach(System.out::println);
		System.out.println("---------------------------------");
		num.stream().distinct().forEach(System.out::println);
		System.out.println("----------------------------------");
		long cont=num.stream().count();
		System.out.println(cont);
		System.out.println("----------------------------------");
		num.stream().skip(3).forEach(System.out::println);
		
	}

}
