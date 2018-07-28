package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ImplementHibernateRunner {
	public static void main(String args[])
	{
	//create session factory 
SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Mobile.class).buildSessionFactory();

	
	// create session 
	
	Session session =factory.getCurrentSession();
	Mobile mobile= new Mobile("galaxy","samsung");

	// start trasaction 
	session.beginTransaction();

	//Execute the statement
	session.saveOrUpdate(mobile);
	System.out.println("saved successfly");
	
	// commit state
	
	session.getTransaction().commit();
	session.close();
	}
}
