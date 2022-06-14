package com.thales.employee.service.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import com.thales.employee.service.entities.Data;
import com.thales.employee.service.entities.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	private RestTemplate restTemplate;

	public List<Employee> getAllEmployees() throws HttpStatusCodeException {
		List<Employee> employees = new ArrayList<>();
		Map<String, List<String>> response = restTemplate
				.getForObject("http://dummy.restapiexample.com/api/v1/employees", Map.class);
		List<String> dataResponse = response.get("data");
		for (Iterator iterator = dataResponse.iterator(); iterator.hasNext();) {
			Map<String, Object> record = (Map<String, Object>) iterator.next();
			Employee employee = new Employee((int) record.get("id"), (String) record.get("employee_name"),
					(int) record.get("employee_salary"), (int) record.get("employee_age"),
					(String) record.get("profile_image"), getAnualSalary((int) record.get("employee_salary")));
			employees.add(employee);
		}
		return employees;
	}

	public Employee getEmployeeById(int employeeId) throws HttpStatusCodeException {
		Data response = restTemplate.getForObject("http://dummy.restapiexample.com/api/v1/employee/" + employeeId,
				Data.class);
		Map<String, Object> dataResponse = (Map<String, Object>) response.getAdditionalProperties().get("data");
		int id = (int) dataResponse.get("id");
		String name = (String) dataResponse.get("employee_name");
		int salary = (int) dataResponse.get("employee_salary");
		int age = (int) dataResponse.get("employee_age");
		int anual_salary = getAnualSalary(salary);
		String profile_image = (String) dataResponse.get("profile_image");
		Employee employee = new Employee(id, name, salary, age, profile_image, anual_salary);
		return employee;
	}

	@Override
	public int getAnualSalary(int salary) {
		return salary * 12;
	}

}
