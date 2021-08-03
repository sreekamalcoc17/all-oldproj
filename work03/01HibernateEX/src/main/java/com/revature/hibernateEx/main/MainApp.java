package com.revature.hibernateEx.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.hibernate.utils.HibernateUtil;

public class MainApp {
	private static StandardServiceRegistry registry;
	private static SessionFactory sessionFactory;

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Student s1 =session.load(Student.class, 1);
		
		System.out.println(s1.getFirstName());
		//Transaction tx = session.beginTransaction();
		
		//s1.setFirstName("sreekamal r");
		
		//session.update(s1);
		//session.delete(s1);
		
		//tx.commit();
		
		
		
		
		
	}
	}









		/*Session session = HibernateUtil.getSessionFactory().openSession();
		List<Student> stuList = session.createQuery("from Student", Student.class).list();
		stuList.forEach(s -> System.out.println(s.getFirstName()));
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Customer c = new Customer("sree","kamal",96969696,720); 
		session.save(c);
		tx.commit();
		List<Customer> cusList = session.createQuery("from Customer", Customer.class).list();
		cusList.forEach(cus -> System.out.println(cus.getFirstName()));
	}
}
*/









/*
 * if (sessionFactory == null) { try { // Create registry registry = new
 * StandardServiceRegistryBuilder().configure().build(); // Create
 * MetadataSources MetadataSources sources = new MetadataSources(registry); //
 * Create Metadata Metadata metadata = sources.getMetadataBuilder().build(); //
 * Create SessionFactory sessionFactory =
 * metadata.getSessionFactoryBuilder().build(); } catch (Exception e) {
 * e.printStackTrace(); if (registry != null) {
 * StandardServiceRegistryBuilder.destroy(registry);
 * 
 * } }
 * 
 * } Session session = sessionFactory.openSession(); Transaction tx =
 * session.beginTransaction();
 * 
 * Student s = new Student("sree","kamal","sk@protonmail.com"); session.save(s);
 * 
 * tx.commit();
 * 
 * List<Student> stuList = session.createQuery("from Student",
 * Student.class).list();
 * 
 * stuList.forEach(s -> System.out.println(s.getFirstName()));
 */
