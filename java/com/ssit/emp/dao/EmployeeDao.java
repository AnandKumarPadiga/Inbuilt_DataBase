package com.ssit.emp.dao;

import org.springframework.data.repository.CrudRepository;

import com.ssit.emp.model.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {

}
