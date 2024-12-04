package com.streams;

import java.util.Arrays;
import java.util.List;

public class Streams03 {
	public static void main(String[] args) {
		List<String>names=Arrays.asList("Akash","Aravind","Dhruva","Jani","Abdul");
		names.stream().filter(name->name.startsWith("A")).map(name->name+":"+name.length()).forEach(System.out::println);
		
		
	
	}

}
