package com.jsp.controller;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

public class TestLogin {

	public static void main(String[] args) {
		StudentService service = new StudentService();
		
		Student s =service.login("vamshi", 8767876787l);
		
		if(s!=null) {
			System.out.println("Home Page..");
		}else {
			System.out.println("Login Page..");
		}

	}

}
