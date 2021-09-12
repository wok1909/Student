package com.example.lab1;
public class Student implements Comparable<Student>{
	int no;
	String name;
	int age;
	
	public Student() {}
	
	public Student(int no, String name, int age) {
		this.no = no;
		this.name = name;
		this.age = age;
	}
	
	public int compareTo(Student o) {
		return name.compareTo(o.name);
	}
	
	public int getNo() {
		return this.no;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	  
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		String str = new String("Student [no="+no+", name="+name+", age="+age+"]");
		return str;
	}
}
