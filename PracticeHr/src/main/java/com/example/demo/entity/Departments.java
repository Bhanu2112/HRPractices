package com.example.demo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
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
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Departments {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int DepartmentId;
	
	private String DepartmentName;
	
	
	@ManyToOne
	@JoinColumn(name="manager_id")
	private Employees ManagerId;

	
	@ManyToOne
	@JoinColumn(name="location_id")
	private Locations LocationId;
	
	
}
