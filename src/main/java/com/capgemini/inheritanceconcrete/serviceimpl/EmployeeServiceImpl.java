package com.capgemini.inheritanceconcrete.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.inheritanceconcrete.dao.EmployeeDao;
import com.capgemini.inheritanceconcrete.entity.Employee;
import com.capgemini.inheritanceconcrete.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;

	@Override
	public Employee addEmployee(Employee employee) {

		
		return dao.save(employee);
	}

	@Override
	public Employee getEmployee(int id) {

		return dao.findById(id).get();
	}

}
