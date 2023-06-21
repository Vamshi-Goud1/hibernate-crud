package com.jsp.controller;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

public class TestGetById {
	public static void main(String[] args) {
		
		StudentService service=new StudentService();
		
		Student student=service.getStudentById(1);
		
		if(student!=null) {
			System.out.println(student.getId());
			System.out.println(student.getName());
			System.out.println(student.getAge());
			System.out.println(student.getPhno());
			System.out.println("<------------->");
			
		}
		else {
			System.out.println("please check the id");
		}
	}
}
