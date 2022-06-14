package com.thales.employee.service.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpStatusCodeException;

import com.thales.employee.service.entities.Employee;
import com.thales.employee.service.services.IEmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	IEmployeeService employeeService;

	@GetMapping
	public ResponseEntity<List<Employee>> getAllEmployees() {
		try {
			List<Employee> employees = employeeService.getAllEmployees();
			if (employees.isEmpty()) {
				return ResponseEntity.noContent().build();
			}
			return ResponseEntity.ok(employees);
		} catch (HttpStatusCodeException e) {
			return ResponseEntity.status(e.getRawStatusCode()).build();
		}

	}

	@GetMapping("/{employeeId}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("employeeId") int id) {
		try {
			Employee employee = employeeService.getEmployeeById(id);
			if (employee == null) {
				return ResponseEntity.notFound().build();
			}
			return ResponseEntity.ok(employee);
		} catch (HttpStatusCodeException e) {
			return ResponseEntity.status(e.getRawStatusCode()).build();
		}

	}
}
