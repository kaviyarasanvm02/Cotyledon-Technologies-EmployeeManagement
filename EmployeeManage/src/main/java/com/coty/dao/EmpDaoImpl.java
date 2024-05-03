package com.coty.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.coty.connection.Connection;
import com.coty.entity.Employee;

import jakarta.transaction.Transactional;

@Repository
public class EmpDaoImpl implements EmpDao
{



	@Transactional
	public void saveEmp(Employee employee) 
	{
		Session session =Connection.getConecion();

		session.beginTransaction();
		session.save(employee);
		session.getTransaction().commit();
		session.close();
	}


	public List<Employee> getAllEmp() {
		Session session1 =Connection.getConecion();
		session1.beginTransaction();

		Query<Employee> q1 = session1.createQuery("from Employee");
		List<Employee> l1 = q1.list();
		session1.getTransaction().commit();
		session1.close();

		return l1;
	}


	public Employee getEmpById(int id) 
	{
		Session session2 =Connection.getConecion();
		session2.beginTransaction();

		Employee employee=	session2.get(Employee.class, id);
		session2.getTransaction().commit();
		session2.close();
		return employee;

	}

	@Transactional
	public void update(Employee employee) 
	{
		Session session3 = Connection.getConecion();
		session3.beginTransaction();

		session3.update(employee);
		session3.getTransaction().commit();
		session3.close();


	}

	@Transactional
	public void deleteEmp(int id) 
	{
		Session session4 =Connection.getConecion();
		session4.beginTransaction();
		Employee employee =session4.get(Employee.class, id);
		session4.delete(employee);
		session4.getTransaction().commit();
		session4.close();
	}


}
