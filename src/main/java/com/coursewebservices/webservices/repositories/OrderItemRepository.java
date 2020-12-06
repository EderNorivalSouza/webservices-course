package com.coursewebservices.webservices.repositories;

import com.coursewebservices.webservices.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
