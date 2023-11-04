package com.mindgate.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mindgate.main.domain.Employees;

@Repository
public class EmployeesRepository implements EmployeesRepositoryInterface {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	private final static String INSERT_NEW_EMPLOYEE="insert into employees(employee_id_sequence.nextVal,employee_name,role,manager_id,project_name,email,employee_password,login_status,count) values(employee_id_sequence.nextVal,?,?,?,?,?,?,?,?,?)";
	private final static String UPDATE_EXISTING_EMPLOYEE ="";
	private final static String DELETE_EXISTING_EMPLOYEE="";
	private final static String SELECT_ALL_EMPLOYEE="select * from employees join slab using (slab_id)";
	private final static String SELECT_ONE_EMPLOYEE="";
	
	
	
	
	@Override
	public List<Employees> getAllEmployees() {
			
		EmployeesRowMapper employeesRowMapper = new EmployeesRowMapper();
		List<Employees> employeesList = jdbcTemplate.query(SELECT_ALL_EMPLOYEE, employeesRowMapper);
		return employeesList;
		
	}
	
	
	
	
	
	
	
	
	
	@Override
	public boolean addNewEmployee(Employees employees) {
//		Object [] parameter={employees.getEmployeeName(),employees.getEmail(),employees.getEmployeePassword(),employees.getRole(),employees.getProjectName(),employees.getCount(),employees.getLoginStatus()};
//		jdbcTemplate.update(INSERT_NEW_EMPLOYEE, parameter);
		return true;
	}

	@Override
	public Employees updateEmployee(Employees employees) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteEmployeeByEmployeeId(int employeeId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employees getEmployeeByEmployeeId(int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	

		
}
