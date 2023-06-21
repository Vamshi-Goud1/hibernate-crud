package com.jsp.controller;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

public class TestDeleteByName {

	public static void main(String[] args) {
		StudentService service = new StudentService();
		Student student = new Student();
		student.setName("vamshi");
		Student s =service.deleteByName(student);
		
		if(s!=null) {
			System.out.println("data deleted....");
		}else {
			System.out.println("plz check the name..");
		}
	}

}
