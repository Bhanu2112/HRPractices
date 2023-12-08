package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Jobs;
import com.example.demo.repository.JobsRepository;


public interface JobsService {

	
	
	
	public Jobs saveJobs(Jobs job);
	
	
	public List<Jobs> getAllJobs();
	
}
