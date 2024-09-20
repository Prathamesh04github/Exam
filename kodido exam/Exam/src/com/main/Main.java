package com.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.demo.Student;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		Student st=new Student();
		st.setRollno(sc.nextInt());
		st.setName(sc.next()+sc.nextLine());
		st.setMarks(sc.nextDouble());
		
		ArrayList<Student> li=new ArrayList<>();
		li.add(st);
		
		for (Student stu : li) {
			System.out.println(stu);
		}
		
		
	}
	
}
