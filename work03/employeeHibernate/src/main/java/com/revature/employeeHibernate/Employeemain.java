package com.revature.employeeHibernate;


import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;

import com.hibernate.utils.HibernateUtil;

public class Employeemain {
//	private static StandardServiceRegistry registry;
//	private static SessionFactory sessionFactory;

	public static void main(String[] args) {
		boolean run = true;
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Scanner sc = new Scanner(System.in);
		System.out.println("select one option: ");
		System.out.println("1.create or insert \n2.display employee \n3.update");
		int inp = sc.nextInt();
		//while(run) {
			switch(inp) {
			case 1:
				session.createQuery("from Employee", Employee.class).list();
				
				System.out.println("enter first name:");
				String fname = sc.next();
				System.out.println("enter last name:");
				String lname = sc.next();
				System.out.println("enter designition");
				String des = sc.next();
				System.out.println("enter email: ");
				String email = sc.next();
				System.out.println("enter salary: ");
				long sal = sc.nextLong();
				
				Employee e = new Employee(fname,lname,des,email,sal);
				session.save(e);
				tx.commit();
				
				break;
			case 2:
				System.out.println("enter the ID");
				int id_emp0 = sc.nextInt();
				
				Employee e1 = session.get(Employee.class,id_emp0);
				System.out.println(e1.toString());
				break;
				
			case 3:
				System.out.println("enter the ID");
				int id_emp1 = sc.nextInt();
				System.out.println("enter the updated salary");
				long updated_sal = sc.nextLong();
				Employee e2 = session.get(Employee.class,id_emp1);
				e2.setSalary(updated_sal);
				System.out.println(e2.getSalary());
				session.update(e2);
				tx.commit();
				break;
			case 4:
				System.out.println("enter the ID");
				int id_emp2 = sc.nextInt();
				Employee e3 = session.get(Employee.class,id_emp2);
				session.delete(e3);
				tx.commit();
				break;
			}
		}
		
		
		
	//}

}
