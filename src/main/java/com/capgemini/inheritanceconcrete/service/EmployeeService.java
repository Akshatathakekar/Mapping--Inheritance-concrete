package com.capgemini.inheritanceconcrete.service;

import com.capgemini.inheritanceconcrete.entity.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee);
	public Employee getEmployee(int id);
}
