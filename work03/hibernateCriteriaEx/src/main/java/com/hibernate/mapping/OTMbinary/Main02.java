package com.hibernate.mapping.OTMbinary;

import org.hibernate.query.Query;

import java.util.List;

import org.hibernate.Session;

import com.revature.hibernateCriteria.HibernateUtil;

public class Main02 {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query<Department> query = session.createQuery("FROM Department");
		List<Department> dept = query.list();
		for(Department d1: dept) {
			System.out.println(d1.getName());
			List<Employee> emp1 = d1.getEmployees();
			for(Employee e1 : emp1) {
				System.out.println(e1.getName() +"-->" +e1.getDesignation());
				
			}
		}

	}

}
