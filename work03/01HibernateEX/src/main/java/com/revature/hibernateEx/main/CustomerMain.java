package com.revature.hibernateEx.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.utils.HibernateUtil;

public class CustomerMain {
	public static void main(String[] args) {
		
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Customer c = new Customer("sree","kamal",96969696,720); 
		session.save(c);
		tx.commit();
		List<Customer> cusList = session.createQuery("from Customer", Customer.class).list();
		cusList.forEach(cus -> System.out.println(cus.getFirstName()));
	}

}
