package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Student;

public class StudentDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("vg");

	public Student saveStudent(Student student) {

		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		if (student != null) {
			et.begin();
			em.persist(student);
			et.commit();

		}
		return student;
	}

	public Student getStudentById(int id) {

		EntityManager em = emf.createEntityManager();
		return em.find(Student.class, id);

	}

	public List<Student> getAll() {
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("select a from Student a");
		return query.getResultList();
	}

	public Student deleteStudent(int id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Student s = em.find(Student.class, id);

		if (s != null) {
			et.begin();
			em.remove(s);
			et.commit();
		}
		return s;
	}

	public Student updateStudent(Student student) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction etr = em.getTransaction();

		Student s = em.find(Student.class, student.getId());

		if (s != null) {
			etr.begin();
			em.merge(student);
			etr.commit();
		}
		return s;

	}

	public Student login(String name, long phno) {
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select a from Student a where name=?1 and phno=?2");
		q.setParameter(1, name);
		q.setParameter(2, phno);

		List<Student> list = q.getResultList();

		if (list.size() > 0) {
			return list.get(0);
		}
		
		return null;

	}

	public Student deleteByName(Student student) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction etr = em.getTransaction();

		Query q = em.createQuery("select a from Student a where name=?1");

		q.setParameter(1, student.getName());

		List<Student> list = q.getResultList();

		if (list.size() > 0) {
            return list.get(0);
		}
      return null;
	}

}
