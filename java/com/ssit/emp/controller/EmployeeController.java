package com.ssit.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssit.emp.model.Employee;
import com.ssit.emp.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	
	private EmployeeService empService;
	
	@GetMapping("/{empId}")
	public Employee getEmployeeById(@PathVariable("empId") Integer empId) {
		return empService.getEmployeeById(empId);
		
	}
	@PutMapping("/{empId}/{email}")
	public Employee pdateEmployeeEmailById(@PathVariable("empId") Integer empId, @PathVariable("email")String empEmail) {
		return empService.updateEmployeeEmailById(empId,empEmail);
		
	}
	
	
	@GetMapping
	public List<Employee> getAllEmployees(){
		List<Employee> allEmployees = empService.getAllEmployees();
		
		return allEmployees;
		
	}
	
	@PostMapping
	public Employee saveEmployee(@RequestBody Employee emp) {
		Employee empDb=empService.saveEmployee(emp);
		return empDb;
	}
   
	@PutMapping
	public Employee updateEmployee(@RequestBody Employee emp) {
		
		return empService.updateEmployee(emp);
	
	}
	
	@DeleteMapping("/{empId}")
	public void deleteEmpByEmpId(@PathVariable("empId") Integer empId) {
		empService.deleteEmpByEmpId(empId);
		
	}
		
	

}
