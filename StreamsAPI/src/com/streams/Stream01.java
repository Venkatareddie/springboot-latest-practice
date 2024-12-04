package com.streams;

import java.util.Arrays;
import java.util.List;

public class Stream01 {

	public static void main(String[] args) {
		List<String> nameList=Arrays.asList("india","usa","uk","jpan");
		
		nameList.stream().map(names->names.toUpperCase()).forEach(names->System.out.println(names));
		

	}

}
