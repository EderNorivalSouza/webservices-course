package com.coursewebservices.webservices.repositories;

import com.coursewebservices.webservices.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
