package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Departments;
import com.example.demo.repository.DepartmentRepositroy;

public interface DepartmentService {


	public Departments saveDepartment(Departments department);

	public List<Departments> getAll();
	
}
