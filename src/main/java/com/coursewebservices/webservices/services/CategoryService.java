package com.coursewebservices.webservices.services;

import com.coursewebservices.webservices.entities.Category;
import com.coursewebservices.webservices.entities.User;
import com.coursewebservices.webservices.repositories.CategoryRepository;
import com.coursewebservices.webservices.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> category = categoryRepository.findById(id);
        return category.get();
    }

}
