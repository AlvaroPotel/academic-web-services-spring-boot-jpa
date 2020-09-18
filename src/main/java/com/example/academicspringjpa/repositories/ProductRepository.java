package com.example.academicspringjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.academicspringjpa.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
