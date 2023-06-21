package com.jsp.controller;

	import com.jsp.dto.Student;
	import com.jsp.service.StudentService;

	public class TestSaveStudent {

		public static void main(String[] args) {
			
			Student student = new Student();
			student.setId(1);
			student.setName("bittu");
			student.setAge(21);
			student.setPhno(799522287l);
			
			StudentService service = new StudentService();
			Student student2 = service.saveBranch(student);
			
			if (student2 != null) {
				System.out.println("data saved..!");
			}else {
				System.out.println("plz check the data");
			}

		}

	}
