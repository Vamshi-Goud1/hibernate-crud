package com.jsp.controller;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

public class TestUpdateStudent {

	public static void main(String[] args) {
		StudentService service = new StudentService();
		Student student = new Student();
		student.setId(3);
		student.setName("sai");
		student.setAge(21);
		student.setPhno(2358028190l);
		
		Student s = service.updateStudent(student);

		if (s != null) {
			System.out.println("data updated");
		} else {
			System.out.println("plz check the id");
		}

	}

}
