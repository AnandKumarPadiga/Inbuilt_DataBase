package com.ssit.emp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer empId;
	@Column
	private String empName;
	@Column
	private String email;
	@Column
	private String mobileNumber;
	
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	
	public Employee(Integer empId, String empName, String email, String mobileNumber) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.email = email;
		this.mobileNumber = mobileNumber;
	}
	public Employee() {
		super();
	}
	
	

}
