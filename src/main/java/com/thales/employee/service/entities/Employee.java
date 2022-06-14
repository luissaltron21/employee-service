package com.thales.employee.service.entities;

public class Employee {

	private int id;

	private String employee_name;

	private int employee_salary;

	private int employee_age;

	private String profile_image;

	private int anual_salary;

	public Employee() {
	}

	public Employee(int id, String employee_name, int employee_salary, int employee_age, String profile_image,
			int anual_salary) {
		this.id = id;
		this.employee_name = employee_name;
		this.employee_salary = employee_salary;
		this.employee_age = employee_age;
		this.profile_image = profile_image;
		this.anual_salary = anual_salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public int getEmployee_salary() {
		return employee_salary;
	}

	public void setEmployee_salary(int employee_salary) {
		this.employee_salary = employee_salary;
	}

	public int getEmployee_age() {
		return employee_age;
	}

	public void setEmployee_age(int employee_age) {
		this.employee_age = employee_age;
	}

	public String getProfile_image() {
		return profile_image;
	}

	public void setProfile_image(String profile_image) {
		this.profile_image = profile_image;
	}

	public int getAnual_salary() {
		return anual_salary;
	}

	public void setAnual_salary(int anual_salary) {
		this.anual_salary = anual_salary;
	}


}
