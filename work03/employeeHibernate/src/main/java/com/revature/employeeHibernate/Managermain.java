package com.revature.employeeHibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.utils.HibernateUtil;

public class Managermain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.createQuery("from Manager", Manager.class).list();
		Manager m1 = new Manager("nithya");
		session.save(m1);
		tx.commit();
		

	}

}
