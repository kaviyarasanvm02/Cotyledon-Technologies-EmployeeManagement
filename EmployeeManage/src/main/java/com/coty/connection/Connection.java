package com.coty.connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.coty.entity.Employee;


public class Connection 
{
  
	public static Session  getConecion()
	{
		Configuration configuration = new Configuration().configure().addAnnotatedClass(Employee.class);
		
		SessionFactory sf  = configuration.buildSessionFactory();
		
		Session session =sf.openSession();
		
		return session;
		
	}
}
