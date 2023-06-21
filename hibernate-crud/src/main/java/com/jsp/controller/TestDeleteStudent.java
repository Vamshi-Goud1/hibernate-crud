package com.jsp.controller;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

public class TestDeleteStudent {
	public static void main(String[] args) {

		StudentService service = new StudentService();

		Student s = service.deleteStudent(1);

		if (s != null) {
			System.out.println("Data deleted...");
		} else {
			System.out.println("Plz check the id");
		}
	}
}
