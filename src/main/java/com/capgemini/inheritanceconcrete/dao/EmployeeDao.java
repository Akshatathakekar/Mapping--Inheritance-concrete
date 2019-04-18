package com.capgemini.inheritanceconcrete.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.inheritanceconcrete.entity.Employee;

@Repository
public interface EmployeeDao  extends JpaRepository<Employee, Integer>{

}
