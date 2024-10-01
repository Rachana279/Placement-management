package com.project.PlacementManagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;


@Service
@Transactional

public class RachanaCompanyService {
	@Autowired
	
	private RachanaCompanyRepository repository;
	
	public List<RachanaCompany>listAll(){
		return repository.findAll();
	}

	public RachanaCompany get(Integer id) {
		return repository.findById(id).get();
	}
	public RachanaCompany save(RachanaCompany rachanaCompany) {
		return repository.save(rachanaCompany);
		
		
	}
	public void delete(Integer id) {
		repository.deleteById(id);
		
	}
}

