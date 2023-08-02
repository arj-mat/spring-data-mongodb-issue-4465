package com.example.demo.repository;

import com.example.demo.document.UserOrderView;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserOrderViewRepository extends MongoRepository<UserOrderView, String> {
	UserOrderView findByUserId(Integer id);

	@Aggregation(
			{
					"{"
					+ "    $match: {"
					+ "      userId: ?0,"
					+ "    },"
					+ "  }",
					"{"
					+ "    $group: {"
					+ "      _id: '$userId',"
					+ "      descriptions: {"
					+ "        $first: {"
					+ "          $concatArrays:"
					+ "            '$userOrders.description',"
					+ "        },"
					+ "      },"
					+ "    },"
					+ "  }"
			}
	)
	Object findOrderDescriptionsByUserId(Integer id);
}
