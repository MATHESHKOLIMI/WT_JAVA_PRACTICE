package com.practice.Immutable;

import java.util.HashMap;
import java.util.Map;

public class ImmutableDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Map<String, Subject> map = new HashMap<>();
		map.put("Maths", new Subject("Maths", "12340", "ENG MATH", "A1"));
		map.put("Data Structures", new Subject("Data Structures", "12345", "DS", "B1"));
		map.put("Java", new Subject("Java", "12341", "JAVA", "A2"));
		Student student= new Student("10023", "Mathesh Kolimi", new Address("1-234", "yb st", "Ap", "515231"),map);
		
		Student studentHack= student;
		Address adr= student.getAddress();
		adr.setState("PAK");
		System.out.println(adr);
		System.out.println(student.getAddress());
		map= student.getMarksList();
		map.put("Java", new Subject("Java", "12341", "JAVA", "A1"));

		System.out.println(map);
		System.out.println(student.getMarksList());
		
	}
}
