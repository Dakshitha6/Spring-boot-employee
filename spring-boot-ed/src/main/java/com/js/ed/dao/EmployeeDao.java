package com.js.ed.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.js.ed.dto.Employee;
import com.js.ed.repository.EmployeeRepository;
@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository er;

	public Employee saveEmployee(Employee e) {
		return er.save(e);
	}
	
	public List<Employee> getAllEmloyees(){
		return er.findAll();
	}
	
	public Employee getEmployee(int id) {
		Optional< Employee> e=er.findById(id);
		if(e.isPresent()) {
			return e.get();
		}
		else {
			return null;
		}
	}
	
	public boolean deleteEmployee(int id) {
		Employee e=getEmployee(id);
		if(e!=null) {
			er.delete(e);
			return true;
		}
		else {
			return false;
		}
	}
	
	public Employee updateEmployee(int id,Employee e) {
		Optional<Employee> emp=er.findById(id);
		if(emp.isPresent()) {
			return er.save(e);
		}
		else {
			return null;
		}
		
	}

}
