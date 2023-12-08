package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Departments;
import com.example.demo.repository.DepartmentRepositroy;
import com.example.demo.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentRepositroy departmentRepositroy;
	
	public Departments saveDepartment(Departments department) {
		System.out.println(department.getDepartmentName());
		System.out.println(department.getManagerId());
		return departmentRepositroy.save(department);
	}
	public List<Departments> getAll(){
		return departmentRepositroy.findAll();
	}
}
