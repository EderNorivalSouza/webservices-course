package com.coursewebservices.webservices.repositories;

import com.coursewebservices.webservices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
