package com.kks.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kks.rest.entity.Product;

public interface ProductRepository extends JpaRepository<Product, String>{

}
