package com.acn.acit.snowticketingapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.acn.acit.snowticketingapp.domain.Solution;
import com.acn.acit.snowticketingapp.repository.SolutionRepository;

@Service
public class SolutionService {

	public SolutionRepository solutionRepository;
	

	public SolutionService(SolutionRepository solutionRepository) {
		this.solutionRepository = solutionRepository;
	}
	
	public List<Solution> getAllSolutions(){
		return solutionRepository.findAll();
	}
}
