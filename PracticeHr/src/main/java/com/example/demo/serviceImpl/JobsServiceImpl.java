package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Jobs;
import com.example.demo.repository.JobsRepository;
import com.example.demo.service.JobsService;

@Service
public class JobsServiceImpl implements JobsService {

	@Autowired
	JobsRepository jobsRepository;
	
	
	public Jobs saveJobs(Jobs job) {
		return jobsRepository.save(job);
	}
	
	public List<Jobs> getAllJobs(){
		return jobsRepository.findAll();
	}
}
