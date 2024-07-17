package com.studies.springbootcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studies.springbootcourse.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>  {

}
