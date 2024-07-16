package com.studies.springbootcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studies.springbootcourse.entities.User;

public interface UserRepository extends JpaRepository<User, Long> /*tipo da entidade (User) e tipo da chave (Long(id))*/ {

}
