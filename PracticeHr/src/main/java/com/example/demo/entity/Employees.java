package com.example.demo.entity;

import java.util.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
public class Employees {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int EmployeeId;
	private String FirstName;
	private String LastName;
	private String Email;
	private String PhoneNumber;
	private Date HireDate;
	
	@ManyToOne
	private Jobs JobId;
	private double Salary;
	private double CommisionPct;
	
	@ManyToOne
	@JoinColumn(name="manager_id")
	private Employees Manager;
	
	@ManyToOne
	private Departments DepartmentId;
	

}
