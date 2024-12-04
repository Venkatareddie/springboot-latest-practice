package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MatchStreams {
	public static void main(String[] args) {
		
		Person p1 = new Person("Venkat", "India");
		Person p2 = new Person("Steve", "USA");
		Person p3 = new Person("Ching", "Chaina");
		Person p4 = new Person("Abdul", "Bangladesh");
		Person p5 = new Person("Kiran", "India");
		
		List<Person>pp=Arrays.asList(p1,p2,p3,p4,p5);
		boolean status1=pp.stream().anyMatch(persons->persons.pcountry.equals("India"));
		System.out.println("Is the anyindian avaialable ? :"+status1);
		boolean status2=pp.stream().allMatch(persons->persons.pname.equals("India"));
		System.out.println("All persons are available from India ? :"+status2);
		boolean status3=pp.stream().noneMatch(persons->persons.equals("Mexico"));
		System.out.println("No one available from Mexico ? :"+status3);
		
		Optional<Person>t=pp.stream().filter(p->p.pcountry.equals("India")).findFirst();
		if(t.isPresent())
		{
			System.out.println(t.get());
		}
		
		List<Person>indians=pp.stream().filter(p->p.pcountry.equals("India")).collect(Collectors.toList());
		indians.forEach(System.out::println);
		
		List<String>names=pp.stream().filter(p->p.pcountry.equals("India")).map(p->p.pname).collect(Collectors.toList());
		names.forEach(System.out::println);
	}

}
class Person{
	String pname;
	String pcountry;
	public Person(String pname, String pcountry) {
		this.pname = pname;
		this.pcountry = pcountry;
	}
	@Override
	public String toString() {
		return "Person [pname=" + pname + ", pcountry=" + pcountry + "]";
	}
	
	
}