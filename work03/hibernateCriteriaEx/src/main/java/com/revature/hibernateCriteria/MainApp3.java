package com.revature.hibernateCriteria;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import org.hibernate.query.Query;

public class MainApp3 {
public static void main(String[] args) {
    Transaction transactionOne = null;
      Session sessionOne = HibernateUtil.getSessionFactory().openSession();
        transactionOne = sessionOne.beginTransaction();
         Query namedQuery = sessionOne.getNamedQuery("AllStudents");
          
          List<Student> namedresults = namedQuery.list(); 
          namedresults.forEach(s ->  System.out.println(s.getId()+"  "+s.getFirstName()));
         
          
          System.out.println("-----------------------------------");
         
            
        //      Query getStu=sessionOne.createQuery("FROM Student S WHERE S.id > 10");
              Query IdGt10 = sessionOne.getNamedQuery("IdGt10");
              
              List<Student> IdGt10results = IdGt10.list(); 
              IdGt10results.forEach(s -> System.out.println(s.getId()+"  "+s.getFirstName()));
             
          
}
}