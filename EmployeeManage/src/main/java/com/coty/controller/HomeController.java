package com.coty.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.coty.dao.EmpDao;
import com.coty.entity.Employee;

@Controller
public class HomeController 
{
	@Autowired
	EmpDao empDao; 

	@RequestMapping("/home")
	public String home(Model m)
	{ 
		List<Employee> list = empDao.getAllEmp();
		m.addAttribute("emplist", list);


		return "home" ;
	}
	@RequestMapping("/addEmp")
	public String addEmp()
	{
		return "addemp";
	}

	@RequestMapping(value = "/createEmp", method =  RequestMethod.POST)
	public String createEmp(@ModelAttribute Employee employee, HttpSession httpSession)
	{
		System.out.println(employee);
         
		empDao.saveEmp(employee);

		httpSession.setAttribute("msg", "Register Succesfully");

		return "addemp";
	}
	@RequestMapping(value="/editEmp/{id}")
	public String editEmp(@PathVariable int id, Model m)
	{
		Employee employee=empDao.getEmpById(id);
		
		m.addAttribute("employee", employee);
		
		return "edit_emp";
	}
	@RequestMapping(value="/updateEmp", method =  RequestMethod.POST)
	public String updateEmp(@ModelAttribute Employee employee,HttpSession session)
	{
		empDao.update(employee);
		
		session.setAttribute("msg", "Update Succesfully");
		
		return "redirect:/home";
		
	}
	
	@RequestMapping("/deleteEmp/{id}")
	public String deleteEmp(@PathVariable int id, HttpSession session)
	{
		empDao.deleteEmp(id);
		session.setAttribute("msg", "Employee Delete Succesfully");
		return "redirect:/home";
	}  
}
