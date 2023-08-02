package com.example.demo.document;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Document("users_orders_view")
@Data
public class UserOrderView {
	private Integer userId;
	private Set<Order> userOrders;
}
