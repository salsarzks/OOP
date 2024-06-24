package com.byun.finalexam.models.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.byun.finalexam.models.entities.Product;

public interface ProductRepo extends CrudRepository<Product, Long> {

    List<Product> findByNameContains(String name);
}
