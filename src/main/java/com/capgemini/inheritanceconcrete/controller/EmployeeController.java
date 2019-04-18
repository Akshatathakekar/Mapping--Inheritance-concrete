package com.capgemini.inheritanceconcrete.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.inheritanceconcrete.entity.ContractEmployee;
import com.capgemini.inheritanceconcrete.entity.Employee;
import com.capgemini.inheritanceconcrete.entity.RegularEmployee;
import com.capgemini.inheritanceconcrete.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@RequestMapping("/")
	public Employee addEmployee() {

		Employee emp = new Employee(103, "akshata");
		service.addEmployee(emp);

		RegularEmployee regular = new RegularEmployee(1010, "aks", 55000, 2000);
		service.addEmployee(regular);

		ContractEmployee contract = new ContractEmployee(1020, "mahi", 20000, 48);
		service.addEmployee(contract);

		return regular;
	}

	@RequestMapping("/get")
	public Employee getEmployee() {
		return service.getEmployee(101);
	}

}
