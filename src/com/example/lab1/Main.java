package com.example.lab1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Create arraylist of user-defined class objects
		List<Student> al=new ArrayList<Student>();
		System.out.println("Student List (ordered by name)");
		Student s1=new Student(101,"Kim",23);
		al.add(s1);//adding Student class object
		Student s2=new Student(102,"Choi",21);
		al.add(s2);
		al.add(new Student(103,"Park",25));
		
		al.add(new Student(104,"Woo",25));
		al.add(new Student(105,"Lee",25));
		al.add(new Student(106,"Hwang",25));
		al.add(new Student(107,"Yun",25));
		al.add(new Student(108,"No",25));
		al.add(new Student(109,"Nam",25));
		al.add(new Student(110,"Yang",25));
		
		Collections.sort(al);
		//Traverse elements of arraylist (ordered)
		for (Student s : al) {
			System.out.println(s.toString());
		}
		System.out.println("Studnet List (reverse ordered by name)");
		
		Collections.sort(al);
		//Traverse elements of arraylist (reverse ordered)
		for (int i=0; i<al.size(); i++){
			System.out.println(al.get(i).toString());
		}
	}
}