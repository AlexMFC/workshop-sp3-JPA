package com.studies.springbootcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studies.springbootcourse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>  {

}
