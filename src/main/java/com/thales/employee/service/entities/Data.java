package com.thales.employee.service.entities;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "employee_name", "employee_salary", "employee_age", "profile_image" })
@Generated("jsonschema2pojo")
public class Data {

	@JsonProperty("id")
	private Integer id;
	@JsonProperty("employee_name")
	private String employeeName;
	@JsonProperty("employee_salary")
	private Integer employeeSalary;
	@JsonProperty("employee_age")
	private Integer employeeAge;
	@JsonProperty("profile_image")
	private String profileImage;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Data() {
	}

	/**
	 *
	 * @param employeeName
	 * @param employeeAge
	 * @param id
	 * @param profileImage
	 * @param employeeSalary
	 */
	public Data(Integer id, String employeeName, Integer employeeSalary, Integer employeeAge, String profileImage) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeAge = employeeAge;
		this.profileImage = profileImage;
	}

	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
	}

	public Data withId(Integer id) {
		this.id = id;
		return this;
	}

	@JsonProperty("employee_name")
	public String getEmployeeName() {
		return employeeName;
	}

	@JsonProperty("employee_name")
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Data withEmployeeName(String employeeName) {
		this.employeeName = employeeName;
		return this;
	}

	@JsonProperty("employee_salary")
	public Integer getEmployeeSalary() {
		return employeeSalary;
	}

	@JsonProperty("employee_salary")
	public void setEmployeeSalary(Integer employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public Data withEmployeeSalary(Integer employeeSalary) {
		this.employeeSalary = employeeSalary;
		return this;
	}

	@JsonProperty("employee_age")
	public Integer getEmployeeAge() {
		return employeeAge;
	}

	@JsonProperty("employee_age")
	public void setEmployeeAge(Integer employeeAge) {
		this.employeeAge = employeeAge;
	}

	public Data withEmployeeAge(Integer employeeAge) {
		this.employeeAge = employeeAge;
		return this;
	}

	@JsonProperty("profile_image")
	public String getProfileImage() {
		return profileImage;
	}

	@JsonProperty("profile_image")
	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}

	public Data withProfileImage(String profileImage) {
		this.profileImage = profileImage;
		return this;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public Data withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(Data.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
				.append('[');
		sb.append("id");
		sb.append('=');
		sb.append(((this.id == null) ? "<null>" : this.id));
		sb.append(',');
		sb.append("employeeName");
		sb.append('=');
		sb.append(((this.employeeName == null) ? "<null>" : this.employeeName));
		sb.append(',');
		sb.append("employeeSalary");
		sb.append('=');
		sb.append(((this.employeeSalary == null) ? "<null>" : this.employeeSalary));
		sb.append(',');
		sb.append("employeeAge");
		sb.append('=');
		sb.append(((this.employeeAge == null) ? "<null>" : this.employeeAge));
		sb.append(',');
		sb.append("profileImage");
		sb.append('=');
		sb.append(((this.profileImage == null) ? "<null>" : this.profileImage));
		sb.append(',');
		sb.append("additionalProperties");
		sb.append('=');
		sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
		sb.append(',');
		if (sb.charAt((sb.length() - 1)) == ',') {
			sb.setCharAt((sb.length() - 1), ']');
		} else {
			sb.append(']');
		}
		return sb.toString();
	}

}