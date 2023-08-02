package com.example.demo.document;

import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("orders")
@Data
public class Order {
	@Indexed
	private Integer category;

	private String description;

	private Integer userId;
}
