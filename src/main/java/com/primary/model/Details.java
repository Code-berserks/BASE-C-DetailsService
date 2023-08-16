package com.primary.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Details")
public class Details {
	@Id
	public String id;
	public String name;
	public String age;
	public String mailId;
	public String mobileNumber;
}
