package com.jsp.service;

import java.util.List;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentService {

	StudentDao dao = new StudentDao();

	public Student saveBranch(Student student) {
		return dao.saveStudent(student);
	}

	public Student getStudentById(int id) {
		return dao.getStudentById(id);
	}

	public List<Student> getAll() {
		return dao.getAll();
	}
	
	public Student deleteStudent(int id) {
		return dao.deleteStudent(id);
	}
	
	public Student updateStudent(Student student) {
		return dao.updateStudent(student);
	}
	
	public Student login(String name, long phno) {
		return dao.login(name, phno);
	}
	
	public Student deleteByName(Student student) {
		return dao.deleteByName(student);
	}
}
