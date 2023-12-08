package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class JobHistory {

	@Id
	@ManyToOne
	@JoinColumn(name= "employee_id")
	private Employees EmployeeId;
	
	@Id
	private Date StartDate;
	private Date EndDate;
	
	@ManyToOne
	@JoinColumn(name="job_id")
	private Jobs JobId;
	
	@ManyToOne
	@JoinColumn(name="department_id")
	private Departments DepartmentId;
	
}
