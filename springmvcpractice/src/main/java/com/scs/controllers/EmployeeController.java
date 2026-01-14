package com.scs.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	 @Autowired
	 private EmployeeService employeeService;
	 @GetMapping(value = "/emp")
	 public ModelAndView Employee() {
	  
	   return new ModelAndView("addemp","command",new EmpBean());
	  }
	 @RequestMapping(value = "/save", method = RequestMethod.POST)
	 public ModelAndView saveEmployee(@ModelAttribute("command")EmpBean employeeBean,
	    BindingResult result) {
	   Employee employee = prepareModel(employeeBean);
	   employeeService.addEmployee(employee);
	   return new ModelAndView("addemp","command",new EmpBean());
	  }
	 private Employee prepareModel(EmpBean employeeBean){
		  Employee employee = new Employee();
		  employee.setEmpAddress(employeeBean.getAddress());
		  employee.setEmpAge(employeeBean.getAge());
		  employee.setEmpName(employeeBean.getName());
		  employee.setSalary(employeeBean.getSalary());
		  employee.setEmpId(employeeBean.getId());
		  employeeBean.setId(null);
		  return employee;
		 }
	 
	 @RequestMapping(value="/employees", method = RequestMethod.GET)
	 public ModelAndView listEmployees() {
	 
	  System.out.println("size is "+employeeService.listEmployeess().size());
      return new ModelAndView("employeesList").addObject("empdata",prepareListofBean(employeeService.listEmployeess()));
	 }
	 
	 private List<EmpBean> prepareListofBean(List<Employee> employees){
		  List<EmpBean> beans = null;
		  if(employees != null && !employees.isEmpty()){
		   beans = new ArrayList<EmpBean>();
		   EmpBean bean = null;
		   for(Employee employee : employees){
		    bean = new EmpBean();
		    bean.setName(employee.getEmpName());
		    bean.setId(employee.getEmpId());
		    bean.setAddress(employee.getEmpAddress());
		    bean.setSalary(employee.getSalary());
		    bean.setAge(employee.getEmpAge());
		    beans.add(bean);
		   }
		  }
		  return beans;
		 }
}
