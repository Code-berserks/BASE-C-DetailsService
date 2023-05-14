package com.primary.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.primary.model.Details;

public interface DetailsDAO extends MongoRepository<Details, String>{
	
}
