package com.coty.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empdetails")
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String fullName;
  private String address;
  private String email;
  private String password;
  private String designation;
  private String salary;
  
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFullName() {
	return fullName;
}
public void setFullName(String fullName) {
	this.fullName = fullName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", fullName=" + fullName + ", address=" + address + ", email=" + email + ", password="
			+ password + ", designation=" + designation + ", salary=" + salary + "]";
}
  
}
