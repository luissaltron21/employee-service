package com.thales.employee.service.services;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.thales.employee.service.entities.Employee;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeeServiceTest {
	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;

	@Before
	public void init() {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setEmployee_name("Tiger Nixon");
		employee.setEmployee_salary(320800);
		employee.setEmployee_age(61);
		employee.setProfile_image("");
		when(employeeServiceImpl.getEmployeeById(1)).thenReturn(employee);
	}

	@Test
	public void testGetEmployeeById() {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setEmployee_name("Tiger Nixon");
		employee.setEmployee_salary(320800);
		employee.setEmployee_age(61);
		employee.setProfile_image("");
		assertEquals(employee, employeeServiceImpl.getEmployeeById(1));
	}

}
