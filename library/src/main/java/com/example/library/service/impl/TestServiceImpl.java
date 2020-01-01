package com.example.library.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.library.entity.Test;
import com.example.library.repository.TestRepository;
import com.example.library.service.TestService;
@Component
public class TestServiceImpl implements TestService {

	@Autowired
	private TestRepository testRepository;
	
	@Override
	public List<Test> useCustomQuery(Test test) {
		// TODO Auto-generated method stub
		
		List<Test> testData = testRepository.findAll((root, query, criteriaBuilder) -> {
			// TODO Auto-generated method stub
			List<Predicate> predicates = new ArrayList<Predicate>();
			
			if(test.getTestId() != 0) {
				predicates.add(criteriaBuilder.equal(root.get("testId"), test.getTestId()));
				
			}
			if(test.getTestMock() != null) {
				predicates.add(criteriaBuilder.equal(root.get("testMock"), test.getTestMock()));
				
			}
			if(test.getTestName() != null) {
				predicates.add(criteriaBuilder.equal(root.get("testName"), test.getTestName()));
				
			}
			if(test.getTestPlan() != null) {
				predicates.add(criteriaBuilder.equal(root.get("testPlan"), test.getTestPlan()));
				
			}
			if(test.getTestVariable() != null) {
				predicates.add(criteriaBuilder.equal(root.get("testVariable"), test.getTestVariable()));
				
			}

			
			
			
			return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
		});
		return testData;
	}

}
