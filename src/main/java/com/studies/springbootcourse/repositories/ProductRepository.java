package com.studies.springbootcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studies.springbootcourse.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>  {

}
