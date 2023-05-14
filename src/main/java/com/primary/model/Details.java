package com.primary.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Details")
public class Details {
	@Id
	private String id;
	private String name;
	private String age;
	private String mailId;
	private String mobileNumber;
}
