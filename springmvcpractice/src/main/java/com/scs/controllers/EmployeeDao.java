package com.scs.controllers;
import java.util.*;
public interface EmployeeDao {
	 public void addEmployee(Employee employee);
	 public List<Employee> listEmployeess();
	 public Employee getEmployee(int empid);
	 public void deleteEmployee(Employee employee);
}
