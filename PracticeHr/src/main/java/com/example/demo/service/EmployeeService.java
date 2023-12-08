package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employees;
import com.example.demo.repository.EmployeeRepository;

@Service
public interface EmployeeService {
	
	
	
	public Employees saveEmp(Employees employee);
	public List<Employees> getAll();

	

}
