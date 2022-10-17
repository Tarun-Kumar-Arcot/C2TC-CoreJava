package com.cg.StaticExample;
/**
 * Example of static
 *
 */
public class Student {
	int rollno;
	String name;
	static String college;
	static {
		college = "BMSIT";
	}
	
	Student(int r, String n){
		rollno = r;
		name = n;
	}
	
	static void change() {
		college = "NMIT";
	}
	
	void display() {
		System.out.println(rollno + " " + name + " " + " " + college);
	}
	public static void main(String[] args) {
		Student s1 = new Student(111, "Tarun");
		Student s2 = new Student(222,"ABC");
		change();
		s1.display();
		s2.display();
	}

}
