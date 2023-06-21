package com.jsp.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Student;



public class DeleteByName {
	public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("vg");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		
		Query q = em.createQuery("select  a from Student a where name=?1");
		q.setParameter(1, "sai");
		
		List<Student> list =q.getResultList();
		if(list.size()>0) {
			for (Student student : list) {
				et.begin();
				em.remove(student);
				et.commit();
			}
		}else {
			System.out.println("plz check the name");
		}
		
	}
}
