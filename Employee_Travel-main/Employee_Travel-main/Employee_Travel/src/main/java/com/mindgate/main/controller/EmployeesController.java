package com.mindgate.main.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.domain.Employees;
import com.mindgate.main.service.EmployeesServiceInterface;

@RestController
public class EmployeesController {
	
	@Autowired
	EmployeesServiceInterface employeesServiceInterface;
	
	// GET ALL
			// http://localhost:8081/employees
			@RequestMapping(value = "employees", method = RequestMethod.GET)
			public List<Employees> getAllEmployees() {
				List<Employees> list = employeesServiceInterface.getAllEmployees();
				return list;
			}

}
