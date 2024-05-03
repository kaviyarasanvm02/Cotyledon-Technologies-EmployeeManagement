package com.coty.dao;

import java.util.List;

import com.coty.entity.Employee;

public interface EmpDao 
{
	public void saveEmp(Employee employee);

	public List<Employee> getAllEmp();
	
	public Employee getEmpById(int id);
	
	public void update(Employee employee);
	
	public void deleteEmp(int id);

	

}
