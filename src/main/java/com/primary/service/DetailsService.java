package com.primary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.primary.dao.DetailsDAO;
import com.primary.model.Details;

@Component
public class DetailsService {
	
	@Autowired
	private DetailsDAO detailsDAO;

	public void save(Details details) {
		detailsDAO.save(details);
	}

}
