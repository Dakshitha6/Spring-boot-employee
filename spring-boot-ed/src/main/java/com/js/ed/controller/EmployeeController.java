package com.js.ed.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.js.ed.dto.Employee;
import com.js.ed.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService es;

	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee e) {
		return es.saveEmployee(e);
	}

	@GetMapping("/employees")
	public List<Employee> getAllEmloyees() {
		return es.getAllEmloyees();
	}

	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return es.getEmployee(id);
	}

	@DeleteMapping("/employees/{id}")
	public String deleteEmployee(@PathVariable int id) {
		return es.deleteEmployee(id);
	}
	@PutMapping("/employees/{id}")
	public Employee updateEmployee(@PathVariable int id,@RequestBody Employee e) {
		return es.updateEmployee(id, e);
}
}
