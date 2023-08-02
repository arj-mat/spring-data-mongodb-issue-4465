package com.example.demo.document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("users")
@Data
public class User {
	@Id
	private Integer userId;

	private String firstname;
	private String lastname;
}
