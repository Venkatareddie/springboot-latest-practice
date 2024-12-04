package com.streams;

import java.util.Arrays;
import java.util.List;

public class Streams02 {
	public static void main(String[] args) {
		List<Integer> num=Arrays.asList(1,2,3,4,5,6);
		
		num.stream().filter(i->i%2==0).forEach(i->System.out.println(i));
	}

}
