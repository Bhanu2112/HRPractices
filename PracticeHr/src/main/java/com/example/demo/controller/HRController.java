package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Departments;
import com.example.demo.entity.Employees;
import com.example.demo.entity.Jobs;
import com.example.demo.repository.DepartmentRepositroy;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.DepartmentService;
import com.example.demo.service.JobsService;

@RestController
public class HRController {

	
	@Autowired
	JobsService jobsService;
	
	
	
	@Autowired
	DepartmentService departmentService;
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@PostMapping("/job/save")
	public Jobs saveJob(@RequestBody Jobs job) {
		return jobsService.saveJobs(job);
	}
	
	@GetMapping("/jobs")
	public List<Jobs> getAllJobs(){
		return jobsService.getAllJobs();
	}
	
	@PostMapping("/dept/save")
	public Departments saveDepartment(@RequestBody Departments department) {
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/depts")
	public List<Departments> getAllDep(){
		return departmentService.getAll();
	}
	
	
	@PostMapping("/emp/save")
	public Employees saveEmp(@RequestBody Employees employee) {
		return employeeRepository.save(employee);
	}
	
	@GetMapping("/emps")
	public List<Employees> getAllEmp(){
		return employeeRepository.findAll();
	}
}
