package com.studies.springbootcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studies.springbootcourse.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> /*tipo da entidade (OrderItem) e tipo da chave (Long(id))*/ {

}
