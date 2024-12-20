package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class SplitIterator {

	public static void main(String[] args) {
		List<String>list=Arrays.asList("Dhoni","Sehwag","Dhawan","Kohli");
		Spliterator<String> splitIterator=list.spliterator();
		splitIterator.forEachRemaining(System.out::println);
		
		System.out.println("-------------------------------------");
		Stream<String>stream=list.stream();
		stream.forEach(System.out::println);
		
		System.out.println("----------------------------------------");
		Stream<String>s=list.parallelStream();
		s.forEach(System.out::println);

	}

}
