package com.jsp.controller;

import java.util.List;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

public class TestgetAllStudent {

	public static void main(String[] args) {
		
		StudentService service=new StudentService();
		
		List<Student> list=service.getAll();
		
		if(list.size()>0) {
			for(Student student:list) {
				System.out.println(student.getId());
				System.out.println(student.getName());
				System.out.println(student.getAge());
				System.out.println(student.getPhno());
				System.out.println("-------------");
			}
		}
		else {
			System.out.println("please check the data");
		}
	}

}
