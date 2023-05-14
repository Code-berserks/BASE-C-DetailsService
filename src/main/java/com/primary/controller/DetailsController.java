package com.primary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.primary.model.Details;
import com.primary.service.DetailsService;

@Controller
public class DetailsController {
	
	@Autowired
	private DetailsService detailsService;
	
	@PostMapping("/details")
	ResponseEntity<Details> createDetail(@RequestBody Details details) {
		detailsService.save(details);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
