package com.acn.acit.snowticketingapp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.acn.acit.snowticketingapp.domain.Solution;

@Repository
public interface SolutionRepository extends MongoRepository<Solution, String> {
	List<Solution> findAll();
}
