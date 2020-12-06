package com.coursewebservices.webservices.repositories;

import com.coursewebservices.webservices.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
