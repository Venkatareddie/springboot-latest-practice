package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream04_flatmap {
	public static void main(String[] args) {
		
		List<String>java=Arrays.asList("core java","Adv java","spring","spring boot");
		List<String>ui=Arrays.asList("html","css","js","angular");
		List<List<String>>courses=Arrays.asList(java,ui);
		Stream<String>m=courses.stream().flatMap(s->s.stream());
		m.forEach(System.out::println);
	}

}
