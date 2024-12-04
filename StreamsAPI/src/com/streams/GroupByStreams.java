package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByStreams {
	public static void main(String[] args) {
		Student s1=new Student(1,"Venkat","Guntur");
		Student s2=new Student(2,"Swathi","Tirupathi");
		Student s3=new Student(3,"Ram","Gurazala");
		Student s4=new Student(4,"Sujatha","Guntur");
		Student s5=new Student(5,"Vija","Tirupathi");
		
		List<Student>t=Arrays.asList(s1,s2,s3,s4,s5);
		Map<String, List<Student>> m=t.stream().collect(Collectors.groupingBy(s->s.sloc));
		System.out.println(m);
	}

}

class Student {
	int sid;
	String sname;
	String sloc;

	public Student(int sid, String sname, String sloc) {

		this.sid = sid;
		this.sname = sname;
		this.sloc = sloc;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sloc=" + sloc + "]";
	}
	

}
