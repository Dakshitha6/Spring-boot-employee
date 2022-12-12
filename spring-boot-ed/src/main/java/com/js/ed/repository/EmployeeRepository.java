package com.js.ed.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.js.ed.dto.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
