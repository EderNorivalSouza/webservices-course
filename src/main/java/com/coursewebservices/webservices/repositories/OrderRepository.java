package com.coursewebservices.webservices.repositories;

import com.coursewebservices.webservices.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
