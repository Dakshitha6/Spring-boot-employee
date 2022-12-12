package com.js.ed.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.ed.dao.EmployeeDao;
import com.js.ed.dto.Employee;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao ed;
	
  
	public Employee saveEmployee(Employee e) {
		return ed.saveEmployee(e);
	}
	
	public List<Employee> getAllEmloyees(){
		return ed.getAllEmloyees();
	}
	
	public Employee getEmployee(int id) {
			return ed.getEmployee(id);
	}
	
	public String deleteEmployee(int id) {
		if(ed.deleteEmployee(id)) {
			return "Deleted successfully";
		}
		else {
			return "No person with given Id";
		}
	}
	
	public Employee updateEmployee(int id,Employee e) {
			return ed.updateEmployee(id, e);
	}
}
