package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Locations {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int LocationId;
	private String StreetAddress;
	private String PostalCode;
	private String City;
	private String StateProvince;
	
	@ManyToOne
	private Countries CountryId;
}
