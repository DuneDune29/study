package SortTest;

import java.util.*;

class Student implements Comparable<Student>{
	int number;
	String name;
	
	public Student(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
	
	public int compareTo(Student s) {
		return (number-s.number)*(-1);
	}
}

public class SortTest {

	public static void main(String[] args) {
		Student array[] = {
				new Student(20090004, "ÃÖÃ¶¼ö"),
				new Student(20090002, "±èÃ¶¼ö"),
				new Student(20090003, "ÀÌÃ¶¼ö"),
				new Student(20090001, "¹ÚÃ¶¼ö"),
		};
		List<Student> list = Arrays.asList(array);
		Collections.sort(list);
		
		System.out.println(list);
	}
}