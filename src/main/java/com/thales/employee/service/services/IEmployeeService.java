package com.thales.employee.service.services;

import java.util.List;

import com.thales.employee.service.entities.Employee;

public interface IEmployeeService {
	public List<Employee> getAllEmployees();

	public Employee getEmployeeById(int employeeId);
	
	public int getAnualSalary(int salary);
	
}
