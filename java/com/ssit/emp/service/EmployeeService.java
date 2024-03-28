package com.ssit.emp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssit.emp.dao.EmployeeDao;
import com.ssit.emp.model.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDao empDao;
	
public List<Employee> getAllEmployees(){
	
	Iterable<Employee> findAll= empDao.findAll();
	return(List<Employee>)findAll;
	
	
}

public Employee saveEmployee(Employee emp) {
	
	return empDao.save(emp);
}

public Employee getEmployeeById(Integer empId) {
	Optional<Employee> findById=empDao.findById(empId);
	return findById.orElse(new Employee(-0, null,null,null));
	
}

public Employee updateEmployeeEmailById(Integer empId, String empEmail) {
	Employee dbEmp =getEmployeeById(empId);
	dbEmp.setEmail(empEmail);
	return empDao.save(dbEmp);
}

public Employee updateEmployee(Employee emp) {
	
	return empDao.save(emp);
}

public void deleteEmpByEmpId(Integer empId) {
	empDao.deleteById(empId);
}
}