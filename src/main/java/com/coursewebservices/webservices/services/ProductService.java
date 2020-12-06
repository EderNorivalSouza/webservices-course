package com.coursewebservices.webservices.services;

import com.coursewebservices.webservices.entities.Category;
import com.coursewebservices.webservices.entities.Product;
import com.coursewebservices.webservices.repositories.CategoryRepository;
import com.coursewebservices.webservices.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> category = productRepository.findById(id);
        return category.get();
    }

}
